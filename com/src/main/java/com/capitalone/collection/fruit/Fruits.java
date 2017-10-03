package com.capitalone.collection.fruit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.capitalone.beans.Fruitname;


public class Fruits {
	
	public static void main(String[] args) {
		List<Fruitname> fn = new ArrayList<Fruitname>();
		fn.add(new Fruitname("Apple", 10, "green"));
		fn.add(new Fruitname("Orange", 11, "null"));
		fn.add(new Fruitname("Berry", 01, "red"));
		fn.add(new Fruitname("Berry", 02, "re1d"));
	
		
		Collections.sort(fn);

		System.out.println(fn);
	}

}