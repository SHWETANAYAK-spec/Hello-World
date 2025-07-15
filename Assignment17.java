package assignment;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		int r;
		double pi=3.14;
		Scanner s=new Scanner(System.in);
 System.out.println("Enter the radius");
 r=s.nextInt();
 double area=pi*r*r;
 System.out.println("area of circle is "+area);
 s.close();

	}

}
