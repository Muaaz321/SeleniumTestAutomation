package Core;

public class TestBankInterfacexample {

	public static void main(String[] args) {

		HSBCBank rajagiriya = new HSBCBank();
		
		System.out.println(rajagiriya.min_Bal);
		rajagiriya.debit();
		rajagiriya.credit();
		rajagiriya.carLoan();
		rajagiriya.educationLoan();
		rajagiriya.mutualLoan();
		rajagiriya.Lending();
		
		
		//dynamic polymorphism
		
		
	}

}
