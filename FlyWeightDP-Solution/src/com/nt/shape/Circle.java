package com.nt.shape;

public class Circle implements Shape {
	private String label;
	
	public Circle() {
		label="circle";
		System.out.println("Circle:0-param constructor");
	}

	@Override
	public void draw(int radius, String fillColor, String lineStyle) {
		System.out.println("Drawing  "+label+" Shape having "+radius+" with fillColor:"+fillColor+" and line style"+lineStyle);
	}

}
