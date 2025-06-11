package views.utiles;

import controller.repaso2.While;
import java.util.Scanner;

// EJECUTOR DE WHILE 
public class Utileswhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Número decimal a binario");
        System.out.println("2. Número palíndromo");
        System.out.println("3. Raíz cúbica entera");
        System.out.println("4. Revertir un número entero");
        int option = sc.nextInt();
        While w = new While();
        do {
            switch (option) {
                case 1:
                    // Ejercicio1
                    // Convertir un numero decimal a binario.

                    System.out.println("Ingrese el número decimal: ");
                    int result1 = sc.nextInt();
                    String result = w.binario(result1);
                    System.out.println("El numero binario es:\n" + result);
                    break;
                case 2:
                    // Ejercicio2
                    // Determinar si un número es palíndromo.

                    System.out.println("Ingrese un número: ");
                    int numero = sc.nextInt();
                    boolean result2 = w.palíndromo(numero);
                    if (result2) {
                        System.out.println("El número es palíndromo.");
                    } else {
                        System.out.println("El número no es palíndromo.");
                    }
                    break;
                case 3:
                    // Ejercicio3
                    // Encontrar la raiz cúbica entera de un número.

                    System.out.println("Ingrese el número: ");
                    int raiz = sc.nextInt();
                    int result3 = w.raiz(raiz);
                    System.out.println("La raiz cúbica del número es: " + result3);
                    break;
                case 4:
                    // Ejercicio4
                    // Revertir un número entero.

                    System.out.println("Ingrese el número que desea revertir: ");
                    int revertir = sc.nextInt();
                    int result4 = w.revertir(revertir);
                    System.out.println("El número revertido es: " + result4);
                    break;
                default:
                    break;

            }
            System.out.println("Desea salir presione 0 caso contrario cualquier número del menú");
            option = sc.nextInt();

        } while (option != 0);
    }
}
