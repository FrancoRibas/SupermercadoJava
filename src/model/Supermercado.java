package model;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {

	private AdmProducto admProducto;
	private AdmCliente admCliente;
	private AdmCarrito admCarrito;
	
	public Supermercado() {
		super();
		this.admProducto = new AdmProducto(new ArrayList<Producto>());
		this.admCliente = new AdmCliente(new ArrayList<Cliente>());
		this.admCarrito = new AdmCarrito(new ArrayList<Carrito>());
	}

	public AdmProducto getAdmProducto() {
		return admProducto;
	}

	public void setAdmProducto(AdmProducto admProducto) {
		this.admProducto = admProducto;
	}

	public AdmCliente getAdmCliente() {
		return admCliente;
	}

	public void setAdmCliente(AdmCliente admCliente) {
		this.admCliente = admCliente;
	}

	public AdmCarrito getAdmCarrito() {
		return admCarrito;
	}

	public void setAdmCarrito(AdmCarrito admCarrito) {
		this.admCarrito = admCarrito;
	}
	
	}
