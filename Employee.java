package week6;

import java.util.Scanner;

public class Employee extends Person{ 
	double salary;
	int year;
	String insurance_id;
	public Employee(String name, double salary, int year, String insurance_id) {
		super(name);
		this.salary = salary;
		this.year = year;
		this.insurance_id = insurance_id;
	}
	public void display() {
		System.out.println("DETAILS OF EMPLOYEE");
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Year of joining: "+year);
		System.out.println("National Insurance Number: "+insurance_id);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String p_name,ins_id;
		double sal;
		int joining_year;
		System.out.println("Enter name of Employee: ");
		p_name=sc.nextLine();
		System.out.println("Enter Annua Salary: ");
		sal=sc.nextDouble();
		System.out.println("Enter Year of joining: ");
		joining_year=sc.nextInt();
		System.out.println("Enter National Insurance Number of employee: ");
		ins_id=sc.next();
		Employee e=new Employee(p_name,sal,joining_year,ins_id);
		e.display();
	}
}
