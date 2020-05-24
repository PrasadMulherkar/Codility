package TimeComplexity;

import java.util.Scanner;

public class Solution3 
{
   static Scanner sc=new Scanner(System.in);
	
	public static int solution(int[] a)
	
	{
	    
	   
	   int sumright = 0;
	    int sumleft = 0;
	    int diff;

	    for (int i =1;i<a.length;i++)
	        sumright += a[i];   //adding values of elements 

	    sumleft = a[0];
	    diff =Math.abs(Math.abs(sumright)+Math.abs(sumleft));

	    for (int p=1; p<a.length; p++)
	    {
	        if (Math.abs(sumleft - sumright)<diff)
	            diff = Math.abs(sumleft - sumright);
	        sumleft += a[p];
	        sumright -=a[p];
	    }
	    return (diff);  
	
	   
	   
	   
	   
		
		
		
		
	}
	
	
	public static void main(String[] args) 
	{
		//inputs taken
		System.out.println("Enter the size for the array:");
		int array=sc.nextInt();
		int[] a=new int[array];
		
		System.out.println("Enter the elements in the array:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		int diff=solution(a);
	    
		
		System.out.println("The least difference between the sum of the elements is: ");
		System.out.println(diff);
		
		
		
		
	}

}
