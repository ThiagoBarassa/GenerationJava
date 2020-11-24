package HerancaPolimorfismo;

public class PrincipalAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro(15);
		System.out.println(cachorro.toString());
		cachorro.correr();
		cachorro.EmitirSom();
		
		Preguica preguica = new Preguica(100);
		System.out.println(preguica.toString());
		preguica.Subir();
		preguica.EmitirSom();
		
		Cavalo cavalo = new Cavalo(5);
		System.out.println(cavalo.toString());
		cavalo.correr();
		cavalo.EmitirSom();
	}

}
