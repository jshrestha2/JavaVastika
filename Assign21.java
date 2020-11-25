package assignments;

import java.util.Scanner;

public class Assign21 {

	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.println("choose day num:");
		int day = val.nextInt(); //exp is the choice
		switch (day) {
		case 1:
			System.out.println("its sunday");
			break; //have to write break, if not will run the next code as well
			
		case 2:
			System.out.println("its monday");
			break;
			
		case 3:
			System.out.println("its tuesday");
			break;
			
		case 4:
			System.out.println("its wednsday");
			
		case 5:
			System.out.println("its thurs");
			break;
			
		case 6:
			System.out.println("its friday");
			break;
			
		case 7:
			System.out.println("its saturday");
			
			default:
				break;
		}

	}

}
