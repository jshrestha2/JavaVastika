package assignments;

import java.util.Scanner; //operation sum and average

public class Assignment3 {

	public static void main(String[] args) {
		Scanner mynumber = new Scanner (System.in);//scanner will give us option to input our own variable
		System.out.println("My first numb:");
		int x= mynumber.nextInt();//declaring first variable
		System.out.println("My second numb:");
		int y= mynumber.nextInt(); //declaring second
		int sum = x+y; //declaring sum as a int
		
		System.out.println("sum of " + x + " "+  "and" + y + ":" + sum);
		double average = (double)(x+y)/2; //declaring average as a double because it could be fractional number as well
		System.out.println("The average is :" + average);
				

	}

}
