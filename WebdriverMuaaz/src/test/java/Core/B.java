package Core;

public class b extends A{
	
	public b() {
		//super(70);
		//super("Muaaz");
		//super(10 , "Second Constructor");
		
		System.out.println("This is B default constructor");
	}
	
	public b(int a) {
		super(a);
	}
	
	public b(String m) {
		super(m);
	}
	
	public b(int q , String p) {
		super(q,p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		b object = new b();
		b object1=new b(10);
		b object2=new b("Muaaz");
		b object3=new b(20,"Tester");
		

	}

}
