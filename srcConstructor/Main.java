import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		System.out.println("--- Espacio Público ---");
		System.out.print("Introduce el nombre: ");
		String nombre = sc.next();
		//parque.setNombre(nombre);

		System.out.print("Introduce la dirección: ");
		String direccion = sc.next();
		//parque.setDireccion(sc.next());

		System.out.println("   --- Parque ---");
		System.out.print("Introduce el número de bancos: ");
		int numBancos = sc.nextInt();
		//parque.setNumBancos(sc.nextInt());

		Parque parque = new Parque (nombre, direccion);
		parque.setNumBancos(numBancos);

		System.out.println();
		System.out.println("-- Datos Introducidos --");
		System.out.println("Nombre: " + parque.getNombre());
		System.out.println("Dirección: " + parque.getDireccion());
		System.out.println("Número bancos: " + parque.getNumBancos());
	}
}
