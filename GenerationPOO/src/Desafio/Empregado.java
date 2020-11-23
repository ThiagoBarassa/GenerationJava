package Desafio;

public class Empregado extends Pessoa{
	private int codSetor;
	private Double salarioBase, imposto, salario;
	
	public Empregado(String nome, String endereco, String telefone, int codSetor, Double salarioBase, Double imposto) {
		super(nome, endereco, telefone);
		this.codSetor = codSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public int getCodSetor() {
		return codSetor;
	}
	public void setCodSetor(int codSetor) {
		this.codSetor = codSetor;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public Double getImposto() {
		return imposto;
	}
	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void CalcSalario() {
		this.setSalario(salarioBase - (salarioBase*imposto));
	}
	public void PrintE() {
		System.out.println("Função: Empregado");
		System.out.println("Codigo do Setor: "+getCodSetor());
		System.out.println("Salario Base: "+getSalarioBase());
		System.out.println("Impostos: "+ getImposto());
		System.out.println("Salario: "+ getSalario());
	}
	
}
