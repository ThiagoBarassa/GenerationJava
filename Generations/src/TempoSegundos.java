import java.text.DecimalFormat;
import java.util.Scanner;

public class TempoSegundos {
	
	float tempo, hora, min, seg;
	private Scanner ler;
	
	public void Print() {
		ler = new Scanner(System.in);
		System.out.println("Digite o tempo em segundos: ");
		tempo = ler.nextFloat();
	}
	
	public void Calc() {
		hora = tempo / 3600;
		min = (tempo % 3600)/60;
		seg = (tempo % 3600)%60;
		String vfh = new DecimalFormat(".00").format(hora);
		String vfm = new DecimalFormat(".00").format(min);
		String vfs = new DecimalFormat(".00").format(seg);
		System.out.println("horas:"+vfh+ "minutos:" + vfm +"segundos:"+ vfs);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempoSegundos t = new TempoSegundos();
		t.Print();
		//t.tempo = 6034;
		t.Calc();
	}

}
