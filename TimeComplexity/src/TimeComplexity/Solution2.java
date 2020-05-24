package TimeComplexity;

import java.util.Scanner;
public class Solution2 {
	
	static Scanner sc=new Scanner(System.in);
	
		
		public static int solution(int[] a) {
			

			int missing = 1; 

		    // check numbers one by one
		    for (int i = 0; i < a.length; i++) {
		        if (a[i] == missing) {    // we found the missing number !
		            missing = a[i]+1;    // add +1 and keep checking
		        }
		    }
		   // System.out.println("The missing element in the array is:"+missing);
		   return(missing);
		}
	  
		
		
	
	
	
	

	public static void main(String[] args) 
	{
		
		//inputs taken
		System.out.println("Enter the size of the array:");
	    int array=sc.nextInt();
	   
		int a[]=new int[array];
		
		System.out.println("Enter elements in the formed array according to its size");
		for(int i=0;i<a.length-1;i++)
		{
			 a[i]=sc.nextInt();
		}
		
		
		int missing=solution(a);
		
		System.out.println("The missing element in the array is:");
		System.out.println(missing);
		
		
		
		
	}
}







