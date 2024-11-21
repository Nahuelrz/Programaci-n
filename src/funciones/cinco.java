package funciones;

import java.util.Scanner;

public class cinco {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Inserte un número");
		int num = leer.nextInt();
		int uno = 1;
		int cero = 0;
		int neg = -1;
		int real= real(num);

		System.out.println(real);

	}

	public static int real(int num) {
		int uno = 1;
		int cero = 0;
		int neg = -1;
		if (num>0) {return uno;} else if (num<0) {return neg;} else return cero;

}
}