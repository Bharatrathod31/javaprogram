package com.oops.streampi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) {
		int[] intArray= {3,2,4,1,6,7,4,1,5};
		IntStream intStream=Arrays.stream(intArray);
		
		intStream.filter(no->no%2==0)
			.filter(number->number>2)
				.filter(no->no>4)
			.forEach(no->System.out.println(no));
		
		Student[] studentArray = new Student[5];
		
		studentArray[0] = new Student(1,"Megha",20);
		studentArray[1] = new Student(2,"Anikta",21);
		studentArray[2] = new Student(3,"Laxmi",23);
		studentArray[3] = new Student(4,"Vishal",22);
		studentArray[4] = new Student(5,"Rahul",21);
		
		Stream<Student> studentStream=Arrays.stream(studentArray);
		
		studentStream.map(e->e.getName())
			.filter(name->name.charAt(1)=='a')
			.forEach(name->System.out.println(name));
		
		Stream<Student> studentStream1=Arrays.stream(studentArray);
		studentStream1.map(r->r.getRolllNo())
			.filter(rollNo->rollNo % 2 ==1)
			.forEach(rollNo->System.out.println(rollNo));
		
	}
	


}
