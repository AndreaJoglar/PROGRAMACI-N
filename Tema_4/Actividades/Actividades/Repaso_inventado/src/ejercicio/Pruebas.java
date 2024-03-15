package ejercicio;

public class Pruebas {

	public static void main(String[] args) {
		
		Producto p = new Producto("Pro1", "Fab1", 150, false);
		Producto p1 = new Producto("Pro2", "Fab2", 200, false);
		Producto p2 = new Producto("Pro3", "Fab3", 100, false);
		Producto p3 = new Producto("Pro4", "Fab4", 50, false);
		
		Comprador c1 = new Comprador("Comp1", "Ap1", "1111");
		Comprador c2 = new Comprador("Comp2", "Ap2", "2222");
		Comprador c3 = new Comprador("Comp3", "Ap3", "3333");
		
		DetalleVenta det = new DetalleVenta(p, 1);
		DetalleVenta det2 = new DetalleVenta(p1, 5);
		DetalleVenta det3 = new DetalleVenta(p2, 10);
		DetalleVenta det4 = new DetalleVenta(p3, 3);
		
		
		Venta v1 = new Venta();
		
		v1.insertarComprador(c1);
		v1.ingresarDetalleVenta(det3);
		v1.ingresarDetalleVenta(det2);
		
		
		
		Tienda tienda = new Tienda();
		
		tienda.insertarProducto(p);
		tienda.insertarProducto(p1);
		tienda.insertarProducto(p2);
		tienda.insertarProducto(p3);
		tienda.insertarVenta(v1);
		
		System.out.println("Ventas " + tienda.listarVenta());
		
		
		
		System.out.println("Productos de la tienda: \n" + tienda.listarProductosTienda());
		System.out.println("Ventas: \n" + tienda.listarVenta());
		v1.devolverProducto(p2);
		
		System.out.println("Devolución: " + tienda.listarVenta());
		
		
		
	}

}
