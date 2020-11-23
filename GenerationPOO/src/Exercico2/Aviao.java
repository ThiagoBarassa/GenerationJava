package Exercico2;

public class Aviao {
	private String modelo;
	private boolean situacao;
	private int altitude, acelera, reduz;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isSituacao() {
		return situacao;
		}
	
	public void setSituacao(boolean situacao) {
	
		this.situacao = situacao;
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	public int getAcelera() {
		return acelera;
	}
	public void setAcelera(int acelera) {
		if(altitude > 0) {
		this.acelera = (getAltitude() + acelera) * 10;
		}else if(altitude <= 0){
			this.acelera = acelera * 20;
		}
	}
	public int getReduz() {
		return reduz;
	}
	public void setReduz(int reduz) {
		this.reduz = (this.altitude + reduz)/5;
	}
	public void Print() {
		System.out.println("Modelo:" + getModelo());
		System.out.println("Altitude: "+ getAltitude());
		if(this.situacao == true) {
			System.out.println("o aviao esta em voo");
		}else {
			System.out.println("o aviao esta pousado");
		}

	}
	
	
	
}
