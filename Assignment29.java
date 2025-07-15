package assignment;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment29 {

	public static void main(String[] args) {
		Collection<Integer> a=new ArrayList<Integer>();
a.add(1);
a.add(2);
a.add(3);
a.add(4);
System.out.println(a);
Collection<Integer> b=new ArrayList<Integer>();
b.add(5);
b.add(7);
System.out.println(b);
b.addAll(a);
System.out.println("Elements of a will be added to b" +b);
}

}
