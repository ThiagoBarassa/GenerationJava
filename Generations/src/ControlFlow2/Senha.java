package ControlFlow2;

import java.util.Scanner;

public class Senha {
	static final int senha = 1234;
	public int valida;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite sua senha: ");
		valida = ler.nextInt();
	}
	public void Validar() {
		if(senha == valida) {
			 System.out.println("Acesso Permitido");
		}else {
			System.out.println("Acesso negado");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Senha s = new Senha();
		s.Print();
		s.Validar();

	}

}
