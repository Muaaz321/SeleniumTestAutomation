package Core;

public class CallbyValAndCallbyRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallbyValAndCallbyRef myObj = new CallbyValAndCallbyRef();
		
		int x = 40;
		int z = 50;
		
		myObj.testSum(x, z); //Call by value OR pass by value, values are passing copies
		
		
		myObj.p = 50;
		myObj.q = 60;
		
		myObj.swap(myObj);
		
		//After swap
		System.out.println(myObj.p);
		System.out.println(myObj.q);
		
		
	}

	
	public int testSum(int a ,int b) {
		
		a = 5;
		b = 2;
		
		int c = a + b;
		return c;
	}
	
	
	//call by reference
	public void swap(CallbyValAndCallbyRef t) {
		int temp;
		
		temp = t.p; //temp = 50
		t.p = t.q; // t.p = 50
		t.q = temp;
		
	}
	
	
}
