package assignment;

public class Assignment9 {

	public static void main(String[] args) {
		int a=20;
		int b=20;
		if(a<b && a==10)
		{
			System.out.println("1st if block");
		}
		if(a<b || a==10)
		{
			System.out.println("2nd if block");
		}
		if(!(a<b && a==10))
		{
			System.out.println("3rd if block");
		}
		if(!(a<b || a==10))
		{
			System.out.println("4th if block");
		}
		else {
			System.out.println("Else block");
		}
	}
}
