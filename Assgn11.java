package assignments;

import java.util.Scanner;

public class Assgn11 {

	public static void main(String[] args) {
		//11a)
		Scanner temp = new Scanner(System.in);
		System.out.println("enter a:");
		int a = temp.nextInt();
		
		System.out.println("enter b:");
		int b = temp.nextInt();
		
		//for after swapping
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("after swapping a:" + a);
		System.out.println("after swapping b:" + b);

	}

}
