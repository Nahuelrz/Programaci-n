package funciones;

import java.util.Scanner;

public class tres {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Inserte un número");
		int num = leer.nextInt();
		;
		int cubo= cubo(num);;
System.out.println("El cubo es: " + cubo);
	}

	public static int cubo(int num) {
		int cubo;
		cubo=num*num*num;
		return cubo;
	}

}
