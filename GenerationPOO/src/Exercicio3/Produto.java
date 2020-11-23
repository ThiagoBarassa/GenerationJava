package Exercicio3;

public class Produto {
	private int id;
	private String nome;
	private int qtdEstoque;
	private Double valor;
	
	
	public Produto(int id, String nome, int qtdEstoque, Double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.qtdEstoque = qtdEstoque;
		this.valor = valor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public void Print() {
		System.out.println("Id do produto: "+getId());
		System.out.println("Nome do produto: "+getNome());
		System.out.println("Quantidade em estoque: "+getQtdEstoque());
		System.out.println("Valor do produto: R$"+getValor());
	}
}
