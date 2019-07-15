package model;

import java.util.List;
import java.time.*;

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

	public Carrito traerCarrito(Cliente cliente) {
		Carrito carritoBuscado = null;
		int indice = 0;
		while (this.carritos.size() > indice && carritoBuscado == null) {
			if (this.carritos.get(indice).equals(cliente)) {
				carritoBuscado = this.carritos.get(indice);
			}
			indice++;
		}
		return carritoBuscado;
	}

	public float calcularTotal(int idCliente) throws Exception {
		Cliente c = new Cliente(idCliente, "", 0, "");
		return calcularTotal(c);
	}

	public float calcularTotal(Cliente cliente) throws Exception {
		Carrito carro = traerCarrito(cliente);
		float total = 0;
		if (carro != null) {
			total = carro.calcularTotal();
		} else {
			throw new Exception("No exisen carros asociados al cliente en cuestion");
		}

		return total;
	}

	public float calcularTotal(int mes, int anio) throws Exception {
		return calcularTotal(LocalDate.of(anio, mes, 1));
	}

	public float calcularTotal(LocalDate fecha) throws Exception {
		float total = 0;
		if (fecha.getMonthValue() > 1 || fecha.getMonthValue() < 12) {
			for (Carrito c : carritos) {
				if (c.equals(fecha)) {
					total += c.calcularTotal();
				}
			}
		} else {
			throw new Exception("No existe ese mes");
		}
		return total;
	}
	/*
	public float calcularTotal() {

	}
	*/
}
