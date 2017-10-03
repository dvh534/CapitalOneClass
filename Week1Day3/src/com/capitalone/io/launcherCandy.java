package com.capitalone.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.invoke.SerializedLambda;

import javax.swing.DefaultRowSorter;

public class launcherCandy {
	
	
	public static void main(String[] args) {
	
		CandyBar jagga = new CandyBar("SAMMY",10);
		
		SerializeCandyBar(jagga);
		deSerializeCandyBar();
	
		
	}

	private static void deSerializeCandyBar() {
		// TODO Auto-generated method stub
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("jaggaa.txt"))){	
			System.out.println(is.readObject());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void SerializeCandyBar(CandyBar candy) {
		// TODO Auto-generated method stub
		try {
			System.out.println("this rock");
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("jaggaa.txt"));
			os.writeObject(candy);
			os.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	
}