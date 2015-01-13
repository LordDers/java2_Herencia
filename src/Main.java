import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	EspacioPublico ep = new EspacioPublico ();
    	Parque parque = new Parque ();

    	Scanner sc = new Scanner (System.in);

    	System.out.println("--- Espacio Público ---");
    	System.out.print("Introduce el nombre: ");
    	String nombre = sc.next();
    	parque.setNombre(nombre);

    	System.out.print("Introduce la dirección: ");
    	parque.setDireccion(sc.next());

    	System.out.println("   --- Parque ---");
    	System.out.print("Introduce el número de bancos: ");
    	parque.setNumBancos(sc.nextInt());

    	System.out.println("-- Datos Introducidos --");
    	System.out.println("Nombre: " + parque.getNombre());
    	System.out.println("Dirección: " + parque.getDireccion());
    	System.out.println("Número bancos : " + parque.getNumBancos());
    }
}