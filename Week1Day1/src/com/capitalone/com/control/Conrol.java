package com.capitalone.com.control;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Conrol {


	public static void main(String[] args) {
		switchExample(1);
		ternary(190);
	}

	public static void forloop() {
		for (int i = 0; i < 10; i++)
			System.out.println(i);

	}

	public static void whilloop() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		String choice = null;
		while (!"quit".equals(choice))
			System.out.println("enter ");
		choice = scan.nextLine();
		System.out.println(choice.equals("quit"));

	}

	public static void switchExample(int i){
		switch(i){
		case 1:
			System.out.println("case1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 5:{
			System.out.println("case 5");
		}
			
		}
		
	}
	
	public static void ternary(int i){
		System.out.println("this is ternanry " + ((i > 100) ? "large" : "small"));
	}
	

}
