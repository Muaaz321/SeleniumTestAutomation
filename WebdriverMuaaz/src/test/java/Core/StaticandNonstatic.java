package Core;

public class StaticandNonstatic {

	//Global variable , available with some conditions , control by static
	
	String name = "Muaaz"; // non static variable
	static int age = 37; // static variable
	
	public static void main(String[] args) {
	
		//How to call static methods and variables
		// 1. direct calling
		Sum();
		
		//2.calling by classroom
		StaticandNonstatic.Sum();
		
		System.out.println(age);
		System.out.println(StaticandNonstatic.age);

		
		//how to call non static methods and variables
		StaticandNonstatic obj = new StaticandNonstatic();
		obj.sendMail();
		System.out.println(obj.name);
		
		
		//can i access static methods by using object reference? Yes
		obj.Sum();
		System.out.println(obj.name);
		
	}
	
	
	//non Static method
	public void sendMail() {
		System.out.println("Sending mail ....");
	}
	
	
	//Static method
	public static void Sum() {
		System.out.println("Sum .... ");
	}

}
