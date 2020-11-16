package OperadoresLogicos;

import java.util.Scanner;

public class Salario {
	public int c;
	public float n,st, resto, se;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite seu codigo: ");
		c = ler.nextInt();
		System.out.println("Digite suas horas trabalhadas: ");
		n = ler.nextFloat();
	}
	public void Calc() {
	if(n<=50) {
		st = n *10;
		System.out.println("salario do funcionario:" +c+" é "+st);
	}
else {
	st = n * 10;
	resto = n - 50;
	se = resto * 20;
	System.out.println("salario do funcionario:" +c+" é "+st+" o salario excedente: "+se+" salario total: "+(st+se));
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salario s = new Salario();
		s.Print();
		s.Calc();

	}

}
