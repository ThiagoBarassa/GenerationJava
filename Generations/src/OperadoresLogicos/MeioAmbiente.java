package OperadoresLogicos;

import java.util.Scanner;

public class MeioAmbiente {
	
	public float indice;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Atualiza��o do inice de polui��o: ");
		indice = ler.nextFloat();
	}
	public void Resultado() {
		if(indice == 0.3) {
			System.out.println("Notifica��o: Grupo 1, indice de polui��o elevado, suspenda suas atividades");
		}else if(indice == 0.4){
			System.out.println("Notifica��o: Grupo 1 e 2, indice de polui��o elevado, suspenda suas atividades");
		}else if(indice == 0.5) {
			System.out.println("Notifica��o: Todos os grupos, indice de polui��o elevado, suspenda suas atividades");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeioAmbiente ma = new MeioAmbiente();
		ma.Print();
		ma.Resultado();
	}

}
