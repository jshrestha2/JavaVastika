package assignments;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner num = new Scanner (System.in);
		System.out.println("Princple:");
		int p = num.nextInt();
		System.out.println("time:");
		int t = num.nextInt();
		System.out.println("rate:");
		int r = num.nextInt();
		double SI = (p*t*r)/100;
		System.out.println("Simple Interest = " + SI);
		
		
		

	}

}
