package Exercico2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao a = new Aviao();
		a.setModelo("Boing 777");
		a.setSituacao(true);
		a.setAcelera(50);
		a.setAltitude(a.getAcelera());
		a.setAcelera(50);
		a.setAltitude(a.getAcelera());
		a.setReduz(50);
		a.setAltitude(a.getReduz());
		a.Print();
	}

}
