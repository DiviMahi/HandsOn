package com.dv.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Divi");
		map.put(2, "keerthi");
		map.put(3, "Arthi");
		// GETTING VALUE FOR GIVEN KEY

		System.out.println(map.get(1));

		// GETTING KEY AND VALUE USING KEYSET

		Set<Integer> keySet = map.keySet();
		for (Integer n : keySet) {
			System.out.println(n + ":" + map.get(n));
		}
		// GETTING KEY AND VALUE USING ENTRYSET
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
