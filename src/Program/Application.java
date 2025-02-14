package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<TaxPayer> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			if (ch == 'i') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Anual Income: ");
				double anualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PessoaFisica(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Anual Income: ");
				double anualIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new PessoaJuridica(name, anualIncome, numberOfEmployees));
			}

		}	
		System.out.println();
		System.out.println("TAXES PAID");
		for (TaxPayer tax : list) {
			System.out.println(tax.getName() + ": " + String.format("%.2f", tax.incomeTax()));
		}
		sc.close();

	}

}
