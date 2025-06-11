package controller.repaso2;

//FOR
public class For {

    /**
     * Método que devuelve una cadena con los números del 1 al valor dado
     * (numero), excluyendo aquellos que sean divisibles por 3 o por 5
     *
     * @param numero Número entero hasta el cual se generará la secuencia
     * @return Una cadena con los números separados por espacio, excluyendo los
     * múltiplos de 3 o 5
     */
    public String divisor(int numero) {
        String resp = " ";
        for (int i = 1; i <= numero; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                resp = resp + i + " ";
            }
        }
        return resp;
    }

    /**
     * Método que genera y devuelve la secuencia de Collatz para un número dado
     *
     * @param numero Número entero positivo con el que se inicia la secuencia de
     * Collatz
     * @return Una cadena con la secuencia generada, separada por flechas (→)
     */
    public String collatz(int numero) {
        String secuencia = "" + numero;
        for (; numero != 1;) {
            if (numero % 2 == 0) {
                numero /= 2;
            } else {
                numero = numero * 3 + 1;
            }
            secuencia += "→" + numero;
        }
        return secuencia;
    }

    /**
     * Método que calcula el Mínimo Común Múltiplo (MCM) de dos números enteros
     * El MCM es el número positivo más pequeño que es múltiplo común de ambos
     * números
     *
     * @param n1 Primer número entero
     * @param n2 Segundo número entero
     * @return El Mínimo Común Múltiplo de los dos números ingresados
     */
    public int mcm(int n1, int n2) {
        int max = Math.max(n1, n2);
        for (int i = max; i <= n1 * n2; i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                return i;
            }
        }
        return n1 * n2;
    }

    /**
     * Método que encuentra y devuelve los divisores comunes entre dos números
     * Un divisor común es un número que divide exactamente a ambos sin dejar
     * residuo
     *
     * @param n1 Primer número entero
     * @param n2 Segundo número entero
     * @return Una cadena con los divisores comunes, separados por espacio
     */
    public String comun(int n1, int n2) {
        String resultado = "";
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                resultado += i + " ";
            }
        }
        return resultado.trim();
    }
}
