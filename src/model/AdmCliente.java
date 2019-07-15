package model;

import java.util.List;

public class AdmCliente {

	private List<Cliente> clientes;

	public AdmCliente(List<Cliente> clientes) {
		super();
		this.clientes = clientes;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente traerCliente(int idCliente) {
		Cliente cliente = null;
		int indice = 0;
		while (this.clientes.size() > indice && cliente == null) {
			if (this.clientes.get(indice).equals(idCliente)) {
				cliente = this.clientes.get(indice);
			}
			indice++;
		}
		return cliente;
	}

	public Cliente traerCliente(Cliente cliente) {
		Cliente clienteBuscado = null;
		int indice = 0;
		while (this.clientes.size() > indice && clienteBuscado == null) {
			if (this.clientes.get(indice).equals(cliente)) {
				clienteBuscado = this.clientes.get(indice);
			}
			indice++;
		}
		return cliente;
	}
	
	public boolean agregarCliente(String cliente, long dni, String direccion) throws Exception {
		boolean agregado = false;
		// el campo buscado es el del DNI por la definicion del equals
		Cliente clienteEnLista = traerCliente(new Cliente(0,cliente,dni,direccion));
		if (!this.clientes.isEmpty()) {
			if (clienteEnLista == null) {
				agregado = clientes.add(new Cliente(this.clientes.get(this.clientes.size() - 1).getIdCliente() + 1,
						cliente, dni, direccion));
			} else {
				throw new Exception ("ERROR: El cliente en cuestion ya esta entre los clientes agregados");
			}
		} else {
			agregado = clientes.add(new Cliente(1, cliente, dni, direccion));
		}
		return agregado;
	}
	
	public boolean eliminarCliente (int id) throws Exception{
		boolean eliminado = false;
		// el campo buscado es el ID en este caso.. uso el otro traer. El pedido originalmente.
		Cliente clienteEnLista = traerCliente(id);
		if (!this.clientes.isEmpty()) {
			if(clienteEnLista != null) {
				if(true) {
					this.clientes.remove(clienteEnLista);
				}/*else {
					throw new Exception ("ERROR: El cliente que se desea quitar tiene al menos un carrito asociado");
				}*/
			}else {
				throw new Exception ("ERROR: El cliente que se desea quitar no existe en la lista");
			}
		}else {
			throw new Exception ("ERROR: La lista esta Vacia");
		}
		
		
		return eliminado;
	}
	
}
