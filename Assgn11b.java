package assignments;

import java.util.Scanner;

public class Assgn11b {

	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.println("enter a:");//5
		int a = val.nextInt();
		
		System.out.println("enter b:");//6
		int b = val.nextInt();
		
		//for after swapping
		
		a = a+b;//11
		b = a-b;//11-5=6
		a = a-b;//11-6==5
		
		System.out.println("after swapping a:" + a);
		System.out.println("after swapping b:" + b);
	}

}
