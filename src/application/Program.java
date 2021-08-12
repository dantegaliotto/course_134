package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Payer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Payer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i=1; i<=n; i++) {
			System.out.printf("Tax payer #%s data: \n",i);
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expeditures: ");
				Double healthExpeditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpeditures));
			}else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberEmployees));
			}
			
		}
		
		System.out.println("TAXES PAID:");
		double totalTaxes = 0;
		for (Payer p : list) {
			System.out.println(p.getName() + ": $ " + String.format("%.2f",p.totalTaxes()));
			totalTaxes += p.totalTaxes();
		}

		System.out.println("\nTOTAL TAXES: $" + String.format("%.2f",totalTaxes));
		
	}

}
