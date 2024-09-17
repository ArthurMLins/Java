package application;

import java.util.Scanner;
import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		ContaBancaria conta1;
		
		
		System.out.println("Enter accout number: ");
		String numConta = sc.nextLine();
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		System.out.println("Is there na initial deposit? (y/n)");
		char confirmacao = sc.next().charAt(0);
		
		if ( confirmacao == 'y') {
			
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta1 = new ContaBancaria(numConta, name, initialDeposit);
			
		} else {
			
			conta1 = new ContaBancaria(numConta, name);
		}
		
		System.out.println("Account data:");
		System.out.println(conta1);
		
		System.out.println("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta1.deposito(deposito);
		System.out.println("Updated data account data: ");
		System.out.println(conta1);
		
		System.out.println("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta1.saque(saque);
		System.out.println("Updated data account data: ");
		System.out.println(conta1);
		
		sc.close();

	}

}
