package threadsCollection.assignment4;

import java.util.HashMap;

public class HashMapImplementation {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Ram","6565378989");
		hm.put("Vinay","9867584647");
		hm.put("legolas","8756575858");
		System.out.println(hm.get("Ram"));
		System.out.println(hm.get("Vinay"));
		System.out.println(hm.get("Legolas"));
	}

}
