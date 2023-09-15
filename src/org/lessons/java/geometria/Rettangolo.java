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
}