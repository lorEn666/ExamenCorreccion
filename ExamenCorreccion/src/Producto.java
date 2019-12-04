
public class Producto {

	private String nombre;
	private double precio;
	private int unidades;
	
	public Producto(String nombre, double precio, int unidades) {
		this.nombre = nombre;
		this.precio = precio;
		this.unidades = unidades;
	}

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.unidades = 1;
	}
	
	public void anadir() {
		unidades++;
	}
	
	public void anadir(int unidades) {
		this.unidades+=unidades;
	}
	
	public void vender() {
		if (unidades>0)
			this.unidades--;
	}
	
	public boolean vender(int unidades) {
		if (this.unidades-unidades>=0) {
			this.unidades-=unidades;
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", unidades=" + unidades + "]";
	}
	
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	
}
