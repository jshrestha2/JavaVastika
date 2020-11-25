package assignments;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner value = new Scanner (System.in);
		System.out.println("length=");
		int l = value.nextInt();
		System.out.println("width=");
		int w = value.nextInt();
		System.out.println("height=");
		int h = value.nextInt();
		System.out.println("radius=");
		int r = value.nextInt();
		final double pi = Math.PI; //used final coz the value is constant/fixed, also instaed of using pi value 3.14 we used Math.PI coz in the library the valur is already there
		int triangle = l*w*h;
		int rect = w*l;
		double circle = pi*r*r; //alternate pi * Math.pow(r,2)
		System.out.println("area of triangle = " + triangle);
		System.out.println("area of rectanglr = " + rect);
		System.out.println("area of circle = "+ circle);
		
	}

}
