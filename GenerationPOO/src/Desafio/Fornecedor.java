package Desafio;

public class Fornecedor extends Pessoa {
	private Double valorCredito, valorDivida,saldo;
	
	public Fornecedor(String nome, String endereco, String telefone, Double valorCredito, Double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void obterSaldo() {
		this.saldo = this.valorCredito - this.valorDivida;
	}
	public void PrintF() {
		System.out.println("Função: Fornecedor");
		System.out.println("Valor do Credito: "+getValorCredito());
		System.out.println("Valor da Divida: "+getValorDivida());
		System.out.println("Saldo: "+getSaldo());
	}

}
