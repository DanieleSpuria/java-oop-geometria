package org.lessons.java.geometria;

public class Rettangolo {

	public int base;
	public int altezza;
	
	public Rettangolo(int base, int altezza) {	
		this.base = base;
		this.altezza = altezza;
	}
	
	public int area() {
		return base * altezza;
	}
	
	public int perimetro()  {	
		return (base + altezza) * 2;
	}

	public void disegna() {
		for (int i = 1; i <= base; i++) System.out.print("o");

		for (int i = 1; i <= altezza - 2; i++) {
			System.out.print("\no");

			for (int x = 1; x <= base - 2; x++) System.out.print(' ');

			if (i != altezza -2) System.out.print("o");
			else System.out.println("o");
		}

		for (int i = 1; i <= base; i++) System.out.print('o');
	}
}
