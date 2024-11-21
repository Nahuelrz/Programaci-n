package examen;

import java.util.Scanner;

/* Dado un menu se nos ofrecen las siguientes opciones:
* 1.Perímetro triángulo
* 2. Área triángulo
* 3.Salir
* En la opción 1 crearemos una funcion llamada
* perimetroT(double num,double num2,double num3) en la cual se recive 3 números
* correspondientes con el valor de los lados. La funcion devuelve un double
* que es el perímetro del triángulo.
* Opción 2: crear una función áreaT(double base, double altura) y
* que muestra por pantalla el área del trángulo.
* Opción : Salir del bucle infinito.
* */
public class metodo {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Elige una opción: 1. Perímetro triángulo 2. Área triángulo 3. Salir");
		int opcion = leer.nextInt();
		while (opcion!=3) {
		switch (opcion) {
		case 1:
			System.out.println("Dame el valor de los lados: ");
			double num = leer.nextDouble();
			double num2 = leer.nextDouble();
			double num3 = leer.nextDouble();
		    double resultado = perimetroT(num, num2, num3);
		    System.out.println("El perímetro es: " + resultado);
			break;

		case 2:
			System.out.println("Dame la altura y la base");
			double base = leer.nextDouble();
			double altura = leer.nextDouble();
			double resultado2 = áreaT(altura, base);
			System.out.println("El área es: " + resultado2);
			break;
		}
		System.out.println("Elige una opción: 1. Perímetro triángulo 2. Área triángulo 3. Salir");
		opcion = leer.nextInt();
		}
		System.out.println("Has salido del programa.");
}
	private static double áreaT(double altura, double base) {
		double resultado2 = (altura * base) / 2;
		return resultado2;
	}

	private static double perimetroT(double num, double num2, double num3) {
		double resultado = num + num2 + num3;
		return resultado;
	}
}
