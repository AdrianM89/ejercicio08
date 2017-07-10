package es.cic.taller.ejercicio08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
	private List<Carta> listaCartas = new ArrayList<>();
	
	private static int posicion=0;
			
	public Baraja() {
		listaCartas.addAll(getPalo("Oros"));
		listaCartas.addAll(getPalo("Copas"));
		listaCartas.addAll(getPalo("Bastos"));
		listaCartas.addAll(getPalo("Espadas"));
		
	}
	
	
	public List<Carta> getPalo(String palo){
		List<Carta> listaCartasPalo = new ArrayList<>();
		for(int i= 1; i <= 10; i++) {
			Carta carta = new Carta();
			carta.setNumero(i);
			carta.setPalo(palo);
			listaCartasPalo.add(carta);
			
		}
		Collections.shuffle(listaCartas);
		return listaCartasPalo;
		
	}
	
	public Tapete getTapete() {
		Tapete tapete = new Tapete();
		tapete.setCarta1(listaCartas.get(posicion++));
		tapete.setCarta2(listaCartas.get(posicion++));
		tapete.setCarta3(listaCartas.get(posicion++));
		tapete.setCarta4(listaCartas.get(posicion++));

		return tapete;
	}
}
