import java.text.DecimalFormat;
import java.util.Scanner;

public class Equacao3 {
	
	double a, b, c, d, e, f, x, y;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		a = ler.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = ler.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = ler.nextDouble();
		System.out.println("Digite o valor de D: ");
		d = ler.nextDouble();
		System.out.println("Digite o valor de E: ");
		e = ler.nextDouble();
		System.out.println("Digite o valor de F: ");
		f = ler.nextDouble();
		
	}
	
	public void Calc() {
		x = ((c*e)-(b*f)/(a*e)-(b*d));
		
		y = ((a*f)-(c*d)/(a*e)-(b*d));
		String vfx = new DecimalFormat(".00").format(x);
		String vfy = new DecimalFormat(".00").format(y);
		System.out.println("X:"+vfx+" Y:"+vfy);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equacao3 s = new Equacao3();
		
		s.Print();
		/*s.a=3;
		s.b=8;
		s.c=4;
		s.d=5;
		s.e=9;
		s.f=1;*/
		s.Calc();

}
}
