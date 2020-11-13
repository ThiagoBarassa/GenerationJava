import java.util.Scanner;

public class MediaNota {
	float n1, n2, n3, media;
	private static Scanner ler;
	
	public void Calc() {
		media = ((n1*2)+ (n2*3)+(n3*5))/10;
		System.out.println("sua media é: "+media);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MediaNota c = new MediaNota();
		ler = new Scanner(System.in);
		System.out.println("Digite sua primeira nota: ");
		c.n1 = ler.nextFloat();
		System.out.println("Digite sua segunda nota: ");
		c.n2 = ler.nextFloat();
		System.out.println("Digite sua terceira nota: ");
		c.n3 = ler.nextFloat();
//		c.n1= 10;
//		c.n2= 4;
//		c.n3= 5;
		c.Calc();
	}

}
