package OperadoresLogicos;

import java.util.Scanner;

public class ParImpar {
	public int n;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		n = ler.nextInt();
	}
	
	public void CalcParImpar() {
		if(n%2==0) {
			System.out.println("O numero: "+n+" é par");
		}else {
			System.out.println("O numero: "+n+" é impar");
		}
	}
	public void CalcPosNeg() {
		if(n>=0) {
			System.out.println("O numero: "+n+" é positivo");
		}else {
			System.out.println("O numero: "+n+" é negativo");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParImpar p = new ParImpar();
		p.Print();
		p.CalcParImpar();
		p.CalcPosNeg();
	}

}
