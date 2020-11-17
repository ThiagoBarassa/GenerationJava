package ControlFlow2;

import java.util.Scanner;

public class Maior3 {
	public int n1,n2,n3,maior;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		n1 = ler.nextInt();
		System.out.println("Digite outro numero: ");
		n2 = ler.nextInt();
		System.out.println("Digite outro numero: ");
		n3 = ler.nextInt();
	}
	public void Calc() {
		if(n1 == n2 || n2 ==n3 || n1 == n3 ) {
			System.out.println("Valor invalido, favor nao repita os numeros!!");
		}
		else if(n1>n2 && n2>n3) {	
			maior = n1;
			System.out.println("O maior numero é: "+maior);
		}else if(n2>n1 && n1>n3) {
				maior = n2;
				System.out.println("O maior numero é: "+maior);
				}
			else if(n3>n1&&n3>n2) {
				maior = n3;
				System.out.println("O maior numero é: "+maior);
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maior3 m = new Maior3();
		m.Print();
		m.Calc();
	}

}
