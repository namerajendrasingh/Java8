package com.raj.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice Johnsona", "HR", 55000, 29));
        list.add(new Employee("Bob Smith", "Development", 90000, 35));
        list.add(new Employee("Carol Lee", "Finance", 78000, 32));
        list.add(new Employee("David Kim", "Sales", 65000, 28));
        list.add(new Employee("Eva Sharma", "Development", 88000, 30));
        list.add(new Employee("Frank Wilson", "Marketing", 72000, 33));
        list.add(new Employee("Grace Chena", "Finance", 81000, 41));
        list.add(new Employee("Hassan Ahmed", "Sales", 61000, 27));
        list.add(new Employee("Irene Scott", "HR", 56000, 36));
        list.add(new Employee("Jackie Wong", "Marketing", 74000, 31));
        list.add(new Employee("Kevin Patel", "Development", 92000, 38));
        list.add(new Employee("Laura Martinez", "Finance", 83000, 45));
       
        
        Optional<Employee> minAge = list.stream().min(Comparator.comparing(Employee::getAge));
        System.out.println("Min Age"+ minAge.get().getAge());
        
        Optional<Employee> maxAge = list.stream().max(Comparator.comparing(Employee::getAge));
        System.out.println("Max Age"+ maxAge.get().getAge());
        List<Double> numList = Arrays.asList(1.0,2.0,3.0,5.0,6.0,3.0);
        double total = numList.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Total Salary"+total);
        
         list.stream().mapToDouble(Employee::getSalary)
                      .average()
                      .ifPresentOrElse(t->System.out.println(t),()-> System.out.println( "Salary Not Available to calculate Average"));
        /**
         * Sum Of All salary
         */
         double totalSalary = list.stream().map(Employee :: getSalary)
             .mapToDouble(Double :: doubleValue).sum();
         System.out.println("Double "+ totalSalary);
             //.collect(Collectors.toList());
        
       /**
        * Fetching Employee Object Using Separate Property 
        */
       List<String> name =  list.stream().map(Employee::getName).collect(Collectors.toList());
       List<String> department =  list.stream().map(Employee::getDepartment).collect(Collectors.toList());
       List<Double> salary =  list.stream().map(Employee::getSalary).collect(Collectors.toList());
       List<Integer> age =  list.stream().map(Employee::getAge).collect(Collectors.toList());
       
       
       /**
        * Grouping By Department
        */
        Map<String,List<Employee>> groupByDepartment = list.stream().collect(Collectors.groupingBy(Employee:: getDepartment,TreeMap :: new, Collectors.toList()));
        groupByDepartment.forEach((H,E)->System.out.println(H+"-->"+E));
        
        Iterator<Entry<String, List<Employee>>> it = groupByDepartment.entrySet().iterator();
        while (it.hasNext()) {
			Entry<String, List<Employee>> obj = it.next();
			System.out.print(obj.getKey()+"::");
			List<Employee> nestedEmployeee = obj.getValue();
			for (Employee employee : nestedEmployeee) {
				System.out.print(employee.getName()+",");
			}
			System.out.println();
		}
       
        //Find Max Salary In List
      OptionalDouble maxSalary = list.stream().mapToDouble(Employee::getSalary).max();
      System.out.println("Max Salary" + maxSalary);              
      //Sort Employee by the name in asending order 
      list.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(e->{System.out.println(e);});
      list.sort(Comparator.comparing(Employee::getName)); //this will modify the original List;
        
        //Fetch Employee by the name ends with a
        list.stream().filter(e-> e.getName()
        		     .endsWith("a"))
                     .peek(e->{System.out.println("Debuggiing for "+e.getName());
                     })
                     .collect(Collectors.toList())
                     .forEach(e-> System.out.println(e.getName() +"<---------"));
        
        
        //count Each departmen count
        
        Map<String, Long> groupByDepartmentCount = list.stream()
        		                                       .collect(Collectors
        		                                    		   .groupingBy(Employee::getDepartment,
        		                                    				   Collectors.counting()));
        groupByDepartmentCount.forEach((K,V)->{System.out.println(K+"<=>"+V);});
        
        //Now preserve the insertion order user LinkedHashMap
        Map<String, List<String>> empListGruopingByDepartment = list.stream().
        		                                                      collect(Collectors
        		                                                    		  .groupingBy(Employee::getDepartment, 
        		                                                    				  LinkedHashMap:: new, 
        		                                                    				  Collectors.mapping(Employee::getName, Collectors.toList()
        		                                                    						  )));
        empListGruopingByDepartment.forEach((K,V)->{System.out.println(K+"<=>"+V);});
        
        
        empListGruopingByDepartment.forEach((K,V)->{System.out.println(K+"<=>"+V);});
        
        list.stream().collect(Collectors.groupingBy(e-> ((Employee) e).getDepartment()));
        list.forEach(e-> { System.out.println(e.getName() + " : " + e.getDepartment());});
   
        List<Integer> nums = Arrays.asList(4,5,8,10,12,15,6,9,8,5,15);
        //3rd highest number
         Stream<Integer> higestval = nums.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1);
         System.out.println(higestval.findFirst().get());
         IntStream randomNum =  new Random().ints(5);
        
        //List<Integer> random = (List<Integer>) new Random().ints(5, 100);
       randomNum.forEach(e->System.out.println(e));
        
        
        
        /**
         * HR: [Alice Johnson, Irene Scott]
           Development: [Bob Smith, Eva Sharma, Kevin Patel]
           Finance: [Carol Lee, Grace Chen, Laura Martinez]
           Sales: [David Kim, Hassan Ahmed]
           Marketing: [Frank Wilson, Jackie Wong]
         */
        
	}

}
