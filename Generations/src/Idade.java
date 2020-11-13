import java.util.Scanner;

public class Idade {
	int anos;
	int meses, dias;
	int diasDeVida;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite seus anos de vida: ");
		anos = ler.nextInt();
		System.out.println("Digite seus meses de vida: ");
		meses = ler.nextInt();
		System.out.println("Digite seus dias de vida: ");
		dias = ler.nextInt();
	}
	
	public void Calc() {
		anos = anos * 360;
		meses = meses * 30;
		diasDeVida = anos + meses + dias;
		System.out.println("dias de vida:"+diasDeVida);
	}
	public static void main(String[] args) {
		
		Idade d = new Idade();
			d.Print();
			d.Calc();
	}
}
