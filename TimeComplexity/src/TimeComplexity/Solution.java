package TimeComplexity;
import java.util.Scanner;



public class Solution {
	
	
		static Scanner sc=new Scanner(System.in);
		
		    public int solution(int x, int y, int d) {
		    	 int p = 0;
		    	 //while frog has not reached the destination
		         while (x < y){
		             p++;     //increasing the number of jumps
		             x = x + d;
		         }
		         return p;
		  //  System.out.println("The number of jumps required are:"+p);
		     }
		 
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		//taken inputs here
		System.out.println("Enter at what position number the frog is currently at ?");
		
		int x=sc.nextInt();
		
		System.out.println("Enter the position number at which the frog wants to reach or further");
		int y=sc.nextInt();
		
		System.out.println("Enter the distance frog covers in a single jump");
		int d=sc.nextInt();
		
		Solution s =new Solution();
		int jumps=s.solution( x, y, d);
		
		
		
		System.out.println("The number of jumps required are:");
		System.out.println(jumps);
		

	}

}
