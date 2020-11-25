package assignments;

import java.util.Scanner;

public class Assign20 {

	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.println("choose choice num:");
		int expression = val.nextInt(); //exp is the choice
		switch (expression) {
		case 1:
			System.out.println("its addition");
			break; //have to write break, if not will run the next code as well
			
		case 2:
			System.out.println("its substraction");
			break;
			
		case 3:
			System.out.println("its multiplication");
			break;
			
		case 4:
			System.out.println("its divis");
			
			default:
				break;
		}
		} 
		

}
