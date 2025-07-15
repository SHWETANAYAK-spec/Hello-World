package assignment;
//Assignment 16
public class Calculator {
	
	public void add() {
		System.out.println("We are performing addition");
	}
	public static void add(int a,int b) {
		System.out.println("Sum is " +(a+b));
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add();
		add(5,5);

	}

}
