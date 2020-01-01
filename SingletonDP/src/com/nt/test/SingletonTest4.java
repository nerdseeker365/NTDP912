package com.nt.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.nt.sdp.Printer;

public class SingletonTest4 {

	public static void main(String[] args)  throws Exception {
		Printer pu1=null,pu2=null;
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		// Get Printer class object
		pu1=Printer.getInstance();
		/*		try {
				//perform Seraialization
				oos=new ObjectOutputStream(new FileOutputStream("e:/file.ser"));
				oos.writeObject(pu1);
				System.out.println("Serialization is completed....");
				oos.flush();
				oos.close();
				}
				catch(IOException ioe) {
					ioe.printStackTrace();
				} 
			*/
			try {
				//perform Deserialization
				ois=new  ObjectInputStream(new FileInputStream("e:/file.ser"));
				pu2=(Printer) ois.readObject();
				System.out.println("DeSerialization is completed");
				ois.close();
				System.out.println(pu1.hashCode()+"   "+pu2.hashCode());
				
			}
			catch(IOException ioe) {
				ioe.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}//main
}//class
