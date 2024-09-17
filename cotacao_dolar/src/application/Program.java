package application;

import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter cambio = new CurrencyConverter();
		
		System.out.println("quantidade de reais para ser convertidos ");
		cambio.quantity = sc.nextDouble();
		
		System.out.println("Valor sem imposto " + cambio.valorBruto());
		System.out.println("Valor com imposto " + cambio.valorFinal());
		
		sc.close();
		
		
	}

}
