package OperadoresLogicos;

import java.util.Scanner;

public class MeioAmbiente {
	
	public float indice;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Atualização do inice de poluição: ");
		indice = ler.nextFloat();
	}
	public void Resultado() {
		if(indice == 0.3) {
			System.out.println("Notificação: Grupo 1, indice de poluição elevado, suspenda suas atividades");
		}else if(indice == 0.4){
			System.out.println("Notificação: Grupo 1 e 2, indice de poluição elevado, suspenda suas atividades");
		}else if(indice == 0.5) {
			System.out.println("Notificação: Todos os grupos, indice de poluição elevado, suspenda suas atividades");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeioAmbiente ma = new MeioAmbiente();
		ma.Print();
		ma.Resultado();
	}

}
