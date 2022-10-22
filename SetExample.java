package collection1;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {
		HashSet<Integer> obj = new HashSet<Integer>();
		obj.add(55);
		obj.add(25);
		obj.add(null);
		obj.add(75);
		obj.add(null);
		obj.add(55);
		obj.add(75);
		obj.add(null);
		obj.add(75);
		
		Iterator<Integer> itr = obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}
	

}
