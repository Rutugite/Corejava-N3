package org.tnsif.arraysdemo;

public class ArrayProgram {

	public static void main(String[] args) {
		float arr[]= {1f,3f,5f,6f};
		int arr1[]= new int[5];
		arr1[0]=41;
		arr1[1]=76;
		arr1[2]=45;
		arr1[3]=36;
		arr1[4]=96;
		System.out.println(arr1[3]);
		System.out.println(arr[1]);
		System.out.println(arr.getClass().getName());
	}

}
