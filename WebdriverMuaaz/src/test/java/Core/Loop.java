package Core;

import java.util.Iterator;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Disadvantage of while loop is
		//if you dont give increment or decrmental
		// it will go infinite
		
		//print to 1 to 10
		int i=1; // initialization
		while(i<=10) // conditional
		{
			System.out.println(i); // print
			i = i+1; // Incremental or Decremental
		}
		
		System.out.println(" +++++++++++ ");
		
		//print 1 to 10
		for(int j=1;j<=10;j++) {//initialization , condition , increment
			System.out.println(j);
		}
		
		System.out.println(" +++++++++++ ");
		//print 10 to 1
		for(int n=10;n>=1;n--) {
			System.out.println(n);
		}
		
		System.out.println(" +++++++++++ ");
		
		int m = 1;
		int k=m++; // post increment 
		
		System.out.println(m);
		System.out.println(k);
		
		
		System.out.println(" +++++++++++ ");
		
		int a=1;
		int b=++a; // pre increment
		
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println("+++++++++++++");
		
		int y=2;
		int x=y--; // post decrement
		
		System.out.println(2);
		System.out.println(x);
		
		System.out.println("+++++++++++++");
		
		int g=2;
		int h=--g; // pre decrement
		
		System.out.println(g);
		System.out.println(h);
		
		
	}

}
