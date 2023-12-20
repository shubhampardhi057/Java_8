package com.prowings.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ram",20,"Ayodya");
		Employee e2 = new Employee("Naam",30,"Kashi");
		Employee e3 = new Employee("Sham",40,"Dwarka");
		Employee e4 = new Employee("Dham",30,"Banaras");
		Employee e5 = new Employee("Krishna",20,"Dwarka");
		
		
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		
//		empList.stream()
//				.filter(e -> e.getCity().equals("Dwarka"))
//				.forEach(e -> System.out.println("\n\n\t "+ e));
		
		
		
//		empList.stream()
//				.filter(e -> e.getAge() > 20)
//				.forEach(e -> System.out.println("\n\n\t "+ e));
		
		
//		List<Employee> list = empList.stream()
//									 .filter(e -> e.getCity().equals("Dwarka"))
//									 .collect(Collectors.toList());
//		
//		System.out.println("Employee from Dwarka is \n\n "+list);
		
		empList.stream()
				.map(e -> e.getAge()+10)
				.forEach(e -> System.out.println("\n\n\t " + e));
		
		
	}

}
