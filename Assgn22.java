package assignments;

import java.util.Scanner;

public class Assgn22 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("enter:");
		int n = num.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			int multiply = n * i;
			
			System.out.println(n+ "*" + i +"=" + multiply);
		}
	}

}
