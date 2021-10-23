package Core;

public class ConstructorConcept {
	
	//default contructor
	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}

	//single parameter constructor
	public ConstructorConcept(int i) {
		System.out.println("single parameter constructor");
		System.out.println(i);
	}
	
	public ConstructorConcept(int i,int j) {
		System.out.println("two parameter constructor");
		System.out.println("the value of : " +i);
		System.out.println("the value of : "+j);
	}
	
	//can we overload the constructor ? yes we can as above
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//always create hidden constructor even commented the default one
		ConstructorConcept concept = new ConstructorConcept();
		ConstructorConcept concept1 = new ConstructorConcept(10);
		ConstructorConcept concept2 = new ConstructorConcept(40,70);
		
	}

}
