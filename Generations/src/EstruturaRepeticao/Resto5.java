package EstruturaRepeticao;

public class Resto5 {
	
	public void Calc() {
		for(int i = 1000;i<=1999;i++) {
			if(i % 11 == 5) {
			System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resto5 r = new Resto5();
		r.Calc();
	}

}
