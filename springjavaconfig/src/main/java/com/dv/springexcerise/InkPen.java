package com.dv.springexcerise;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class InkPen implements Pen {
	String colour;
	String price;

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("From Inkpen");

	}

	@Override
	public String toString() {
		return "InkPen [colour=" + colour + ", price=" + price + "]";
	}

	/*
	 * @Override public Pen write() { // TODO Auto-generated method stub Pen inkPen
	 * = new InkPen(); return inkPen;
	 * 
	 * }
	 */

}
