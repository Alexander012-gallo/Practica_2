package views.utiles;

import controller.repaso2.For;
import java.util.Scanner;

// EJECUTOR DE FOR
public class Utilesfor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Números de 1 a 1000 que no sean divisibles por 3 ni por 5");
        System.out.println("2. Secuencia Collatz");
        System.out.println("3. Mínimo Comun Múltiplo");
        System.out.println("4. Divisores Comunes");
        int option = sc.nextInt();
        For f = new For();
        do {
            switch (option) {
                case 1:
                    // Ejercicio1
                    // Mostrar todos los números de 1 a 100 que no sean divisibles por 3 ni por 5

                    String result = f.divisor(100);
                    System.out.println("Los numeros de 1 a 100 que no son divisibles por 3 ni por 5 son:\n" + result);
                    break;
                case 2:
                    // Ejercicio2
                    // Generar la secuencia de Collatz de un número.

                    System.out.println("Ingrese el número: ");
                    int numero = sc.nextInt();
                    String result2 = f.collatz(numero);
                    System.out.println("La secuencia de Collatz del siguiente numero es: " + result2);
                    break;
                case 3:
                    // Ejercicio3
                    // Calcular el mínimo común múltiplo de dos numeros

                    System.out.println("Ingrese el número 1: ");
                    int a = sc.nextInt();
                    System.out.println("Ingrese el número 2: ");
                    int b = sc.nextInt();
                    int result3 = f.mcm(a, b);
                    System.out.println("El MCM de los numeros dados es: " + result3);
                    break;
                case 4:
                    // Ejercicio4
                    // Encontrar los divisores comunes de dos números dados

                    System.out.println("Ingrese el número 1: ");
                    int x = sc.nextInt();
                    System.out.println("Ingrese el número 2: ");
                    int y = sc.nextInt();
                    String result4 = f.comun(x, y);
                    System.out.println("Los divisores comunes de los dos numeros son: " + result4);
                    break;
                default:
                    break;
            }
            System.out.println("Desea salir presione 0 caso contrario cualquier número del menú");
            option = sc.nextInt();
        } while (option != 0);

    }
}
