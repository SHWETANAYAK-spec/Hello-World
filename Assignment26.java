package assignment;

class SuperCallingStatementProgram{
SuperCallingStatementProgram(int a){
System.out.println("1st c");

	}
}
class SuperCallingStatementParent extends SuperCallingStatementProgram{
		SuperCallingStatementParent(int b){
			super(1);
			System.out.println("2nd c");
		}
		SuperCallingStatementParent(double c){
		super(3);
			System.out.println("3rd c");
		}
		}
public class Assignment26 extends SuperCallingStatementParent{

Assignment26(){
	super(1.1);
	System.out.println("4st c");
}
	public static void main(String[] args) {
		Assignment26 a=new Assignment26 ();

	}

}
