package commonPrimeDivisor;

import java.util.Scanner;

public class Solution {
	static Scanner sc = new Scanner(System.in);

	//Function to take input in array
	public static int[] inputArray(int[] A) {
		System.out.println("Enter elements :- ");
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		return A;
	}
	
	//Solution function that counts the no. of common prime divisor
	public static int solution(int[] A, int[] B) {
        int count = 0;
        for(int i=0; i<A.length; i++) {
            if(hasSamePrimeDivisors(A[i], B[i])){
                count++;    
            } 
        }
        return count;
    }
	
	//Function to check the equality of prime divisors
	public static boolean hasSamePrimeDivisors(int a, int b) {
		//First find gcd of given no.s
	    int gcdValue = gcd(a,b);
	    
	    //Second find gcd of given no.s with gcdValue
        int gcdA;
        int gcdB;
        
        while(a!=1) {
            gcdA = gcd(a,gcdValue);
            if(gcdA==1)
                break;
            a = a/gcdA;
        }
        
        while(b!=1) {
            gcdB = gcd(b,gcdValue);
            if(gcdB==1)
                break;
            b = b/gcdB;
        }
        
        if(a != 1 || b != 1) {
        	return false;
        }
        else {
        	return true;
        }        
	}
	
	public static int gcd(int a, int b) {
	    if(a % b == 0) {
	    	return b;
	    }
	    else {
	    	return gcd(b, a%b);
	    }
	}
	
	public static void main(String[] args) {
		System.out.println("Enter no. of elements in array :- ");
		int Z = sc.nextInt();
		int A[] = new int[Z];
		int B[] = new int[Z];
		A = inputArray(A);
		B = inputArray(B);
		
		int K = solution(A, B);
		System.out.println("No. of common prime divisors :- "+K);
		sc.close();
	}
}
