package assignments;

import java.util.Scanner;

public class Assgn8 {

	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		System.out.println("enter temp in F:");
		double f = temp.nextDouble();
		System.out.println("enter temp in C:");
		double C = temp.nextDouble();
		double celcius = (f/5)*9+32;
		System.out.println("celcius is" + celcius);
		double farhen = (C-32)*5/9;
		System.out.println("FARHEN is" + farhen);
			//formulas might be wrong	
		
		
		

	}

}
