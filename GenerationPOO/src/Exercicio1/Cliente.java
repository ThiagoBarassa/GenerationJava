package Exercicio1;

public class Cliente {
	private String nome;
	private int Nmesa;
	private String pedido;
	private Double valorConta;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNmesa() {
		return Nmesa;
	}
	public void setNmesa(int nmesa) {
		Nmesa = nmesa;
	}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public Double getValorConta() {
		return valorConta;
	}
	public void setValorConta(Double valorConta) {
		this.valorConta = valorConta;
	}
	
	public void Print() {
		System.out.println("Cliente mesa:" + this.Nmesa);
		System.out.println("Nome: "+ this.nome);
		System.out.println("Pedido: "+ this.pedido);
		System.out.println("Valor total: R$"+this.valorConta);
		System.out.println("===========**===========");
	}
}
