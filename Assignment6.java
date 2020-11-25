package assignments;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.println("length=");
		int l = val.nextInt();
		System.out.println("width=");
		int w = val.nextInt();
		System.out.println("height=");
		int h = val.nextInt();
		System.out.println("radius=");
		int r = val.nextInt();
		double pi = 3.14;
		int triangle = l+w+h;
		int rect = (l+w)*2;
		double circle = 2*pi*r;
		System.out.println("perimeter of triangle = " + triangle);
		System.out.println("perimeter of rectanglr = " + rect);
		System.out.println("perimeter of circle = "+ circle);
	}

}
