package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamFilterMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Customer> customerList = Arrays.asList(
				new Customer("Same", 30),
				new Customer("Tame", 31),
				new Customer("Lame", 32),
				new Customer("Fame", 33),
				new Customer("Game", 34));
		
		String name = 	customerList.stream()
					.filter(x-> "Game".equals(x.getName()))
					.map(Customer::getName)
					.findAny()
					.orElse(null);
	
	
		System.out.println(name);
		

	}

}
