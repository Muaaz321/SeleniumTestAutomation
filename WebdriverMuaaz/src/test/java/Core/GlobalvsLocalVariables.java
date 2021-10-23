package Core;

public class GlobalvsLocalVariables {

	//Global variables
	String name = "Muaaz";
	int age = 20;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;//Local variable
		System.out.println("Local Variable = "+i);
		
		
		GlobalvsLocalVariables object = new GlobalvsLocalVariables();
		System.out.println("Global Name = " +object.name);
		System.out.println("Global Age = "+object.age);
			
	}
	
	
	public void Sum() {
		int i=34;
		int k=45;
		
	}

}
