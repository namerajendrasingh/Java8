package com.raj.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.raj.modal.Employee;

/**
 * @author Raj Singh
 */

public class QuestionAnswerOnStreams {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(10);
		emp.setName("Raj");
		emp.setDesignation("Sr. Software Engineer");
		emp.setSalary(147000.00);
		emp.setAddress("Gurugram");
		
		Employee emp1 = new Employee();
		emp1.setId(10);
		emp1.setName("Vaishnavi");
		emp1.setDesignation("Doctor");
		emp1.setSalary(180000.00);
		emp1.setAddress("Rishikesh");
		
		Employee emp2 = new Employee();
		emp2.setId(10);
		emp2.setName("Sarika");
		emp2.setDesignation("Teacher");
		emp2.setSalary(240000.00);
		emp2.setAddress("Rishikesh");
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(emp);
		employeeList.add(emp1);
		employeeList.add(emp2);
		
		//Find Employee with MAX Salary
		
		Employee maxSalary = employeeList.stream().max(Comparator.comparingDouble(e-> e.getSalary())).orElse(null);
		System.out.println(maxSalary.getName()+ " Getting Highest Salary Which is : = "+maxSalary.getSalary() + " Rs.");
		
		//Sort Employee with  Salary in Natural Order Asc
		employeeList.stream()
		            .sorted(Comparator.comparingDouble(e-> e.getSalary()))
		            .collect(Collectors.toList())
		            .forEach(e-> {System.out.println(e.getName()+" Salary is = "+e.getSalary()+" Rs.");});
		
		//Sort Employee with  Salary in Descending Order
				employeeList.stream()
				            .sorted(Comparator.comparingDouble(e-> e.getSalary()))
				            .collect(Collectors.toList())
				            .forEach(e-> {System.out.println(e.getName()+" Salary is = "+e.getSalary()+" Rs.");});;
		// Group By Department
		   employeeList.stream()
				                .collect(Collectors.groupingBy(Employee::getAddress, Collectors.counting()))
	                            .forEach((address, totalcount) -> {
	                               System.out.print(address + ":"+totalcount);
	                               //empList.forEach(e -> System.out.print( e.getName()+", "));
	                               System.out.println();
	                              });
		   Map<String, List<String>> namesByAddress = employeeList.stream().peek(e->System.out.println("debugging"+e.getName()))
				    .collect(Collectors.groupingBy(Employee::getAddress,
				        Collectors.mapping(Employee::getName, Collectors.toList())
				    ));
		   namesByAddress
		   .forEach((add,list)->{
			          System.out.print(add+":");
			          list.forEach(name-> System.out.print(name+", "));
			          System.out.println();
			      
		   });

	}

}
