package com.capitalone.grabage;

public class GarbagecollectionsExamples {

	public static void main(String[] args) {
		Trash trashA = new Trash(1);
		Trash trashB = new Trash(2);

		trashA = null;

		System.gc();
	}


	
}