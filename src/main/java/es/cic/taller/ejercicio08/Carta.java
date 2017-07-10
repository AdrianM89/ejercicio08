package es.cic.taller.ejercicio08;

public class Carta {
	private int numero;
	private String palo;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	@Override
	public String toString() {
		return numero + " de " + palo;
	}
	
}
