package controller.repaso2;

// DO WHILE 
import java.util.Random;

public class DoWhile {

    /**
     * Método que reduce un número sumando sus dígitos hasta obtener un solo
     * dígito
     *
     * @param num El número entero que se desea reducir
     * @return El único dígito resultante después de sumar todos los dígitos
     * repetidamente
     */
    public int numero(int num) {
        int suma;
        do {
            suma = 0;
            while (num > 0) {
                suma += num % 10;
                num /= 10;
            }
            num = suma;
        } while (num >= 10);
        return num;
    }

    /**
     * Método que genera una secuencia de potencia de 2, comenzando desde 1 y
     * multiplicando por 2 en cada iteración hasta alcanzar como máximo el
     * número 1024 que es mayor a 1000.
     *
     * @return Una cadena que contiene la tabla de potencias de 2 separadas por
     * saltos de línea
     */
    public String potencia() {
        int numero = 1;
        String resultado = "";
        do {
            resultado += numero + "\n";
            numero *= 2;
        } while (numero <= 1024);
        return resultado.trim();
    }

    /**
     * Método para calcular cuántos años se necesitan para que un capital
     * inicial alcance o supere una cantidad, aplicando una tasa de interés
     * compuesta anual
     *
     * @param capital Monto inicial de dinero
     * @param interes2 Tasa de interés anual
     * @param meta Monto objetivo que se desea alcanzar
     * @return La cantidad de años necesarios para superar o alcanzar la meta
     */
    public float interes(float capital, float interes2, float meta) {
        int años = 0;
        String resultado = "";
        interes2 /= 100;
        do {
            capital += capital * interes2;
            años++;
        } while (capital < meta);
        return años;
    }

    /**
     * Método para simular lanzamientos de dos dados hasta obtener doble 6
     *
     * @return Una cadena con el detalle de cada lanzamiento y el total de
     * intentos necesarios para obtener doble 6
     */
    public String dados() {
        Random r = new Random();
        int dado1, dado2;
        int lanzamientos = 0;
        String resultado = "";
        do {
            dado1 = r.nextInt(6) + 1;
            dado2 = r.nextInt(6) + 1;
            lanzamientos++;
            resultado += "Lanzamiento " + lanzamientos + " : " + dado1 + " y " + dado2 + "\n";
        } while (dado1 != 6 || dado2 != 6);
        resultado += "Has obtenido doble 6 en " + lanzamientos + " lanzamientos.";
        return resultado;
    }

}
