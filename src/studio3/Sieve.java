package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Sieve of Eratosthenes!");
		System.out.println("What is the value for n?");
		int n = in.nextInt();
		
		int[] range = new int[n];
		int j = 1;
		
		for (int i = 0; i < n; i++) {
			range[i] = j;
			j++;
			if (j % 2 == 0) {
				j = 0;
			}
            System.out.print(range[i] + " ");
            
          
		}
		} 
		
				
	}


