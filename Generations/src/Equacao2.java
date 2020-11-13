import java.util.Scanner;
import java.text.DecimalFormat;

public class Equacao2 {
	
	double x1, x2,y1,y2, d;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite o valor de x1: ");
		x1 = ler.nextDouble();
		System.out.println("Digite o valor de x2: ");
		x2 = ler.nextDouble();
		System.out.println("Digite o valor de y1: ");
		y1 = ler.nextDouble();
		System.out.println("Digite o valor de y2: ");
		y2 = ler.nextDouble();
	}
	
	public void Calc() {
		d = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		String vf = new DecimalFormat(".00").format(d);
		System.out.println("O valor é: "+vf);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equacao2 s = new Equacao2();
		s.Print();
		/*s.x1=2;
		s.x2=3;
		s.y1= 5;
		s.y2=6;*/
		s.Calc();

	}

}
