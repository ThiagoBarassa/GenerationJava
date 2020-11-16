package OperadoresLogicos;

import java.util.Scanner;

public class Raiz {
	
	public int a,b,c,d;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		a = ler.nextInt();
		System.out.println("Digite um numero: ");
		b = ler.nextInt();
		System.out.println("Digite um numero: ");
		c = ler.nextInt();
		System.out.println("Digite um numero: ");
		d = ler.nextInt();
	}
	public void Calc() {
		a = a*a;
		b = b*b;
		c = c*c;
		d = d*d;
		
		if(c>=1000) {
			System.out.println("O terceiro valor é maior que 1000:"+c);
		}else {
			System.out.println("Calculos: 1:"+a+" 2:"+b+" 3:"+c+" 4:"+d);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Raiz r = new Raiz();
		r.Print();
		r.Calc();

	}

}
