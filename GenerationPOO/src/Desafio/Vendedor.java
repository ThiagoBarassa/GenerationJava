package Desafio;

public class Vendedor extends Pessoa {
	private Double valorVenda, comissao, valorTotal;

	public Vendedor(String nome, String endereco, String telefone, Double valorVenda, Double comissao) {
		super(nome, endereco, telefone);
		this.valorVenda = valorVenda;
		this.comissao = comissao;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
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
		  this.valorTotal= (this.valorVenda + (comissao * 100));
	  }
	
	public void PrintV() {
		System.out.println("Função: Vendedor");
		System.out.println("Valor do Credito: "+getValorVenda());
		System.out.println("Comissão: "+getComissao());
		System.out.println("Valor total: "+getValorTotal());
	}

	
	
	
}
