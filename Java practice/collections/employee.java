package com.collections;

public class Employee implements Comparable<Employee>
{
	private String empname;
	private String empcity;
	
	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empname, String empcity, Integer empId) 
	{
		super();
		this.empname = empname;
		this.empcity = empcity;
		this.empId = empId;
	}
	@Override
	public String toString() 
	{
		return "Employee [name=" + empname + ", city=" + empcity + ", empId=" + empId + "]";
	}
	private Integer empId;
	public String getName() 
	{
		return empname;
	}
	public void setName(String empname) 
	{
		this.empname = empname;
	}
	public String getCity() 
	{
		return empcity;
	}
	public void setCity(String empcity) 
	{
		this.empcity = empcity;
	}
	public Integer getEmpId() 
	{
		return empId;
	}
	public void setEmpId(Integer empId) 
	{
		this.empId = empId; 
	}
	@Override
	public int compareTo(Employee employee) 
	{
		// TODO Auto-generated method stub
		return this.getName().compareTo(employee.getName());
	}
}
