package com.dv.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		System.out.println(hs.add(10));
		hs.add(20);
		hs.add(30);
		System.out.println(hs.add(10));
		System.out.println("===HasSet===");
		System.out.println(hs);
		Iterator<Integer> iterator = hs.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("===LinkedHasSet===");
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(20);
		lhs.add(30);
		lhs.add(10);
		lhs.add(15);
		System.out.println(lhs);
		Iterator<Integer> iterator2 = lhs.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println("===Treeset===");
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(15);
		ts.add(10);
		ts.add(40);
		ts.add(25);
		System.out.println(ts);
		Iterator<Integer> iterator3 = ts.iterator();
		while (iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}

	}

}
