package chocolatesByNumbers;

import java.util.Scanner;

public class Solution {
	
	//Solution function that returns the no. of chocolates ate.
	public static int solution(int N, int M) {
		return N/gcdByDivision(N, M);
	}
	
	//Function to calculate greatest common divisor
	public static int gcdByDivision(int N, int M) {
		if(N%M == 0) {
			return M;
		}
		else {
			return gcdByDivision(M, N%M);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Takes input of N and M
		System.out.println("Enter value of N and M :- ");
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//Stores the solution and display
		int noOfChocolatesAte = solution(N, M);
		System.out.println("No. of Chocolates ate :- "+noOfChocolatesAte);
		
		sc.close();
	}

}
