package Core;

// in interface we cant have implemented classes
// but in abstract we can have implemented classes and not implemented as well
abstract class Dog{
	String breed;
	
	public void bark() {
		System.out.println("Bark!");
	}
	
	public abstract void sniff(); 
}


 class chihuaha extends Dog {
	 
	 public void sniff() {System.out.println("Snifff !!!!!");}
	
}

public class Abstracction {

	public static void main(String[] args) {
		
		//Dog g =  new Dog();
		chihuaha c = new chihuaha();
		c.bark();
		c.sniff();
	}
}
