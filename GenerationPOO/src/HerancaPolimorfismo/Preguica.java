package HerancaPolimorfismo;

public class Preguica extends Animal {

	public Preguica(int idade) {
		super(idade);
		setNome("Preguiça");
		setSom("Som de uma priguiça");
	}
	public void Subir() {
		System.out.println("A "+getNome()+" esta subindo na arvore");
	}

}
