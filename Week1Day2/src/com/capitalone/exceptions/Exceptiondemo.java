package com.capitalone.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptiondemo {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("method1");
		}
		finally {
			System.out.println("method1rock");			
		}
	
	}

	public static void method1() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();

	}

	public static void method2() throws IOException {
		// TODO Auto-generated method stub
		throw new FileNotFoundException();
	}

	public static void method3() throws RuntimeException {
		// TODO Auto-generated method stub

	}

}
