package EstruturaRepeticao;

import java.util.Scanner;

public class Prefeitura {
	int salario,numFilho, mediaS,mediaF, maiorS, percent,somaS,somaF,c=0, x;
	private Scanner ler;
	
	public void Calc() {
		for(int i=0;i<20;i++) {
			ler = new Scanner(System.in);
			System.out.println("Digite o salario: ");
			salario = ler.nextInt();
			System.out.println("Digite o numero de filhos: ");
			numFilho = ler.nextInt();
		
			somaS = somaS + salario;
			mediaS = somaS / 20;
		
			somaF = somaF + numFilho;
			mediaF = somaF /20;
			
			if(salario <= 100) {
				 c++;
				percent = c * 100 / 20; 
			}
			if(i==0) {
				maiorS = salario;
			}
			else if(salario>maiorS) {
				maiorS = salario;
			}
		}
		System.out.println("Media de salarios: "+mediaS);
		System.out.println("Media de Filhos: "+mediaF);
		System.out.println("Maior salario: "+maiorS);
		System.out.println("Porcentagem de salarios abaixo de 100: "+percent);
		}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prefeitura p = new Prefeitura();
		p.Calc();
	}

}
