package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Quantos contribuintes você vai digitar? ");
		int N = sc.nextInt();
		System.out.println();

		for (int i = 0; i < N; i++) {

			System.out.printf("Digite os dados do %d° contribuinte ", i + 1);
			System.out.println();
			System.out.print("Renda anual com salário: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gasto médicos: ");
			double healthSpending = sc.nextDouble();
			System.out.print("Gasto educacionais: ");
			double educationsSpending = sc.nextDouble();
			System.out.println();

			TaxPayer taxpayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending,
					educationsSpending);
			list.add(taxpayer);
			

		}

		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.printf("Resumo do %d° contribuinte ", i + 1);
			System.out.println();
			System.out.printf("Imposto bruto total: %.2f\n", list.get(i).grossTax());
			System.out.printf("Abatimento: %.2f\n", list.get(i).taxRebate());
			System.out.printf("Imposto devido: %.2f\n", list.get(i).netTax());

			System.out.println();
		}

		sc.close();

	}

}
