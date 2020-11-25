package assignments;

import java.util.Scanner;

public class Assgn36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] array = new int[3];
		for (int i =0; i<array.length; i++) {
			System.out.println("elements are:");
			array[i] = input.nextInt();}
		for (int i =0; i < array.length-1; i++) {
			for(int j =i+1; j < array.length; j++) {
				if ( array[i] == array[j]) {
					System.out.println("this duplicate: " + array[j]);
				}
			}
		}
		

	}

}
