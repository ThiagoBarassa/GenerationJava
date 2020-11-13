import java.util.Scanner;

public class Equacao {
	double A, B, C, D, R, S;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		A = ler.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = ler.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = ler.nextDouble();
	}
	
	public void Calc() {
		R = Math.pow((A + B),2);
		S = Math.pow((B+C),2);
				
		D = (R+S)/2;
		
		System.out.println("o valor da equação é: "+D);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Equacao q = new Equacao();
		q.Print();
		q.Calc();

	}

}
