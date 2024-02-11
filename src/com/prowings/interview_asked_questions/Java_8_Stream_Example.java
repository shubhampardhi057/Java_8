package com.prowings.interview_asked_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java_8_Stream_Example {
	
	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(new Person("Ram",25),new Person("Sham",30),new Person("Naam",22),new Person("Dham",28));
		
//		1- Filtering - get persons older than 25
		
		List<Person> olderThan25 = persons.stream()
										  .filter(person -> person.getAge() > 25)
										  .collect(Collectors.toList());
		System.out.println(olderThan25);
		
//		2- Mapping - Extract names of persons
		
		List<String> names = persons.stream()
									 .map(Person::getName)
									 .collect(Collectors.toList());
		System.out.println(names);
		
//		3- Sorting - sort persons by age
		
		List<Person> sortedByAge = persons.stream()
				 						   .sorted((p1,p2) -> Integer.compare(p1.getAge(),p2.getAge()))
				 						   .collect(Collectors.toList());
		System.out.println(sortedByAge);
		
//		4- Aggregation - Calculate average age of persons
		
		double averageAge = persons.stream()
									.collect(Collectors.averagingInt(Person::getAge));
		System.out.println(averageAge);
		
//		5- Grouping - Group persons by age
		
		 System.out.println("Grouped by age:");
	        persons.stream()
	                .collect(Collectors.groupingBy(Person::getAge))
	                .forEach((age, group) -> System.out.println(age + ": " + group));

//	    6- Reducing- Get the oldest person
	        persons.stream()
	        		.reduce((p1,p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
	        		.ifPresent(oldestPerson -> System.out.println("Oldest Person :"+oldestPerson));
	}

}
