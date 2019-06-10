package test;
import model.*;

public class TestSupermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supermercado sup = new Supermercado();
		try {
			sup.getAdmProducto().modificarProducto(1, "danette", 200);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {			
			sup.getAdmProducto().eliminarProducto(12);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sup.getAdmProducto().agregarProducto("mouse", 20);
			sup.getAdmProducto().agregarProducto("parlante", 173);
			sup.getAdmProducto().agregarProducto("teclado", 91);
			sup.getAdmProducto().agregarProducto("queso", 265);
			System.out.println(sup.getAdmProducto());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sup.getAdmProducto().agregarProducto("parlante", 173);
			System.out.println(sup.getAdmProducto());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sup.getAdmProducto().modificarProducto(1,"chocolate", 100);
			System.out.println(sup.getAdmProducto());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sup.getAdmProducto().modificarProducto(10,"monitor", 130);
			System.out.println(sup.getAdmProducto());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sup.getAdmProducto().eliminarProducto(2);
			System.out.println(sup.getAdmProducto());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sup.getAdmProducto().eliminarProducto(19);
			System.out.println(sup.getAdmProducto());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}


/*
try {
	
}catch (Exception e) {
	System.out.println(e.getMessage());
}
*/