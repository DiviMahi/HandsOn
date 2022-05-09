package com.dv.springexcerise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Primary
// @Qualifier
public class BallPen implements Pen {
	String colour;
	String price;

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("From Ball pen");

	}

	@Override
	public String toString() {
		return "BallPen [colour=" + colour + ", price=" + price + "]";
	}

	/*
	 * @Override public Pen write() { Pen ballPen = new BallPen(); return ballPen;
	 * 
	 * }
	 */

}
