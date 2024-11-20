package funciones;

import java.util.Scanner;

public class dos {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int n1 = leer.nextInt();
		int resultado = Factoria(n1);
		System.out.println("La factorial del número es: " + resultado);
	}

	public static int Factoria(int n1) {
		for (int i=n1; i >0; i--) {
			n1 = n1 * (n1-1);
		}
		return n1;
	}
}
