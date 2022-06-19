package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.models.Employee;

public class CredentialService {

	public String generatePassword() {
		int first = (int) '!'; // 33
		int last = (int) '~'; // 126

		// int range = last - first;

		Random random = new Random();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 8; i++) {
			int randomNumber = random.nextInt(first, last);

			char randomCharacter = (char) randomNumber;

			sb.append(randomCharacter);
		}

		return sb.toString();
	}

	public String generateEmailAddress(Employee employee, String department) {

		String email = String.format("%s%s@%s.company.com", employee.getFirstName(), employee.getLastName(),
				department);

		return email;
	}

	// single responsibility principle
	public void showCredentials(String firstName, String email, String password) {
		System.out.printf("Dear %s your generated credentials are as follows\n"
				+ "Email   -----> %s\n"
				+ "Password-----> %s",firstName,email,password);
		
	}

}
