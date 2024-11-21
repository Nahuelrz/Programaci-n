package examen;
import java.util.Scanner;

public class temperature {
    private static final float K_32F = 32f;
	private static final float K_5F = 5f;
	private static final float K_9F = 9f;
	private static final float K273_15F = 273.15f;
	public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        init();

        byte option = menu();

        if (option == 1) {
            String text = "Enter the degrees in Celsius: ";

            float temp = initTemp(text);

            //T(°F) = 32 + 9 * T(°C) / 5    
            float fahrenheit = celsius2Fahrenheit(temp);

            System.out.printf("%nThe degrees in Fahrenheit is %.2f\u00B0F" , fahrenheit);
        }
        else if (option == 2) {
            String text = "Enter the degrees in Celsius: ";

            float temp = initTemp(text);

            //T(°K) =  T(°C) + 273.15   
            float kelvin = celsius2Kelvin(temp);

            System.out.printf("%nThe degrees in Kelvin is %.2f\u00B0K" , kelvin);
        }
        else if (option == 3) {
            String text = "Enter the degrees in Fahrenheit: ";

            float temp = initTemp(text);


            //°C = (°F - 32) / (5/9)        
            float celsius = fahrenheit2Celsius(temp);

            System.out.printf("%nThe degrees in Celsius is %.2f\u00B0C" , celsius);

        }
        else if (option == 4) {
            String text = "Enter the degrees in Fahrenheit: ";
            
            float temp = initTemp(text);

            //°K = 5/9 * (ºF – 32) + 273.15
            float kelvin = fahrenheit2Kelvin(temp);

            System.out.printf("%nThe degrees in Kelvin is %.2f\u00B0K" ,  kelvin);

        } else if (option == 5){
            String text = "Enter the degrees in Kelvin: ";

            float temp = initTemp(text);


            // ºC = ºK – 273.15
            float celsius = kelvin2Celsius(temp);

            System.out.printf("%nThe degrees in Celsius is %.2f\u00B0C" ,  celsius);

        } else {
            String text = "Enter the degrees in Kelvin: ";

            float temp = initTemp(text);


            // ºF = (9/5)*(K – 273.15) + 32
            float fahrenheit = kelvin2Fahrenheit(temp);

            System.out.printf("%nThe degrees in Fahrenheit is %.2f\u00B0F" ,  fahrenheit);
        }
        sc.close();
    }

	private static float kelvin2Fahrenheit(float temp) {
		return (K_9F / K_5F) * (temp - K273_15F) + K_32F;
	}

	private static float kelvin2Celsius(float temp) {
		return temp - K273_15F;
	}

	private static float fahrenheit2Kelvin(float temp) {
		return K_5F / K_9F *( temp - 32) + K273_15F;
	}

	private static float fahrenheit2Celsius(float temp) {
		return (temp - K_32F) * K_5F / K_9F;
	}

	private static float celsius2Kelvin(float temp) {
		return temp + K273_15F;
	}

	private static float celsius2Fahrenheit(float temp) {
		return K_32F + K_9F * temp/K_5F;
	}

	private static float initTemp(String text) {
		System.out.print(text);
		float temp = 0;
		boolean isValid = false;
		while (!isValid) {
		    if (sc.hasNextFloat()) {
		        temp = sc.nextFloat();
		        isValid = true;
		    } else {
		        sc.next();
		        System.out.println("\nError: " + text);
		    }
		}
		return temp;
	}

	private static byte menu() {
		System.out.println("\nWhat do you want to convert:\n"
                + "1. Celsius to Fahrenheit\n"
                + "2. Celsius to Kelvin\n"
                + "3. Fahrenheit to Celsius\n"
                + "4. Fahrenheit to Kelvin\n"
                + "5. Kelvin to Celsius\n"
                + "6. Kelvin to Fahrenheit");

        System.out.print("\nEnter your option? ");

        byte option = sc.nextByte();
		return option;
	}

	private static void init() {
		System.out.println("**********************************************************************\n"
                + "* TEMPERATURE CONVERSION                              © Joan Sèculi  *\n"
                + "*                                                                    *\n"
                + "* This program converts between CELSIUS, FAHRENHEIT and KELVIN       *\n"
                + "**********************************************************************");
	}
}