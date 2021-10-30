package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> productList = Arrays.asList("Macbook","iPhone","Shoes","Battery Charger","Bat");
		
		//System.out.println(productList);
		
		productList.forEach(ele -> System.out.println(ele));
		
		List<String> result=productList.stream()
							.filter(ele -> !ele.equals("Shoes"))
									.collect(Collectors.toList());

		result.forEach(ele->System.out.println(ele));
	}

}
