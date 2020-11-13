import java.util.Scanner;

public class Fabrica {
	double custoFabrica, distribuidor, impostos, valor;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite o custo de fabrica do carro: ");
		custoFabrica = ler.nextDouble();
	}
	
	public void Calc() {
		distribuidor = (28 * 100) / custoFabrica ;
		impostos = (45 * 100) / custoFabrica;
		valor = (custoFabrica + distribuidor+ impostos);
		System.out.println("o valor do carro com os impostos é: "+valor);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fabrica o = new Fabrica();
		o.Print();
		o.Calc();
	}

}
