package com.nt.test;

import java.util.ArrayList;

public class ClassLoaderTest {

	public static void main(String[] args) {
		
		/* ArrayList al=new ArrayList();
		
		System.out.println("ArrayList class class Loader::"+al.getClass().getClassLoader());
		System.out.println("ArrayList class class Loader's parent class Loader::"+al.getClass().getClassLoader().getParent().getClass().getName());*/
		
        
		System.out.println("ClassLoaderTest's ClassLoader::"+ClassLoaderTest.class.getClassLoader().getClass().getName());
        System.out.println("ClassLoaderTest's ClassLoader's Parent::"+ClassLoaderTest.class.getClassLoader().getParent().getClass().getName());
		

	}

}
