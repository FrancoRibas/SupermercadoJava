package model;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {

	private List<Producto> gondola;

	public Supermercado() {
		super();
		this.gondola = new ArrayList<Producto>();
	}

	public List<Producto> getGondola() {
		return gondola;
	}

	public void setGondola(List<Producto> gondola) {
		this.gondola = gondola;
	}

	public Producto traerProducto(String nombreProducto) {
		Producto producto = null;
		int indice = 0;
		while (gondola.size() < indice && producto == null) {
			if (gondola.get(indice).equals(nombreProducto)){
				producto = gondola.get(indice);
			}
		}
		return producto;
	}
	public Producto traerProducto(int idProducto) {
		Producto producto = null;
		int indice = 0;
		while (gondola.size() < indice && producto == null) {
			if (gondola.get(indice).equals(idProducto)) {
				producto = gondola.get(indice);
			}
		}
		return producto;
	}

	public boolean agregarProducto(String producto, float precio) throws Exception {
		boolean agregado = false;
		if (!gondola.isEmpty()) {
			if (traerProducto(producto) == null) {
				agregado = this.gondola
						.add(new Producto(this.gondola.get(gondola.size() - 1).getIdProducto() + 1, producto, precio));
			} else {
				throw new Exception("ERROR: el producto ya esta en la Lista de Productos");
			}
		} else {
			agregado = this.gondola.add(new Producto(1, producto, precio));
		}

		return agregado;
	}
	
	public boolean modificarProducto(int idProducto ,String producto, float precio) throws Exception {
		boolean modificado = false;
		if (!gondola.isEmpty()) {
			Producto productoParaModificar = traerProducto(producto);
			if (productoParaModificar != null) {
				productoParaModificar.setIdProducto(idProducto);
				productoParaModificar.setProducto(producto);
				productoParaModificar.setPrecio(precio);
				modificado = true;
			} else {
				throw new Exception("ERROR: el producto no esta en la Lista de Productos");
			}
		} else {
			throw new Exception("ERROR: No hay productos en la lista");
		}

		return modificado;
	}
	
	public boolean eliminarProducto(int idProducto) throws Exception {
		boolean agregado = false;
		if (!gondola.isEmpty()) {
			Producto productoParaEliminar = traerProducto(idProducto);
			if (productoParaEliminar != null) {
				gondola.remove(productoParaEliminar);
				agregado = true;
			} else {
				throw new Exception("ERROR: el producto no esta en la Lista de Productos");
			}
		} else {
			throw new Exception("ERROR: No hay productos en la lista");
		}

		return agregado;
	}

	
	
}
