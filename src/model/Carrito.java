package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

	private int idCarrito;
	private LocalDate fecha;
	private LocalTime hora;
	private List<ItemCarrito> lstCarrito;
	private Cliente cliente;

	public Carrito(int idCarrito, LocalDate fecha, LocalTime hora, List<ItemCarrito> lstCarrito, Cliente cliente) {

		super();
		this.idCarrito = idCarrito;
		this.fecha = fecha;
		this.hora = hora;
		this.lstCarrito = lstCarrito;
		this.cliente = cliente;
	}

	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public List<ItemCarrito> getLstCarrito() {
		return lstCarrito;
	}

	public void setLstCarrito(List<ItemCarrito> lstCarrito) {
		this.lstCarrito = lstCarrito;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean equals(Carrito carro) {
		return this.idCarrito == carro.getIdCarrito();
	}
	
	public boolean equals(int id) {
		return this.idCarrito == id;
	}

	// ABM Item del Carrito

	public ItemCarrito traerItemCarrito(Producto producto) {
		ItemCarrito itemCarritoBuscado = null;
		int indice = 0;
		while (itemCarritoBuscado == null && this.lstCarrito.size() > indice) {
			if (this.lstCarrito.get(indice).getProducto().equals(producto)) {
				itemCarritoBuscado = this.lstCarrito.get(indice);
			}
			indice++;
		}
		return itemCarritoBuscado;
	}

	public boolean agregarItme(Producto producto, int cantidad) {
		boolean agregado = false;
		ItemCarrito itemEnCarrito = traerItemCarrito(producto);
		if (!this.lstCarrito.isEmpty()) {
			if (itemEnCarrito == null) {
				agregado = this.lstCarrito.add(new ItemCarrito(
						this.lstCarrito.get(this.lstCarrito.size() - 1).getIdItem() + 1, producto, cantidad));
			} else {
				itemEnCarrito.setCantidad(cantidad + itemEnCarrito.getCantidad());
			}
		} else {
			agregado = this.lstCarrito.add(new ItemCarrito(1, producto, cantidad));
		}

		return agregado;
	}

	public boolean eliminarItem(Producto producto, int cantidad) throws Exception {
		boolean eliminado = false;
		ItemCarrito itemEnCarrito = traerItemCarrito(producto);
		if (!this.lstCarrito.isEmpty()) {
			if (itemEnCarrito != null) {
				if (itemEnCarrito.getCantidad() > cantidad) {
					itemEnCarrito.setCantidad(itemEnCarrito.getCantidad() - cantidad);
				} else {
					this.lstCarrito.remove(itemEnCarrito);
				}
			} else {
				throw new Exception("ERROR: El carrito no contiene el Item solucitado");
			}
		} else {
			throw new Exception("ERROR: El carrito no contiene Items como para que se puedan eliminar");
		}
		return eliminado;
	}

	public float calcularTotal() {
		float total = 0;
		for (ItemCarrito carro : this.lstCarrito) {
			total += carro.calcularSubTotal();
		}
		return total;
	}
}
