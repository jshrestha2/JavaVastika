package assignments;

import java.util.Scanner;

public class Assgn10 {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		System.out.println("enter u:");
		double u = entry.nextDouble();
		
		System.out.println("enter t:");
		double t = entry.nextDouble();
		
		System.out.println("enter a:");
		double a = entry.nextDouble();
		double s = u*t + 0.2*a*t*t;
		System.out.println("s= " + s);
	}

}
