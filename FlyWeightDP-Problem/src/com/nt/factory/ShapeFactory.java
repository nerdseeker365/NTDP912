package com.nt.factory;

import com.nt.shape.Circle;
import com.nt.shape.Shape;
import com.nt.shape.ShapeType;
import com.nt.shape.Square;

public class ShapeFactory {
	
	public  static  Shape   getInstance(String shapeType) {
		Shape shape=null;
		  if(shapeType.equalsIgnoreCase(ShapeType.CIRCLE)) {
			  shape=new Circle();
		  }
		  else if(shapeType.equalsIgnoreCase(ShapeType.SQUARE)) {
			  shape=new Square();
		  }
		  else {
			  throw new IllegalArgumentException("invalid shape");
		  }
		  
		  return shape;
			  
			  
	}//method
}//class
