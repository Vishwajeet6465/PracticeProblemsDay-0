// This program runs the sum of n natural numbers with in the given range 

import java.util.Scanner;

public class SumNnums {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the down range: ");
		int a = cs.nextInt();
		System.out.println("Enter the up range: ");
		int b = cs.nextInt();
		int sum = 0;
		
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		
		System.out.println("Sum of Natural numbers with in given range is: "+ sum);
		cs.close();
	}
}
