package EstruturaRepeticao;

import java.util.Scanner;

public class Multiplo3 {
	int num, media,soma, c=0;
	private Scanner ler;
	
	public void Calc() {
		do {
			ler = new Scanner(System.in);
			System.out.println("Digite um numero: ");
			System.out.println("para encerrar digite 0");
			num = ler.nextInt();
			
			if(num % 3 == 0 && num!=0) {
				c++;
				soma = soma+num;
				media = soma  / c;
			}
			
		}while(num != 0);
		System.out.println("A soma dos numeros digitados �: "+media);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplo3 s = new Multiplo3();
		s.Calc();
	}

}

