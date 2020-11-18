package EstruturaRepeticao;

public class ImparX3 {
	int num;
	public void Calc() {
		for(int i = 1;i < 500;i++) {
			if(i % 2 != 0) {
				if(i % 3 == 0) {
					num = num + i;
				}
			}
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImparX3 x = new ImparX3();
		x.Calc();
	}

}
