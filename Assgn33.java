package assignments;

import java.util.Scanner;

public class Assgn33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] array = new int[5];
		for (int i =0; i<array.length; i++) {
			System.out.println("elements are:");
			array[i] = input.nextInt();}
		int  temp ;
			for (int i = 0; i < array.length; i++) 
	        {
	            for (int j = i + 1; j < array.length; j++) { 
	                if (array[i] > array[j]) 
	                {
	                    temp = array[i];
	                    array[i] = array[j];
	                    array[j] = temp;
	                }
	            }
	        }
	        System.out.print("Array Elements in Ascending Order: ");
	        for (int i = 0; i < array.length - 1; i++) 
	        {
	            System.out.print(array[i] + ", ");
	        }
	        System.out.print(array[array.length - 1]);
			
		}

	}



