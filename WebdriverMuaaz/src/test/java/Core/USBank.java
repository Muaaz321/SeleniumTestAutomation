package Core;

public interface USBank {
	
	int min_Bal = 100;
	
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//Only method declaration
	//no method body - only method prototype
	//In interface we can declare variables , nature its static
	//Variables values cant change - constant / final in nature
	//No static method in interface
	//No main method
	//Abstract in nature - we cant create object
	
	

}
