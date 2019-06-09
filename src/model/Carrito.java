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

}
