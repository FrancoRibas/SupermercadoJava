package model;

public class Supermercado {
	
	private Producto gondola;

	public Supermercado(Producto gondola) {
		super();
		this.gondola = gondola;
	}

	public Producto getGondola() {
		return gondola;
	}

	public void setGondola(Producto gondola) {
		this.gondola = gondola;
	}
	
}
