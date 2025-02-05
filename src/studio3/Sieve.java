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
				
			}
			for (j = 0; j < n; j++) {
				for (int k = 1; k < n ; k++) {
					if (j + j * k) % j == 0; //2 + 2k, 3 + 3k
			}
		
		
            System.out.print(range[i] + " ");
            
          
		}
		} 
		
				
	}


