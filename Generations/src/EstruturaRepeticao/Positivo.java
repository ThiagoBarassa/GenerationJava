package EstruturaRepeticao;

import java.util.Scanner;

public class Positivo {
	int media, soma, totalN, num = 0;
	private Scanner ler;
	public void Calc() {
		while(num >= 0) {
			ler = new Scanner(System.in);
			System.out.println("Digite um valor: ");
			System.out.println("para encerrar digite um valor negativo");
			num = ler.nextInt();
			if(num >0) {
			totalN++;
			
			soma = soma+num;
			
			media = soma / totalN;
			}
	}
		System.out.println("Total de valores inseridos: "+totalN);
		System.out.println("Soma dos valores inseridos: "+soma);
		System.out.println("Media dos valores inseridos: "+media);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Positivo p = new Positivo();
		p.Calc();
	}

}
