package views.utiles.ejercicios2;

import controller.repaso2.ejercicios2.Operaciones;
import controller.repaso2.ejercicios2.Operaciones.Contador;
import java.util.Scanner;

public class Ensayo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Parámetros por valor");
        System.out.println("2. Parametros por referencia");
        System.out.println("3. Estructura condicional MIENTRAS");
        System.out.println("4. Estrcutura condicional HACER MIENTRAS");
        System.out.println("5. Días de la semana");
        int option = sc.nextInt();
        do {
            switch (option) {
                case 1:
                    // Paso de parametros por valor 
                    int mivalor = 5;
                    System.out.println("Antes de llamar a incrementar, mi valor es: " + mivalor);
                    Operaciones.incrementar(mivalor);
                    System.out.println("Después de llamar a incrementar, mi valor es: " + mivalor);
                    break;

                case 2:
                    // Paso de parametros por referencia
                    Operaciones.Contador micontador = new Operaciones.Contador(10);
                    System.out.println("Antes de llamar, mi contador es: " + micontador.valor);
                    Operaciones.incrementar(micontador);
                    System.out.println("Despues de llamar, mi contador es: " + micontador.valor);
                    break;

                case 3:
                    // Estrcutura de while
                    Operaciones.incrementarcont();
                    break;

                case 4:

                    // Estructura do - while
                    int numero;
                    boolean bandera;
                    do {
                        System.out.println("Ingrese un número: ");
                        numero = sc.nextInt();
                        bandera = Operaciones.bandera(numero);
                    } while (bandera);
                    System.out.println("Haz ingresado un número negativo");
                    break;

                case 5:
                    // Imprimir los dias de la semana 
                    Operaciones op = new Operaciones();
                    System.out.println("Ingrese el número de dia: ");
                    int x = sc.nextInt();
                    String dia = op.semana(x);
                    break;
                default:
                    break;
            }
            System.out.println("Desea salir presione 0 caso contrario cualquier número del menú");
            option = sc.nextInt();
        } while (option != 0);

    }

}
