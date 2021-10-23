package Core;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "100";
		System.out.println(x + 20);
		
		//Data conversion string to integer
		int y =Integer.parseInt(x);
		System.out.println(y + 20 + " : This is Integer");
		
		//Integer , Double , Character , Boolean
		String d = "12.33";
		double myDouble = Double.parseDouble(d);
		System.out.println(myDouble + " : This is Double ");
		
		
		//String to boolean
		String k = "true";
		boolean B = Boolean.parseBoolean(k);
		System.out.println(B);
		
		//int to String
		int j = 200;
		String s = String.valueOf(j);
		System.out.println("int to String : " + s);
		
		
		//convert mix character to integer // NumberformarException
		String 	u = "100A";
		Integer.parseInt(u);
		
		
	}

}
