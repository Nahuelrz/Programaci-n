package funciones;

import java.util.Scanner;

public class siete {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int n1 = leer.nextInt();
		int cifras = cifras(n1);
		System.out.println("Hay " + cifras + " cifras en este número");
	}

	private static int cifras(int n1) {
		int cifras = 0;
		while (n1 != 0) {
			n1 = n1 / 10;
			cifras++;
	

		}
		return cifras;
}
}