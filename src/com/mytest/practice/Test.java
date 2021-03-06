package com.mytest.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		findEmployeeSalaryMorethan();
	
	}
	/**
	 * 
	 * @return
	 */
	private static ArrayList<Employee> getEmployeeList(){
		 List<Employee> empList = new ArrayList<Employee>();
	        empList.add(new Employee("Nataraja G", "Accounts", 8000));
	        empList.add(new Employee("Nagesh Y", "Admin", 15000));
	        empList.add(new Employee("Vasu V", "Security", 2500));
	        empList.add(new Employee("Amar", "Entertinment", 12500));
	        empList.add(new Employee("Charu", "Admin", 11000));
	        return (ArrayList<Employee>) empList;
	}
	
	private static void findEmployeeSalaryMorethan(){
		List<Employee> empList= getEmployeeList();
		 // find employees whose salaries are above 10000
        empList.stream().filter(emp->emp.getSalary() > 10000).forEach(System.out::println);
        System.out.println("***************");
        empList.stream().filter(emp->emp.getSalary() >10000).sorted(Comparator.comparingInt(Employee::getSalary).reversed()).forEach(System.out::println);
	}

}
