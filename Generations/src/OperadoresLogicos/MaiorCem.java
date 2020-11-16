package OperadoresLogicos;

import java.util.Scanner;

public class MaiorCem {
	public float N;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		N = ler.nextFloat();
	}
	public void Calc() {
		if(N>100) {
			System.out.println("o valor "+N+" é maior que 100");
		}else {
			System.out.println(N=0);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaiorCem mc= new MaiorCem();
		mc.Print();
		mc.Calc();
	}

}
