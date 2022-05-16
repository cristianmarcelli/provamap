package it.prova.provamap.test;

import java.util.Map;
import java.util.HashMap;

public class TestProvaMap {
	public static void main(String[] args) {

		Map hash_map = new HashMap();
		
		//put()
		Map<Integer,String> primaMappa = new HashMap<Integer,String>();
		primaMappa.put(1, "Chennai");
		primaMappa.put(2,"Bangalore");
		primaMappa.put(3, "Delhi");
		
		System.out.println(primaMappa);
		
		//remove()
		primaMappa.remove(1, "Chennai");
		
		System.out.println(primaMappa);
		
		//clear()
		primaMappa.clear();
		
		System.out.println(primaMappa);
	}

}
