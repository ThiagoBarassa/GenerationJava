package EstruturaRepeticao;

import java.util.Scanner;

public class multiplicador3 {
	int num,mult;
	private Scanner ler;
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		num = ler.nextInt();
	}
	public void Calc() {
		while(num < 100) {
			num = num * 3;
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplicador3 m = new multiplicador3();
		m.Print();
		m.Calc();
	}

}
