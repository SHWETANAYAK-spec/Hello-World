package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment31 {

	public static void main(String[] args) {
		List<String>  a=new 	ArrayList<String>();
		List<String>  synclist= Collections.synchronizedList(a);
		synclist.add("Shweta");
		synclist.add("Nayak");
		synchronized(synclist) {
			for(String b:synclist) {
				System.out.println(b);
			}
		}

	}

}
