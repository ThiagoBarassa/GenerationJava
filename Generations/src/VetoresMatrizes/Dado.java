package VetoresMatrizes;

import java.util.Random;

public class Dado {
	int i,media, soma=0,maior=0,cont=0;
	Random x = new Random();
	int v[]= new int[10];
	
	public void Calc() {
		for( i=0;i<10;i++) {
			v[i] = x.nextInt(7);	
			System.out.println("lanšamentos: ["+v[i]+"]");
		}

		for( i=0;i<10;i++) {
			if(v[i]>maior) {
				maior = v[i];
			}
		}
		for( i=0;i<10;i++) {
			if(v[i]==maior) {
				cont++;
			}
		}
		System.out.println("a maior face lanšada foi: "+maior+" um total de vezes: "+cont);
		for( i=0;i<10;i++) {
			soma=soma + v[i];
		}
		System.out.println("A soma: "+soma+" A Media: "+soma/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dado d = new Dado();
		d.Calc();
	}

}
