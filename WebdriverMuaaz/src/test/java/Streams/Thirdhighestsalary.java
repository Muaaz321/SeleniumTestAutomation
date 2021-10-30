package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Thirdhighestsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<Employee> empList = Arrays.asList(
				new Employee("Same", 300000.00),
				new Employee("Tame", 100000.00),
				new Employee("Lame", 240000.00),
				new Employee("Fame", 550000.00),
				new Employee("Game", 790000.00));

		Optional<Double> salary=	empList.stream()
				.map(ele -> ele.getSalary())
				.sorted(Comparator.reverseOrder())
				.skip(2)
				.findFirst();

		System.out.println(salary.get());


		//Ascending and Descending Order
		//Ascending Order

		List<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");

		List<String> sortedList	    =	fruits.stream()
				.sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedList);

		List<String> sortedList1	=	fruits.stream()
				.sorted((o1,o2) ->o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(sortedList1);
		
		List<String> sortedList3	=	fruits.stream()
				.sorted().collect(Collectors.toList());
		System.out.println(sortedList3);


		//Descending Order

		List<String> dessortedList	    =	fruits.stream()
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(dessortedList);

		List<String> dessortedList1	=	fruits.stream()
				.sorted((o1,o2) ->o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(dessortedList1);




	}

}
