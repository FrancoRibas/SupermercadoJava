package model;

import java.util.List;

public class AdmProducto {
	
	private List<Producto> productos;
	
	public AdmProducto(List<Producto> productos) {
		super();
		this.productos = productos;
	}

	public List<Producto> getGondola() {
		return productos;
	}

	public void setGondola(List<Producto> gondola) {
		this.productos = gondola;
	}

	public Producto traerProducto(String nombreProducto) {
		Producto producto = null;
		int indice = 0;
		while (productos.size() > indice && producto == null) {
			if (productos.get(indice).equals(nombreProducto)) {
				producto = productos.get(indice);
			}
			indice++;
		}
		return producto;
	}

	public Producto traerProducto(int idProducto) {
		Producto producto = null;
		int indice = 0;
		while (productos.size() > indice && producto == null) {
			if (productos.get(indice).equals(idProducto)) {
				producto = productos.get(indice);
			}
			indice++;
		}
		return producto;
	}

	public boolean agregarProducto(String producto, float precio) throws Exception {
		boolean agregado = false;
		if (!productos.isEmpty()) {
			if (traerProducto(producto) == null) {
				agregado = this.productos
						.add(new Producto(this.productos.get(productos.size() - 1).getIdProducto() + 1, producto, precio));
			} else {
				throw new Exception("ERROR: el producto ya esta en la Lista de Productos");
			}
		} else {
			agregado = this.productos.add(new Producto(1, producto, precio));
		}

		return agregado;
	}

	public boolean modificarProducto(int idProducto, String producto, float precio) throws Exception {
		boolean modificado = false;
		if (!productos.isEmpty()) {
			Producto productoParaModificar = traerProducto(idProducto);
			if (productoParaModificar != null) {
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
		if (!productos.isEmpty()) {
			Producto productoParaEliminar = traerProducto(idProducto);
			if (productoParaEliminar != null) {
				productos.remove(productoParaEliminar);
				agregado = true;
			} else {
				throw new Exception("ERROR: el producto no esta en la Lista de Productos");
			}
		} else {
			throw new Exception("ERROR: No hay productos en la lista");
		}
		return agregado;
	}

	@Override
	public String toString() {
		String supermer = "Supermercado \n";
		for (Producto p : productos) {
			supermer += p.toString() + "\n";
		}
		return supermer;
	}
}
