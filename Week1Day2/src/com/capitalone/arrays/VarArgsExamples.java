package com.capitalone.arrays;

public class VarArgsExamples {
	public static void main(String[] args) {
		add(1,2,3,4,5,7,8,9);
		}
	
	private static void add(int i, int j, int...theRest) {
	
		// TODO Auto-generated method stub
		
//		int sum = i+j;
//		for (int k =0; k < theRest.length; k++){
//			System.out.println(theRest[k]);
//			sum += theRest[k];
//		}
//		System.out.println(sum);
//
//	

	
	int sum = 0;
	for (int  k = theRest.length -1;  k>0;  k--){
		System.out.println(theRest[k]);
		sum += theRest[k];
	}
	System.out.println(sum);

}
}
