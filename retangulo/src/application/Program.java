package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo1 = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		retangulo1.Width = sc.nextDouble();
		
		retangulo1.Height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", retangulo1.area());
		System.out.printf("PERIMETER = %.2f%n", retangulo1.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retangulo1.Diagonal());
		
		
		sc.close();
	}
}

