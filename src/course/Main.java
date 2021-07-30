package course;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();
		
		System.out.println("Name: ");
		funcionario.Name = sc.nextLine();
		System.out.println("Gross salary: ");
		funcionario.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		funcionario.Tax = sc.nextDouble();
		
		System.out.println("Employee: " + funcionario.toString());
		
		System.out.println("Which percentage to increase salary? ");
		funcionario.IncreaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + funcionario.toString());
		
		sc.close();
	}

}
