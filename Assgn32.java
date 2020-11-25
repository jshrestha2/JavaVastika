package assignments;

import java.util.Scanner;

public class Assgn32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] array = new int[5];
	
		
		for (int i =0; i<array.length; i++) {
			System.out.println("enter elements:");
			array[i] = input.nextInt();}
		int sum = 0;
		for (int i =0; i<array.length; i++) {
			
	
			sum = sum + array[i];
			System.out.println("sum of array:" + sum);
		}
	}

}


