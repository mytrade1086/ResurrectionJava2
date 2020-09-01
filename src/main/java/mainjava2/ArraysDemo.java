package mainjava2;

import java.util.Arrays;

public class ArraysDemo {

	
	public static void main(String[] args) {
		
		int [] test= {33,2,144};
		
		//#1 PRint Array
		System.out.println(test.toString());//[I@15db9742
		//##Works with !D array
		System.out.println(Arrays.toString(test));//[33, 2, 144]
		
		
		int [][] Array2d= {{12,34},{21,23,34}};
		
		System.out.println(Array2d.toString());//[[I@6d06d69c
		//##### Wont work with 2d arrays. Use DeepString instead
		System.out.println(Arrays.toString(Array2d));//[[I@7852e922, [I@4e25154f]
		
		int [][] Array2d1= {{12,34},{21,23,34}};
		System.out.println(Arrays.deepToString(Array2d1));//[[12, 34], [21, 23, 34]]
		
		
		
		//#2 Sort /array
		Arrays.sort(test);
		System.out.println(Arrays.toString(test)); //[2, 33, 144]
		

		
	}
}
