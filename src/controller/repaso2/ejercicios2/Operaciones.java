package controller.repaso2.ejercicios2;

// ENSAYO 
public class Operaciones {

    /**
     *  Incrementa en 1 el valor del número recibido como parámetro 
     *  y lo imprime en consola. 
     * @param numero el número entero que sea desea incrementar 
     */
    public static void incrementar(int numero) {
        numero += 1;
        System.out.println("Dentro de operaciones incremenar el número es: " + numero);
    }

    /**
     * Pasos de parámetro por referencia
     */
    public static class Contador {
        public int valor;
        public Contador(int valorinicial) {
            this.valor = valorinicial;
        }
    }
    /**
     * Este método incrementa en 5 el valor del atributo 'valor' del objeto Contador.
     * @param contador el objeto que contiene el valor que será incrementado
     */
    public static void incrementar(Contador contador) {
        contador.valor += 5;
        System.out.println("Dentro de incrementar el contador es: " + contador.valor);
    }

    /**
     * Este método muestra por consola los números del 0 al 10.
     */
    public static void incrementarcont() {
        int cont = 0;
        while (cont <= 10) {
            System.out.println("El contador es: " + cont);
            cont++;
        }
    }

    /**
     * Este método sirve para saber si un número es positivo o cero.
     * @param numero el número que se evalúa como condición de continuación 
     * @return verdadero si el numero es positivo o 0, falso si es negativo
     */
    public static boolean bandera(int numero) {
        return numero >= 0;
    }

    /**
     * Este método recibe un número que representa un día de la semana
     * y muestra mensajes para cada día desde el 1 hasta ese número.
     * @param dia el número del día hasta donde se quiere mostrar 
     * @return el mensaje correspondiente al último dia evaluado 
     */
    public String semana(int dia) {
        String smg = " ";
        for (int i = 1; i <= dia; i++) {
            switch (i) {
                case 1:
                    smg = "Lunes, Mal día";
                    break;
                case 2:
                    smg = "Martes, Buen día";
                    break;
                case 3:
                    smg = "Miércoles, Mal día";
                    break;
                case 4:
                    smg = "Jueves, Buen día";
                    break;
                case 5:
                    smg = "Viernes, Mal día";
                    break;
                default:
                    smg = "Días de descanso";
                    break;
            }
            System.out.println(smg);
            if (i % 2 == 0) {
                System.out.println("Es un gran día para aprender Teoría de la Prograación");
            }
        }
        return smg;
    }
}
