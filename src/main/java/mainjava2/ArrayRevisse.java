package mainjava2;

import java.util.Arrays;

public class ArrayRevisse {
	public static void main(String[] args) {
		int[] marks = { 10, 20, 30, 50, 11 };
		System.out.println(marks[0]); // 10
		System.out.println(marks[4]);// 11
		// System.out.println(marks[5]);
		System.out.println(marks.length);// 5 length gives physical lengh of array
		// System.out.println(marks[5]); //java.lang.ArrayIndexOutOfBoundsException: 5

		int[] marks2 = { 10, 20, 30, 50, 11 };
		System.out.println(marks.equals(marks2)); // false
		System.out.println(marks == marks2); // false
		System.out.println(Arrays.equals(marks, marks2)); // true
		System.out.println(Arrays.equals(marks2, marks)); // true

		int[] marks3 = { 310, 20, 30, 50, 11 };
		System.out.println(Arrays.equals(marks, marks3)); // false

		int[][] demo = { { 00, 01, 02 }, { 10, 11, 12 }, { 20, 21, 22 } };
		int[][] demo2 = { { 00, 01, 02 }, { 10, 11, 12 }, { 20, 21, 22 } };
		System.out.println(Arrays.equals(demo, demo2)); /// note that it fails when 2d array
		System.out.println(Arrays.deepEquals(demo, demo2));// true

		int[][] demo3 = { { 04, 01, 02 }, { 10, 11, 12 }, { 20, 21, 22 } };
		System.out.println(Arrays.deepEquals(demo, demo3));// false

		int[][] demo4 = { { 00, 01, 02, 04 }, { 10, 11, 12 }, { 20, 21, 22, 23 } };
		// Looping 2d array
		System.out.println(demo4.length);// 3
		for (int i = 0; i < demo4.length; i++) {
			for (int j = 0; j < demo4[i].length; j++) {
				System.out.print(" " + demo4[i][j]);
			}
			System.out.println();
		}

		//2nd Approach
		for (int[] a : demo4) {
			System.out.println("From for each " + Arrays.toString(a));
		}

		//3rd Approach
		for (int[] a : demo4) {
			for (int b : a) {
				System.out.print(" double for each "+b);
			}	
			System.out.println(" ");		
		}

	}
}
