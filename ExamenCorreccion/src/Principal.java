
public class Principal {

	public static void main(String[] args) {
		
		//Ejercicios.ejer1();
		//Ejercicios.ejer2(10);
		//Ejercicios.ejer3(3);
		//Ejercicios.ejer4();
		Tienda t = new Tienda();
		int opc = 0;
		do {
			switch (opc = Ejercicios.mostrarMenu()) {
			case 1:
				Producto p = new Producto("Ordenador", 50, 50);
				t.anadirProducto(p);
				break;
			case 2:
				if (t.venderProducto("Ordenador", 50)) {
					System.out.println("Producto vendido");
				}else {
					System.out.println("No hay stock");
				}
				break;
			case 3:
				System.out.println(t);
				break;
			case 4:
				System.out.println(t.verGanancias());
				break;
			case 5:
				System.out.println("Adios");
				break;

			default:
				break;
			}
		}while(opc!=5);
	}

}
