package Collections;


public class Estoque {
	private String produto, desc;
	private int qtd;
	
	public Estoque(String produto, String desc, int qtd) {
		this.produto = produto;
		this.desc = desc;
		this.qtd = qtd;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	@Override
	public String toString() {
		return "\nEstoque \n[produto=" + produto + ", desc=" + desc + ", qtd=" + qtd + "]\n";
	}

	
}
