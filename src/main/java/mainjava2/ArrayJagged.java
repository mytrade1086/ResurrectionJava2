package mainjava2;

public class ArrayJagged {

	public static void main(String[] args) {

		int[][] array2D = new int[3][]; // while declaring, first dimension is mandatory

		array2D[0] = new int[3];
		array2D[1] = new int[2];
		array2D[2] = new int[1];

		int num = 0;
		for (int row = 0; row < array2D.length; row++) {

			for (int col = 0; col < array2D[row].length; col++) {
				array2D[row][col] = num++;
			}

		}
		
		
		
		for(int[] some:array2D) {
			
			for(int j:some) {
				
				System.out.print(" "+j);
			}
			
			System.out.println("");
		}

	}
//	 0 1 2
//	 3 4
//	 5
//	
	
}
