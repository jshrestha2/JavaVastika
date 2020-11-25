package assignments;

import java.util.Scanner;

public class Assgn18 {

	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.println("a = ");
		int a = val.nextInt();
		System.out.println("b= ");
		int b = val.nextInt();
		System.out.println("c= ");
		int c = val.nextInt();
		
		if (a>b && a>c) {
		System.out.println("a is largest");
		}else if (b>a && b>c) {
			System.out.println("b is largest");
		} else if (c>a && c>b) {
			System.out.println("c is largest");
		}
		
		System.out.println("end");
	}

}
