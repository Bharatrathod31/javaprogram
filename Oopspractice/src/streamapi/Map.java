package streamapi;

import java.util.Arrays;
import java.util.List;

public class Map {
	public static void main(String[] args) {
		List<Integer> marks=Arrays.asList(10,50,75,35,25,20,40);
		List<Integer> passed = marks.stream().filter(i -> i>35).toList();
		System.out.println(passed);
		
		List<Integer> passed1= marks.stream().filter(i -> i < 35)
				.map(j-> j+5).toList();
		System.out.println(passed1);
	}


}
