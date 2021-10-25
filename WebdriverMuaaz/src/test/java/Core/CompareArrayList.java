package Core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","C","D","E","F"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B","A","C","D","E"));
		Collections.sort(l3);
		
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		
		
		//Compare two arraylist , find out the additional element
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
//		l4.removeAll(l5);
//		System.out.println(l4);
		
		//find out the missing element
//		l5.removeAll(l4);
//		System.out.println(l5);

		
		//Common elements in 
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("JAVA","Python","Ruby","C#","JS"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("JAVA","Python","Ruby","C#","PHP"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);
	}

}
