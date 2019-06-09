package test;
import model.*;

public class TestSupermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supermercado sup = new Supermercado();
		try {
			sup.modificarProducto(1, "danette", 200);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {			
			sup.eliminarProducto(12);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sup.agregarProducto("mouse", 20);
			sup.agregarProducto("parlante", 173);
			sup.agregarProducto("teclado", 91);
			sup.agregarProducto("queso", 265);
		
			System.out.println(sup);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sup.agregarProducto("parlante", 173);
			System.out.println(sup);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sup.modificarProducto(1,"chocolate", 100);
			System.out.println(sup);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sup.modificarProducto(10,"monitor", 130);
			System.out.println(sup);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sup.eliminarProducto(2);
			System.out.println(sup);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sup.eliminarProducto(19);
			System.out.println(sup);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
>>>>>>> e5f5daa200c8fe60373b0f629ec2d586d01afaf5
	}

}
/*
try {
	
}catch (Exception e) {
	System.out.println(e.getMessage());
}
*/