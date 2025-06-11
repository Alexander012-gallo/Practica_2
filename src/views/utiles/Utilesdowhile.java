package views.utiles;

import controller.repaso2.DoWhile;
import java.util.Scanner;

// EJECUTOR DE DO - WHILE
public class Utilesdowhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sumar dígitos hasta que quede uno solo");
        System.out.println("2. Tabla de potencia 2");
        System.out.println("3. Calcular Interés Compuesto");
        System.out.println("4. Lanzamiento de dados");
        int option = sc.nextInt();
        DoWhile dw = new DoWhile();
        do {
            switch (option) {
                case 1:
                    // Ejercicio1
                    // Sumar dígitos de un número hasta que quede uno solo.

                    System.out.println("Ingrese un número");
                    int x = sc.nextInt();
                    int result1 = dw.numero(x);
                    System.out.println("El resultado reducido a un solo dígito es:\n" + result1);
                    break;
                case 2:
                    // Ejercicio2
                    // Mostrar tabla de potencia de 2 hasta que supere 1000.

                    String result2 = dw.potencia();
                    System.out.println("Tabla de potencia:\n" + result2);
                    break;
                case 3:
                    // Ejercicio3
                    // Calcular interés compuesto hasta alcanzar cierta cantidad.

                    System.out.println("Ingrese su capital inicial:");
                    float a = sc.nextFloat();
                    System.out.println("Ingrese la tasa de interés:");
                    float b = sc.nextFloat();
                    System.out.println("Ingrese la cantidad que desea alcanzar:");
                    float c = sc.nextFloat();
                    float result3 = dw.interes(a, b, c);
                    System.out.println("Se necesitan " + (int) result3 + " años para alcanzar la meta.");
                    break;
                case 4:
                    // Ejercicio4
                    // Simular lanzamientos de dados hasta obtener doble 6.

                    String result4 = dw.dados();
                    System.out.println(result4);
                    break;
                default:
                    break;
            }
            System.out.println("Desea salir presione 0 caso contrario cualquier número del menú");
            option = sc.nextInt();
        } while (option != 0);

    }
}
