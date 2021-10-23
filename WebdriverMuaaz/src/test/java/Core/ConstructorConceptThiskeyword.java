package Core;

public class ConstructorConceptThiskeyword {
	
	String nameq;
	int ageq;
	
	public ConstructorConceptThiskeyword(String name,int age) {
		
//      this used to not to confuse local and global variable
//		this.name = name;
//		this.age = age;
		
		nameq = name;
		ageq = age;
		
		System.out.println(name);
		System.out.println(age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorConceptThiskeyword object = new 
				ConstructorConceptThiskeyword("Muaaz",40);

	}

}
