package Desafio;

public class Operario extends Pessoa {
	private Double valorProducao, comissao, valorTotal;
	
	public Operario(String nome, String endereco, String telefone, Double valorProducao, Double comissao) {
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public Operario(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		
	}

	public Double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(Double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	  public void Calc() { 
		  this.valorTotal = this.valorProducao + (comissao * 100);
	  }
	 

	public void PrintO() {
		System.out.println("Função: Operario");
		System.out.println("Valor da Produção: "+getValorProducao());
		System.out.println("Comissão: "+getComissao());
		System.out.println("Valor total: "+getValorTotal());
	}
	
}
