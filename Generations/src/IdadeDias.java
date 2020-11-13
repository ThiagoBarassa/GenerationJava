import java.util.Scanner;

public class IdadeDias {
	
	int dias;
	int meses, anos, dia;
	private Scanner ler;
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();
	}
	public void Calc() {
		anos = dias / 360;
		meses = (dias % 360) /30;
		dia = (dias % 360) %30;
		System.out.println("anos:" + anos + " meses:" +  meses + " dias:"+ dia);	
	}
	
	public static void main(String[] args) {
		
		
		IdadeDias d = new IdadeDias();
		d.Print();
		d.Calc();

	}

}
