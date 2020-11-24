package Collections;
import java.util.ArrayList;


public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Estoque> estoque = new ArrayList<Estoque>();
		//adiciona
		estoque.add(new Estoque("Banana","Fruta",15));
		estoque.add(new Estoque("Maça","Fruta",600));
		estoque.add(new Estoque("Alface","Verdura",200));
		estoque.add(new Estoque("Cenoura","Legume",250));
		estoque.add(new Estoque("Couve","Verdura",300));
		System.out.println("Estoque: "+estoque.toString());
		
		//remove por index
		estoque.remove(1);
		System.out.println("Estoque: "+estoque.toString());
		
		//limpa todos os campos
		estoque.clear();
		System.out.println("Estoque: "+estoque.toString());
		
		
	}

}
