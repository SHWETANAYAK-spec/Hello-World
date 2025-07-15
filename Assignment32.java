package assignment;

import java.util.ArrayList;

public class Assignment32 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(24);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(23);
		a1.add(22);
	
		ArrayList<Integer> a2=new ArrayList<Integer>(a1);
		a2.addAll(a);
		System.out.println("Combined Arraylist is "+a2);


	}

}
