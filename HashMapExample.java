package collection1;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		  HashMap<Integer,String> hm = new HashMap<Integer,String>();
		  hm.put(101, "Ravi");
		  hm.put(102, "Anil");
		  hm.put(103, "Sunil");
		  hm.put(104, "Rohan");
		  
		  
		  hm.remove(102);
		//  System.out.println(hm);
		  hm.put(null, "Anand");
		  hm.put(null, "Suman");
		  hm.put(109, null);
		  hm.put(199, null);
		  hm.put(209, null);
		  System.out.println(hm);
		  
	}

}
