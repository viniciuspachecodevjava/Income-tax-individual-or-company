package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.TaxPayer;
import entities.Individual;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int numberPayers = sc.nextInt();
		
		for (int i = 0; i < numberPayers; i++) {
			System.out.println("Tax payer #" + (i+1) + " data");
			System.out.println("Individual or company? (i/c)");
			char op = sc.next().charAt(0);

				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Anual income: ");
				Double anualIncome = sc.nextDouble();
				if(op == 'i') {
				System.out.println("Health expenditures: ");
				Double health = sc.nextDouble();

				list.add(new Individual(name, anualIncome, health));
			}else if(op == 'c') {
				System.out.println("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberEmployees));
			}
		}
		Double sum = 0.0;
		System.out.println("TAXED PAID: ");
		for (TaxPayer p : list) {
			double tax = p.incomeTaxCalculation();
			System.out.println(
					p.getName() 
					+ ":"
					+ " $ "
					+ String.format("%.2f", tax)
					);
			sum+=tax;
		}
		System.out.println("");
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
		sc.close();
	}

}
