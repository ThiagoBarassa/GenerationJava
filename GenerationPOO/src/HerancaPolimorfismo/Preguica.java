package HerancaPolimorfismo;

public class Preguica extends Animal {

	public Preguica(int idade) {
		super(idade);
		setNome("Pregui�a");
		setSom("Som de uma prigui�a");
	}
	public void Subir() {
		System.out.println("A "+getNome()+" esta subindo na arvore");
	}

}
