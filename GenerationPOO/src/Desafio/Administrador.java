package Desafio;

public class Administrador extends Pessoa {
	private Double ajudaCusto;

	public Administrador(String nome, String endereco, String telefone, Double ajudaCusto) {
		super(nome, endereco, telefone);
		this.ajudaCusto = ajudaCusto;
	}

	public Administrador(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	public Double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(Double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}

	public void PrintA() {
		System.out.println("Função: Administrador");
		System.out.println("Ajuda de Custos: "+getAjudaCusto());
	}
}
