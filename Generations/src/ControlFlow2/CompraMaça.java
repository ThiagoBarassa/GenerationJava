package ControlFlow2;

import java.util.Scanner;

public class CompraMa�a {
	public int qtd;
	public double valor;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite a quantidade de ma�as compradas: ");
		qtd = ler.nextInt();
	}
	public void Calc() {
		valor = qtd < 12 ? valor = (qtd * 0.30) : (qtd * 0.25);
		System.out.println("O valor da compra �: "+valor);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompraMa�a mc = new CompraMa�a();
		mc.Print();
		mc.Calc();

	}

}
