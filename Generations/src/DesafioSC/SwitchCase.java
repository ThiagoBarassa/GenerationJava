package DesafioSC;

import java.util.Scanner;

public class SwitchCase {
	byte dia ;

private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite um dia: ");
		dia = ler.nextByte();
	}
	public void Valid() {
		switch (dia) {
		case 1:
			System.out.println("Domingo, fim de semana");
			break;
		case 2: 
			System.out.println("Segunda feira, dia util");
			break;
		case 3: 
			System.out.println("Ter�a feira, dia util");
			break;
		case 4: 
			System.out.println("Quarta feira, dia util");
			break;
		case 5: 
			System.out.println("Quinta feira, dia util");
			break;
		case 6: 
			System.out.println("Sexta feira, dia util");
			break;
		case 7: 
			System.out.println("Sabado, Fim de semana");
			break;
		default :
		System.out.println("op��o invalida");
		break;
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchCase sc = new SwitchCase();
		sc.Print();
		sc.Valid();
	}

}

