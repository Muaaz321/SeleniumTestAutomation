package Core;

public class B extends A{
	
	public B() {
		//super(70);
		//super("Muaaz");
		//super(10 , "Second Constructor");
		
		System.out.println("This is B default constructor");
	}
	
	public B(int a) {
		super(a);
	}
	
	public B(String m) {
		super(m);
	}
	
	public B(int q , String p) {
		super(q,p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B object = new B();
		B object1=new B(10);
		B object2=new B("Muaaz");
		B object3=new B(20,"Tester");
		

	}

}
