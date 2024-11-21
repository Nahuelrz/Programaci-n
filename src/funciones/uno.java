package funciones;

import java.util.Scanner;

public class uno {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int n1 = leer.nextInt();
		int resultado = suma(n1);
		System.out.println("La suma de los digitos es: " + resultado);
	}

	public static int suma(int n1) {
		int suma = 0;

		int digito;
		while (n1 != 0) {
			 digito = n1 % 10;
			suma = digito + suma;
			 n1 = n1 / 10;
			 
			
		}
		return suma;
	}
}
