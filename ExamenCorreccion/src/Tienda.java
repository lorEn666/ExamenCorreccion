import java.util.Arrays;

public class Tienda {

	private Producto[] vProductos;
	private double caja;
	
	public Tienda() {
		vProductos = new Producto[10];
		caja = 0;
	}
	
	public boolean anadirProducto(Producto p) {
		
		for (int i = 0; i < vProductos.length; i++) {
			if(vProductos[i]!=null && vProductos[i].getNombre().equalsIgnoreCase(p.getNombre())) {
				vProductos[i].anadir();
				return false;
			}
		}
		
		for (int i = 0; i < vProductos.length; i++) {
			if(vProductos[i] == null) {
				vProductos[i] = p;
				return true;
			}
		}
		
		return false;
	}
	
	
	public boolean venderProducto(String nombre, int cantidad) {
		
		for (int i = 0; i < vProductos.length; i++) {
			if (vProductos[i] != null && vProductos[i].getNombre().equalsIgnoreCase(nombre)) {
				if (vProductos[i].vender(cantidad)) {
					caja += cantidad * vProductos[i].getPrecio();
					return true;
				}else {
					return false;
				}
				
			}
		}
		
		
		return false;
	}

	@Override
	public String toString() {
		String datos="";
		
		for (int i = 0; i < vProductos.length; i++) {
			if (vProductos[i]!= null)
				datos += vProductos[i].toString() + "\n";
		}
		
		return datos;
	}
	
	public double verGanancias() {
		return caja;
	}
	
	
	
}
