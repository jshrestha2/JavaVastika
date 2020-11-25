package assignments;

import java.util.Scanner;

public class Assign16 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("enter:");
		int n = num.nextInt();
		
		if (n%2==0) {
			System.out.println("its even");
		} else {
			System.out.println("its odd");
		}

	}

}
