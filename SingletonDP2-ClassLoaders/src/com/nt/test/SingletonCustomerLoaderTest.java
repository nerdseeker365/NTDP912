package com.nt.test;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import com.nt.sdp.Printer;

public class SingletonCustomerLoaderTest {

	public static void main(String[] args)throws Exception {
      Printer p1=null;
      Object p2=null,p3=null;
      URLClassLoader loader1=null,loader2=null;
      
      p1=Printer.getInstance();
      
      //create Custom ClassLoader and Load Singleton class and also create obj using reflection api
      loader1=new URLClassLoader(new URL[] {new URL("file:/F:/Worskpaces/DesignPatterns/NTDP912/SingletonDP2-ClassLoaders/sdp.jar")},p1.getClass().getClassLoader());
      //loader1=new URLClassLoader(new URL[] {new URL("file:/F:/Worskpaces/DesignPatterns/NTDP912/SingletonDP2-ClassLoaders/sdp.jar")},null);
      Class<?> clazz1=loader1.loadClass("com.nt.sdp.Printer");
      Method method=clazz1.getDeclaredMethod("getInstance",new Class[] {});
      p2= method.invoke(null);
      
      
		 //create Custom ClassLoader and Load Singleton class and also create obj using reflection api
		   loader2=new URLClassLoader(new URL[] {new URL("file:/F:/Worskpaces/DesignPatterns/NTDP912/SingletonDP2-ClassLoaders/sdp.jar")},loader1);
		    Class<?> clazz2=loader2.loadClass("com.nt.sdp.Printer");
		    Method method1=clazz2.getDeclaredMethod("getInstance",new Class[] {});
		   p3= method1.invoke(null);
      
      System.out.println(p1.hashCode()+"  "+p2.hashCode()+" "+p3.hashCode());
      
      


	}

}
