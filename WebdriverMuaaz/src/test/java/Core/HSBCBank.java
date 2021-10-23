package Core;

public class HSBCBank implements USBank , BrazilBank { // we are achieving multiple inheritance 
	//IS - a relationship
	
	//if a class implmenting any interface ,
	// then its mandatory to define/override all the methods of Interface.
	
	
	//Override from USBANK
	public void credit() {
		System.out.println("hsbc -- credit");
	}
	
	public void debit() {
		System.out.println("hsbc -- debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc -- transfer");
	}
	
	//Overriding from BrazilBank
	public void mutualLoan() {
		System.out.println("hsbc -- mutualLoan");
	}
	
	public void Lending() {
		System.out.println("hsbc -- lending");
	}
	//Own method
	public void educationLoan() {
		System.out.println("hsbc -- educationLoan");
	}
	
	public void carLoan() {
		System.out.println("hsbc -- carLoan");
	}

}
