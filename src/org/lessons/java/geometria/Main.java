package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("\n------Rettangolo " + (i + i) + "------\n");
			
			System.out.print("Base: ");
			int base = scan.nextInt();
			
			System.out.print("Altezza: ");
			int altezza = scan.nextInt();
			
			Rettangolo rettangolo = new Rettangolo(base, altezza);
			int area      = rettangolo.area();
			int perimetro = rettangolo.perimetro();
			
			System.out.println("Area: " + area);
			System.out.println("Perimetro: " + perimetro);
			rettangolo.disegna();
		}
		scan.close();
	}
}
