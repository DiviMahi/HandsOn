package com.dv.collections;

import java.util.Arrays;

public class MyArrayList {
	private Object[] array;
	private int size = 3;
	int position;

	public MyArrayList(int size) {
		super();
		this.size = size;
		array = new Object[size];

	}

	public MyArrayList() {
		super();
		array = new Object[size];

	}

	public void add(Object o) {
		if (position >= size) {
			IncreaseSize();
		}
		array[position] = o;
		position++;

	}

	public void IncreaseSize() {
		this.size = ((size * 3) / 2) + 1;
		Object[] temp = new Object[size];
		for (int j = 0; j < array.length; j++) {
			temp[j] = array[j];

		}
		array = temp;

	}

	public void test() {
		System.out.println(Arrays.toString(array));
	}

}
