package funciones;

import java.util.Scanner;

public class cuatro {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int n1 = leer.nextInt();
		System.out.println("Introduzca otro número");
		int n2 = leer.nextInt();
		int menor= menor(n1, n2);
		System.out.println("El número menor es: " + menor);

	}

	public static int menor(int n2, int n1) {
		if (n1>n2) {return n2;
		} else return n1;
	}
}
