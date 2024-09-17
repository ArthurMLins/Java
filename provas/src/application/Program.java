package application;

import java.util.Scanner;

import entities.AvaliadorDeNotas;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AvaliadorDeNotas alunoJoao = new AvaliadorDeNotas();
		
		alunoJoao.nome = sc.nextLine();
		alunoJoao.nota1 = sc.nextDouble();
		alunoJoao.nota2 = sc.nextDouble();
		alunoJoao.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", alunoJoao.notaFinal());
		
		if (alunoJoao.notaFinal() < 60.0) {
			
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS %n", alunoJoao.missingPoints());
			
		} else {
			
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
