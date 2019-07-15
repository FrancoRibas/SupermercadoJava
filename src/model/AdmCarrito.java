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

	public Carrito traerCarrito(LocalDate fecha, LocalTime hora, Cliente cliente) {
		Carrito carritoBuscado = null;
		int indice = 0;
		while (this.carritos.size() > indice && carritoBuscado == null) {
			if (this.carritos.get(indice).equals(cliente, fecha, hora)) {
				carritoBuscado = this.carritos.get(indice);
			}
			indice++;
		}
		return carritoBuscado;
	}

	public boolean agregarCarrito(LocalDate fecha, LocalTime hora, Cliente cliente) throws Exception {
		boolean agregado = false;
		Carrito carritoEnLista = traerCarrito(fecha, hora, cliente);
		if (!carritos.isEmpty()) {
			if (carritoEnLista == null) {
				agregado = carritos
						.add(new Carrito(carritos.get(carritos.size() - 1).getIdCarrito() + 1, fecha, hora, cliente));
			} else {
				throw new Exception("El cliente ya tiene un carrito registrado");
			}
		} else {
			agregado = carritos.add(new Carrito(1, fecha, hora, cliente));
		}

		return agregado;
	}

	public boolean eliminarCarrito(int idCarrito) throws Exception {
		boolean eliminado = false;
		Carrito carritoEnLista = traerCarrito(idCarrito);
		if (!carritos.isEmpty()) {
			if (carritoEnLista != null) {
				eliminado = carritos.remove(carritoEnLista);
			} else {
				throw new Exception("El carrito en cuestion no esta");
			}
		} else {
			throw new Exception("La lista no continie Carritos que eliminar");
		}
		return eliminado;
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
	 * public float calcularTotal() {
	 * 
	 * }
	 */
}
