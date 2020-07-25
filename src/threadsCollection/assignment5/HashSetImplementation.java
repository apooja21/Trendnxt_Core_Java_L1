package threadsCollection.assignment5;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplementation {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Frodo");
		hs.add("Sam");
		hs.add("Merry");
		hs.add("Pippin");
		
		Iterator<String> itr=hs.iterator();  
		while(itr.hasNext()){  
		   System.out.println(itr.next());  
		}  

	}

}
