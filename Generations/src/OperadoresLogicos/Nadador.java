package OperadoresLogicos;

import java.util.Scanner;

public class Nadador {
	
	private int idade;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite a idade do nadador: ");
		idade = ler.nextInt();
	}
	public void Resultado() {
		if(idade>=5 && idade<=7) {
			System.out.println("Nadador categoria: Infantil A");
		}else if(idade>=8 && idade<=11) {
			System.out.println("Nadador categoria: Infantil B");
		}else if(idade>=12 && idade<=13) {
			System.out.println("Nadador categoria: Juvenil A");
		}else if(idade>=14 && idade<=17) {
			System.out.println("Nadador categoria: Juvenil B");
		}else if(idade >=18) {
			System.out.println("Nadador categoria: Adulto");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nadador n = new Nadador();
		n.Print();
		n.Resultado();

	}

}
