package views.utiles.ejercicios2;

import controller.repaso2.ejercicios2.Ejercicios2;
import java.util.Scanner;

/**
 * EJECUTOR DE EJERCICIOS PROPUESTOS SECCIÓN 2
 */
public class Utilesejercicios2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Control de acceso a un edificio inteligente");
        System.out.println("2. Simulación de préstamo bancario");
        System.out.println("3. Plantilla de agua potable");
        System.out.println("4. Resolver serie");
        System.out.println("5. Optimización de riego en cultivo");
        int option = sc.nextInt();
        sc.nextLine();
        do {
            switch (option) {
                case 1:
                    // EJERCICIO 1 
                    Ejercicios2.ControllerAcceso eje2 = new Ejercicios2.ControllerAcceso();
                    int intentos = 0;
                    while (intentos < 3) {
                        System.out.println("Usuario: ");
                        String usuario = sc.nextLine();
                        System.out.println("Clave: ");
                        String clave = sc.nextLine();
                        String resultado = eje2.verificaracceso(usuario, clave);
                        System.out.println(resultado);
                        if (resultado.contains("Permitido")) {
                            sc.close();
                            return;
                        }
                        intentos++;
                        if (intentos < 3) {
                            System.out.println("Intentos restantes: " + (3 - intentos));
                        }
                    }
                    System.out.println("Acceso bloqueado por exceder intentos");
                    break;
                case 2:
                    // EJERCICIO 2 
                    System.out.println("Ingrese el monto del préstamo: ");
                    double monto = sc.nextDouble();
                    System.out.println("Ingrese el plazo en meses: ");
                    int plazo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese tipo de préstamo: ");
                    String texto = sc.nextLine().toUpperCase();
                    Ejercicios2.Tipoprestamo tipo = Ejercicios2.Tipoprestamo.valueOf(texto);
                    Ejercicios2.prestamo prestamo = new Ejercicios2.prestamo(monto, plazo, tipo);
                    double CuotaMensual = prestamo.cuotamensual();
                    double TotalAnual = prestamo.totalanual();
                    System.out.printf("Cuota Mensual: $%.2f\n", CuotaMensual);
                    System.out.printf("Amortización Anual: $%.2f\n", TotalAnual);
                    break;
                case 3:
                    // EJERCICIO 3 
                    System.out.println("Ingrese el consumo en m³: ");
                    double consumo = sc.nextDouble();
                    double total = Ejercicios2.calculartotal(consumo);
                    System.out.printf("Total a pagar: $%.2f\n", total);
                    break;
                case 4:
                    // EJERCICIO 4 
                    System.out.println("Ingrese número de terminos: ");
                    int n = sc.nextInt();
                    double resultado = Ejercicios2.calcularserie(n);
                    System.out.println("Serie generada: ");
                    System.out.println(Ejercicios2.serie);
                    System.out.println("Resultado de la serie: " + resultado);

                    // EJERCICIO 5
                    int RiegoTotal = Ejercicios2.riego();
                    System.out.println("El tiempo total de riego en el dia es: " + RiegoTotal + " horas");
                    break;
                default:
                    break;
            }
            System.out.println("Desea salir presione 0 caso contrario cualquier número del menú");
            option = sc.nextInt();
        } while (option != 0);

    }

}
