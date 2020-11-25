package assignments;

import java.util.Scanner;

public class Assgn23 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("enter num:");
		int n = num.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("sum is "+ sum);
	}

	}


