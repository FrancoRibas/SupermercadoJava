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
	
	}
