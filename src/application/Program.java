package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	
	public static void main (String [] Args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> list = new ArrayList<>();
		
		System.out.printf("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
		
		System.out.println("Employee #" + i + " data:");
		System.out.print("Outsourced (y/n)? ");
		char response = sc.next().charAt(0);
		System.out.print("Name: ");
		sc.nextLine();
		String nameEmployee = sc.nextLine();
		System.out.print("Hours: ");
		int hoursEmployee = sc.nextInt();
		System.out.print("Value per hour: ");
		double valuePerHour = sc.nextDouble();
		
		if (response == 'y') {
			System.out.print("Additional Charge: ");
			Double add = sc.nextDouble();
			list.add(new OutsourcedEmployee(nameEmployee, hoursEmployee, valuePerHour, add));
		}
		else {
			list.add(new Employee(nameEmployee, hoursEmployee, valuePerHour));
		}
		}
		
		System.out.println();
		System.out.println("Payments: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " +String.format("%.2f", emp.payment()));
			
		}
		
		
		
		 
		
	
	
	
		
		sc.close();
	
	}
}

