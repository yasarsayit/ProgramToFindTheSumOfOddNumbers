package java101;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		int total = 0;
		
		do {
			System.out.print(" Enter number : ");
			n = scanner.nextInt();
			
			if((n % 2 == 0) && (n % 4 == 0)) {
				
				total += n;
				
			}
		}while(n % 2 == 0);
		
		System.out.print(" Total : " + total);

	}

}
