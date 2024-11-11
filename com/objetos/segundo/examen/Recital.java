package com.objetos.segundo.examen;

import java.util.ArrayList;
import java.util.List;

public class Recital {
	
	int anio;	
	List<String> bandas = new ArrayList<String>();
		
	public Recital(int anio, List<String> bandas) {
		this.anio = anio;
		this.bandas = bandas;
	}
	
	public void agregarBanda(String unaBanda, List<String> bandas) {
		bandas.add(unaBanda);
	}
	
	public void quitarBanda(String unaBanda, List<String> bandas) {
		bandas.remove(unaBanda);
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public List<String> getBandas() {
		return bandas;
	}
}
