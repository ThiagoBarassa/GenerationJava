package OperadoresLogicos;

import java.util.Scanner;

public class area {
	public float base, altura, area;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite a base do triangulo: ");
		base = ler.nextFloat();
		ler = new Scanner(System.in);
		System.out.println("Digite a altura do triangulo");
		altura = ler.nextFloat();
	}
	public void Calc() {
		if(base>0 && altura>0) {
			area = (base*altura)/2;
			System.out.println("A area do triangulo é: "+area);
		}else {
			System.out.println("Valores invalidos");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area a = new area();
		a.Print();
		a.Calc();
	}

}
