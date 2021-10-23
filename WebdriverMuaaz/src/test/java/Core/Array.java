package Core;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// One dimension array - static array
		
		
		//Disadvantage 
		//1. Size is fixed , this is statis array
		//2. stores only similar data types
		// to overcome above issue , we have to use object array we use Collection, Arraylist , hastable
		
		int i[]= new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[2]);
		//System.out.println(i[4]); // trying to access i[4] , 
								  // will trigger Exception java.lang.ArrayIndexOutOfBoundsException:
		
		System.out.println(i.length);// length of array
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		
		//double array
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=23.44;
		d[2]=44.22;
		
		for(int q=0;q<d.length;q++) {
			System.out.println(d[q]);
		}
		
		
		//char array
		char c[]=new char[3];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		
		for(int w=0;w<c.length;w++) {
			System.out.println(c[w]);
		}
		
		
		//boolean array
		boolean b[] = new boolean[3];
		b[0] = true;
		b[1] = false;
		
		for(int a=0;a<b.length;a++) {
			System.out.println(b[a]);
		}
		
		//String array
		String td[] = new String[3];
		td[0] = "Hello";
		td[1] = "name";
		td[2] = "mohideen";
		
		for(int r=0;r<td.length;r++) {
			System.out.println(td[r]);
		}
		
		
		
		//Object array - use to different data types
		Object myobj[] = new Object[5];
		myobj[0] = 1;
		myobj[1] = "Muaaz";
		myobj[2] = 35.99;
		myobj[3] = "a";
		myobj[4] = 22;
		
		for(int k=0;k<myobj.length;k++) {
			System.out.println("This is from Object Array " + myobj[k]);
		}
		
	
	}

}
