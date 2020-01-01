package com.nt.shape;

public class Square implements Shape {
	private String label;
	
	public Square() {
		label="square";
		System.out.println("Square:0-param constructor");
	}

	@Override
	public void draw(int length, String fillColor, String lineStyle) {
		System.out.println("Drawing  "+label+" Shape having "+length+" with fillColor:"+fillColor+" and line style"+lineStyle);
	}

}
