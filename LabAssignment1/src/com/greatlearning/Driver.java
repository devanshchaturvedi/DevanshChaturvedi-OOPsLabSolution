package com.greatlearning;

import java.util.Scanner;

import com.greatlearning.models.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {

	public static void main(String[] args) {

		Employee employee = new Employee("Devansh", "Chaturvedi");

		System.out.println("Please enter the department from the following: \n" + "1.Technical\n" + "2.Admin\n"
				+ "3.Human Resource\n" + "4.Legal");

		Scanner scanner = new Scanner(System.in);

		int option = scanner.nextInt();
		String department;

		switch (option) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "admin";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "legal";
			break;
		default:
			throw new IllegalArgumentException("Illegal option choosen! " + option);
		}
		
		CredentialService credentialService = new CredentialService();
		
		String email = credentialService.generateEmailAddress(employee, department);
		String password = credentialService.generatePassword();
		
		credentialService.showCredentials(employee.getFirstName(), email, password);

	}

}
