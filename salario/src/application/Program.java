package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee arthur = new Employee();
	
		
		System.out.println("Qual o seu nome?");
		arthur.name = sc.nextLine();
		
		System.out.println("Qual o seu salario?");
		arthur.grossSalary = sc.nextDouble();
		
		System.out.println("Qual o imposto a ser descontado?");
		arthur.tax = sc.nextDouble();
		
	    arthur.netSalary();
		
		System.out.println(arthur);
		
		arthur.IncreaseSalary(10);
		
		System.out.println("Apos o aumento: " + arthur);
		
		sc.close();

	}

}
