package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompreArraywithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Compare two arrays
		List<String> list1 = Arrays.asList("Arun","Jake","Muaaz","Alan","Rock","Michael");
		List<String> list2 = Arrays.asList("Jane","Kamal","Muaaz","John","Rock","Peter","Jack");
		
		System.out.println("List 1 : " + list1);
		System.out.println("List 2 : "+ list2);

		//Convert List1 to Stream
		Stream<String> stream1 = list1.stream();
		
		//Use filter From stream api to filter list2 items
		Stream<String> stream2=stream1.filter(list2::contains);
		
		// Convert result stream to list
		List<String> commonList = stream2.collect(Collectors.toList());
		
		System.out.println("Filtered List " + commonList);
		
		
		
	}

}
