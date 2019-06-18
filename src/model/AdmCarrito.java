package model;

import java.util.List;

public class AdmCarrito {

	private List<Carrito> carritos;

	public AdmCarrito(List<Carrito> carritos) {
		super();
		this.carritos = carritos;
	}

	public List<Carrito> getCarritos() {
		return carritos;
	}

	public void setCarritos(List<Carrito> carritos) {
		this.carritos = carritos;
	}

	public Carrito traerCarrito(int idCarrito) {
		Carrito carritoBuscado = null;
		int indice = 0;
		while (this.carritos.size() > indice && carritoBuscado == null) {
			if (this.carritos.get(indice).equals(idCarrito)) {
				carritoBuscado = this.carritos.get(idCarrito);
			}
			indice++;
		}
		return carritoBuscado;
	}
	
	

}
