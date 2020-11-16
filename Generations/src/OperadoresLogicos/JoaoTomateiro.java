package OperadoresLogicos;

import java.util.Scanner;

public class JoaoTomateiro {
	
	public int p=0, e=0, m=0;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite a quantiade em KG's de tomates: ");
		p = ler.nextInt();
	}
	public void Calc() {
		if(p > 50) {
			e = p - 50;
			m = e * 4;
			System.out.println("Excesso: "+e+"Peso: "+p+"Multa: "+m);
		}else if(p < 50){
			System.out.print("Peso dentro do permitio: "+p+" Excesso: "+e+" Multa: "+m);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JoaoTomateiro jt = new JoaoTomateiro();
		jt.Print();
		jt.Calc();
	}

}
