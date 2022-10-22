package collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String>  lst  = new ArrayList<String>();
		lst.add("Rohit");
		lst.add("Virat");
		lst.add(null);
		lst.add("Ranveer");
		lst.add("Ranbir");
		lst.add(null);
		lst.add("Virat");
		lst.add("Rohit");
		
	/*	Iterator itr = lst.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		/*for( String y :lst)
		{
			System.out.println(y);
		}
*/
		int arrayListSize = lst.size();
		System.out.println(arrayListSize);
		
		for(int i=0;i<arrayListSize;i++)
		{
			System.out.println(lst.get(i));
		}
	}

}
