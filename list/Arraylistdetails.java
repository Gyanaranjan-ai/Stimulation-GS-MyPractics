package list;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Arraylistdetails {
	public static void main(String[] args) {
		
		// Create a list of employees
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "milu", "2012", 40000));
		list.add(new Employee(4, "Gyana", "2013", 50000));
		list.add(new Employee(3, "Ranjan", "2019", 20000));
		list.add(new Employee(2, "sahoo", "2010", 90000));

		//sort by id
		List<List<Employee>> l=Arrays.asList(list);	
		List<Employee> collect = l.stream().flatMap(e->e.stream()).sorted((e1,e2)->Integer.compare(e1.getEmployeeId(),e2.getEmployeeId())).collect(Collectors.toList());
		for(Employee em :collect) {
			System.out.println(em);
		}
//		collect.forEach(System.out::println);
		List<String> collect3 = l.stream().flatMap(e->e.stream()).map(e->e.getEmployeeName()).collect(Collectors.toList());
		System.out.println(collect3);
//		Collections.sort(list, (e1, e2) -> e1.getEmployeeId() - e2.getEmployeeId());
//		System.out.println(list);
		Collections.sort(list,(a,b)->a.getEmployeeName().compareToIgnoreCase(b.getEmployeeName()));
		// Sort the employees by name in ascending order
		l.stream().flatMap(e->e.stream()).map(e->e.getEmployeeName()).sorted().collect(Collectors.toList());
		List<Employee> list1=l.stream().flatMap(e->e.stream()).sorted((e1,e2)->e1.getEmployeeName().compareToIgnoreCase(e2.getEmployeeName())).collect(Collectors.toList());
		for (Employee employee : list1) {
			System.out.println(employee);
		}
		// Sort the employees by salary in descending order
//		employees.sort((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()));

	list.sort((e1,e2)->Long.compare(e1.getSalary(), e2.getSalary()));
	System.out.println(list);
		
		// get employee name
	
	for (Employee employee : list1) {
		System.out.println(employee.getEmployeeName());
	}
		// get employee name who got salary 3000
	
	for (Employee employee : list1) {
		if(employee.getSalary()==20000) {
			System.out.println(employee.getEmployeeName());
		}
	}
		//only salary sorting wise
		List<Long> collect2 = l.stream().flatMap(e->e.stream()).map(e->e.getSalary()).sorted().collect(Collectors.toList());
		System.out.println(collect2+"salary");
	
	
		//only employee name sorting wise
		 Collections.sort(list, Comparator.comparing(Employee::getEmployeeName, String.CASE_INSENSITIVE_ORDER));
		//get the employee name whose name id bob 
		//get the employee id whose id =2
		//get the employee name whose name start with b
		 
		 //salary less than 100
		 List<Employee> collect4 = l.stream().flatMap(e->e.stream()).filter(e->e.getSalary()>100).collect(Collectors.toList());
		 
		 System.out.println(collect4+"  __-");
		 
		 l.stream().flatMap(e->e.stream()).filter(e->e.getEmployeeName().contains("e")).collect(Collectors.toList());
	for (Employee employee : list1) {
		if(employee.getEmployeeName().startsWith("R")) {
			System.out.println(employee.getEmployeeName());
		}
	}
}}