package com.dv.springexcerise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
// @Qualifier
public class SketchPen implements Pen {
	String colour;
	String price;

	@Qualifier
	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("From Sketch pen");
	}

	@Override
	public String toString() {
		return "SketchPen [colour=" + colour + ", price=" + price + "]";
	}

	/*
	 * @Override
	 * 
	 * public Pen write() { // TODO Auto-generated method stub Pen sketchPen = new
	 * SketchPen(); return sketchPen;
	 * 
	 * }
	 */
}
