package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class StreamFilterfindanyorElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Customer> customerList = Arrays.asList(
				new Customer("Same", 30),
				new Customer("Tame", 31),
				new Customer("Lame", 32),
				new Customer("Fame", 33),
				new Customer("Game", 34));
		
	//1.Find Any
	Customer customer = customerList.stream() // Convert to list to Stream
		                        .filter(x ->"Lame".equals(x.getName())) //Filter
			                              .findAny() // if it finds then return
				                                   .orElse(null);
		
	System.out.println(customer.getName());
	System.out.println("+++++++++++++++++++++++++++");
	
	
	//3.didnt Find Any
	Customer customer1 = customerList.stream() // Convert to list to Stream
            .filter(x ->"Muaaz".equals(x.getName())) //Filter
                      .findAny() // if it finds then return
                               .orElse(null);

	System.out.println(customer1);
	

	//4. Filter with multiple conditions
	Customer customer3 = customerList.stream() // Convert to list to Stream
            .filter(x ->"Fame".equals(x.getName())&& 33==x.getAge()) //Filter with name and age
                      .findAny() // if it finds then return
                               .orElse(null);
	
	System.out.println(customer3.getName()+" "+ customer3.getAge());
	
	}
	
	
	
	

}
