package EstruturaRepeticao;

public class ParImpar {
	int p=0,m=0;
	
	public void Calc() {
		for(int i=0;i<10;i++) {
			if(i % 2 == 0) {
				p++;
				System.out.println("PAR: "+i);
			}else if(i % 2 != 0) {
				m++;
				System.out.println("IMPAR: "+i);
			}	
		}
		System.out.println(p+" sao pares e "+m+" sao impares");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParImpar pi = new ParImpar();
		pi.Calc();
	}

}
