package com.nt.test;

import com.nt.factory.ShapeFactory;
import com.nt.shape.Shape;
import com.nt.shape.ShapeType;

public class FlyWeightDPTest {

	public static void main(String[] args) {
		int SIZE=50;
		Shape circle=null,square=null;
		System.out.println("Drawing Circle....");
		for(int i=1;i<=SIZE;++i) {
			circle=ShapeFactory.getInstance(ShapeType.CIRCLE);
			circle.draw(i+1,"red","dotted");
		}
		System.out.println("-------------------------------");
		System.out.println("Drawing Square....");
		for(int i=1;i<=SIZE;++i) {
			square=ShapeFactory.getInstance(ShapeType.SQUARE);
			square.draw(i+1,"green","thickline");
		}
		
		Integer val1=Integer.valueOf(10);
		Integer val2=Integer.valueOf("20");
		System.out.println(val1+ "  "+val2);
		System.out.println(System.identityHashCode(val1)+" "+System.identityHashCode(val2));
		

	}

}
