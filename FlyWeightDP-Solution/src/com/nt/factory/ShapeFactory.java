package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.shape.Circle;
import com.nt.shape.Shape;
import com.nt.shape.ShapeType;
import com.nt.shape.Square;

public class ShapeFactory {
	private  static Map<String,Shape>  cacheMap=new HashMap();
	private static Shape shape;
	
	public synchronized static  Shape   getInstance(String shapeType) {
	  if(!cacheMap.containsKey(shapeType)) {	
		  if(shapeType.equalsIgnoreCase(ShapeType.CIRCLE)) {
			  shape=new Circle();
		  }
		  else if(shapeType.equalsIgnoreCase(ShapeType.SQUARE)) {
			  shape=new Square();
		  }
		  else {
			  throw new IllegalArgumentException("invalid shape");
		  }
		  cacheMap.put(shapeType, shape);
	  }
	  return cacheMap.get(shapeType);
			  
	}//method
}//class
