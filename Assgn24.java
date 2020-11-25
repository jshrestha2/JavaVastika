package assignments;

import java.util.Scanner;

public class Assgn24 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("enter");
		int n = num.nextInt();
		int fact = 1;
		for(int i=1;i<=n;i++){    
		      fact=fact*i; 
		      System.out.println("Factorial of "+n+" is: "+fact);  
	}
	}
}
