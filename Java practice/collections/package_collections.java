package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo 
{

	public static void main(String[] args) 
  {
      // TODO Auto-generated method stub
		  Employee employee1 = new Employee("Saptha","Hassan",101);
		  Employee employee2 = new Employee("Rama","Banglore",102);
		  Employee employee3 = new Employee("Ravi","Manglore",103);
		  Employee employee4 = new Employee("Raman","Mandya",104);
		  ArrayList<Employee> employeeList = new ArrayList<>();
		  employeeList.add(employee1);
		  employeeList.add(employee2);
		  employeeList.add(employee3);
		  employeeList.add(employee4);
		  for(Employee emp : employeeList) 
      {
			  System.out.println(emp);
		  }
		  Collections.sort(employeeList);
		  System.out.println("Sorted List");
		  for(Employee emp : employeeList) 
      {
			  System.out.println(emp);
		  }
  }
}
