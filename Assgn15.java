package assignments;

import java.util.Scanner;

public class Assgn15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter: ");
		
		int a = input.nextInt();
		
		if (0<=a && a<128) {
			char b =  (char) a;
			System.out.println("ASCII CODE OF" + a + "is" + b);
		}
System.out.println("exit");
	}

}
