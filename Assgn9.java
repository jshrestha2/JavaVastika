package assignments;

import java.util.Scanner;



public class Assgn9 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("enter pound:");
		double p = num.nextDouble();
		double c = 0.453592 * p;
		System.out.println(p + "pound is " + c + "kg");
		
	}

}
