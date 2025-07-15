package assignment;



class Overridingmethod{
	public  void add() {
		
		 System.out.println("Parent class");
	 }
}

public class Assignment25 extends Overridingmethod{
	public  void add() {
		//super.add();
		 System.out.println("child class");
	 }

	public static void main(String[] args) {
		Assignment25 a=new Assignment25();
		a.add();
	}
	

}
