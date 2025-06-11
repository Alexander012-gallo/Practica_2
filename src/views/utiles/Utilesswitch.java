package views.utiles;

import controller.repaso2.Switch;
import java.util.Scanner;

// EJECUTOR DE SWITCH
public class Utilesswitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Determinar estación del año según el número de mes");
        System.out.println("2. Detectar carácter");
        System.out.println("3. Precio de boletos según la edad");
        System.out.println("4. Clasificación IMC");
        int option = sc.nextInt();
        Switch s = new Switch();
        do {
            switch (option) {
                case 1:
                    // Ejercicio1
                    // Determinar la estación del año según el número del mes

                    System.out.println("Ingrese el número del mes");
                    int mes = sc.nextInt();
                    String result1 = s.estacion(mes);
                    System.out.println("La estación de año es: " + result1);
                    break;
                case 2:
                    // Ejercicio2
                    // Detectar si un carácter es vocal, consonante o símbolo.

                    System.out.println("Ingrese el carácter en minúsculas y sin tildes");
                    char ch = sc.next().charAt(0);
                    String result2 = s.verificar(ch);
                    System.out.println("El carácter ingresado es: " + result2);
                    break;
                case 3:
                    // Ejercicio3
                    // Calcular precio de boletos según edad (niño, adulto, mayor).

                    System.out.println("Ingrese el valor del boleto para niño");
                    float n1 = sc.nextFloat();
                    System.out.println("Ingrese el valor del boleto para adulto");
                    float a2 = sc.nextFloat();
                    System.out.println("Ingrese el valor del boleto para adulto mayor");
                    float m3 = sc.nextFloat();
                    System.out.println("Ingrese la edad");
                    int e4 = sc.nextInt();
                    float result3 = s.precio(n1, a2, m3, e4);
                    System.out.println("El valor a pagar es: $" + result3);
                    break;
                case 4:
                    // Ejercicio4
                    // Clasificación de IMC según valor ingresado.

                    System.out.println("Ingrese su peso en Kg");
                    float x = sc.nextFloat();
                    System.out.println("Ingrese su estatura");
                    float y = sc.nextFloat();
                    float result4 = s.calcularimc(x, y);
                    System.out.println("IMC:\n" + result4);
                    String result5 = s.IMC(result4);
                    System.out.println("Clasificación:\n" + result5);
                    break;
                default:
                    break;
            }
            System.out.println("Desea salir presione 0 caso contrario cualquier número del menú");
            option = sc.nextInt();
        } while (option != 0);

    }

}
