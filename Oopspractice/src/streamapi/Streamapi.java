package streamapi;

import java.util.Arrays;
import java.util.List;

public class Streamapi {
	
	public static void  main(String[] args) {
		List<Integer>list = Arrays.asList(5,10,14,35,20);
		/*List<Integer> filteredlist=list.stream().filter(i-> i % 2 ==0 ).toList();
		System.out.println(filteredlist);
		
		List<Integer>list1 =Arrays.asList(10,20,40,3,5,6,7);
		List<Integer>filteredlist1=list1.stream().filter(i -> i % 2 != 0).toList();
		System.out.println(filteredlist1);
		
		// Map : it is used to transform the data
		// syntax: Stream mappedStream = originalStram.map(element -> /* tansformation function */);
		// multiply by two each element in the list
		List<Integer> transformList =list.stream()
				.map(i -> i*2)
				.toList();
		System.out.println(transformList); 
		
		
		
	}

}
