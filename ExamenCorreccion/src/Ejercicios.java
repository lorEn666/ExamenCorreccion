import java.util.Random;
import java.util.Scanner;

public class Ejercicios {
	
	public static void ejer1() {
		
		Scanner leer = new Scanner(System.in);
		int suma=0, num=0;
		
		for (int i = 0; i < 5; i++) {
			
			suma= suma + leer.nextInt();
		}
		System.out.println("La suma total es " + suma);
	}
	
	public static void ejer2(int alt) {
		for (int i = 0; i < alt; i++) {
			for (int j = alt; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void ejer3 (int opc) {
		Scanner leer = new Scanner(System.in);
		String nombre="";
		int cont=0;
		
		System.out.println("Dime un nombre");
		nombre=leer.nextLine();
		
		switch (opc) {
		case 1:
			for (int i = 0; i < nombre.length(); i++) {
				if (!nombre.substring(i, i+1).equals(" ")) {
					cont++;
				}
			}
			System.out.println("Numero de letras: " + cont);
			break;
		case 2:
			System.out.println(nombre.toUpperCase());
			break;
		case 3:
			for (int i = 0; i < nombre.length(); i++) {
				if (i==0 || (nombre.substring(i-1, i).equals(" "))) {
					System.out.print(nombre.substring(i, i+1).toUpperCase());
				}else {
					System.out.print(nombre.substring(i, i+1).toLowerCase());
				}
			}
			break;

		default:
			System.out.println("Opción no válida");
			break;
		}
	}
	
	public static void ejer4() {
		int filas, columnas;
		int[][] matriz;
		Random r = new Random();
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime las filas y las columnas");
		matriz = new int[leer.nextInt()][leer.nextInt()];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(10);
			}
		}
		mostrarMatriz(matriz);
		
	}
	
	private static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int mostrarMenu() {
		int opc = 0;
		Scanner leer = new Scanner(System.in);
		
		do {
			System.out.println("1- Añadir Producto");
			System.out.println("2- Vender Producto");
			System.out.println("3- Ver todos los Productos");
			System.out.println("4- Ver las ganancias");
			System.out.println("5- Salir");
			opc = leer.nextInt();
			
		}while(opc>5 || opc<1);
		
		return opc;
		
	}
	
}
