package Core;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String x[][] = new String[3][5];
		
		System.out.println(x.length); //gives total number of rows	
		System.out.println(x[0].length); // gives total number of columns
		
		//1st Row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		//2nd Row
		x[1][0] = "F";
		x[1][1] = "G";
		x[1][2] = "H";
		x[1][3] = "I";
		x[1][4] = "J";
		
		//3rd Row
		x[2][0] = "K";
		x[2][1] = "L";
		x[2][2] = "M";
		x[2][3] = "N";
		x[2][4] = "O";
		
		System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		System.out.println(x[0][4]);
		
		//print all 2d values
		for(int row=0;row<x.length;row++) 
			for(int col=0;col<x[0].length;col++)
			{
				System.out.println("----------");
				System.out.println(x[row][col]);
			}
			
		
		
	}

}
