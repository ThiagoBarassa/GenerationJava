package Exercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente();
		c1.setNome("Thiago");
		c1.setNmesa(1);
		c1.setPedido("X-salada/coca-cola");
		c1.setValorConta(25.00);
		
		c1.Print();
		
		Cliente c2 = new Cliente();
		c2.setNome("Marcos");
		c2.setNmesa(2);
		c2.setPedido("Coxinha/Suco");
		c2.setValorConta(9.50);
		
		System.out.println("Cliente mesa: "+c2.getNmesa()+"\nNome: "+c2.getNome()+
				"\npedido: "+c2.getPedido()+"\nValor Total: R$"+c2.getValorConta());
	}

}
