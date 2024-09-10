import java.util.Scanner;

public class GteaterInThree {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a = cs.nextInt();
		System.out.println("Enter the Second Number: ");
		int b = cs.nextInt();
		System.out.println("Enter the Third Number: ");
		int c = cs.nextInt();
		
		if(a>=b && a>=c)  
			System.out.println(a+" is the largest Number");  
			
		else if (b>=a && b>=c)  
			System.out.println(b+" is the largest Number");  
		
		else  
			System.out.println(c+" is the largest number");  
		cs.close();
	}
}
