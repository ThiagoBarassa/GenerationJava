package Desafio;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fornecedor fo = new Fornecedor("Marcos","Disney, 99","99999-9999",1000.00,500.00);
		fo.obterSaldo();
		fo.PrintP();
		fo.PrintF();
		
		Empregado em = new Empregado("Airton","Sao paulo,100","10000-11111",1234,1000.00,0.25);
		em.CalcSalario();
		em.PrintP();
		em.PrintE();
		
		Administrador ad = new Administrador("Kleber","Zona norte","1000000222");
		ad.setAjudaCusto(100.00);
		ad.PrintP();
		ad.PrintA();
	}

}
