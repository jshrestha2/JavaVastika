package assignments;

import java.util.Scanner;

public class Assign14 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("x:");
		int x = num.nextInt();
		System.out.println("y:");
		int y = num.nextInt();
		
		if (x == y) {
			System.out.println("they same");
			
		}else if (x >y) {
			System.out.println("x is big");
		}
		else if( x<y) {
			System.out.println("y is big");
	}
	}
}
