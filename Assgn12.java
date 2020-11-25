package assignments;

import java.util.Scanner;

public class Assgn12 {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		System.out.println("enter name:");
		String name = entry.nextLine(); //LINE THIS WILL GIVE US TO PUT TWO INPUTS 
		
		System.out.println("enter nationality:");
		String nationality = entry.next();
		
		System.out.println("AGE:");
		int age = entry.nextInt();
		
		System.out.println("name is " + name + " nationality is " + nationality + " age is " + age);
		

	}

}
