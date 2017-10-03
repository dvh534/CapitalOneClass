package com.capitalone.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO {
	// public static void main(String[] args) throws FileNotFoundException {
	// try {
	// FileOutputStream fos = new FileOutputStream("abc.txt");
	// fos.write(2);
	//
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }

	public static void main(String[] args) {
		bufferedWriter();
		bufferedReader();
	}

	private static void bufferedReader() {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
			System.out.println(br.read());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private static void bufferedWriter() {
		// TODO Auto-generated method stub
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
			bw.write("yoo");
			bw.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}