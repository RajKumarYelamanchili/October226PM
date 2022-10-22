package collection1;

import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1, "one");
		ht.put(2, "two");
		ht.put(3, "three");
		ht.put(4, "a");
		ht.put(5, "a");
		
		ht.put(1, "abc");
		
		System.out.println(ht);
		
		

	}

}
