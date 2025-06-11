package controller.repaso2;

// WHILE 
public class While {

    /**
     * Método que convierte un número decimal en su equivalente binario
     *
     * @param decimal Número entero positivo que se desea convertir a binario
     * @return Una cadena de texto que representa el número binario
     */
    public String binario(int decimal) {
        String binario = "";
        int num = decimal;
        if (num == 0) {
            return "0";
        }
        while (num > 0) {
            int residuo = num % 2;
            binario = residuo + binario;
            num = num / 2;
        }
        return binario;
    }

    /**
     * Método que determina si un número entero es palíndromo. Un número es
     * palíndromo si se lee igual de izquierda a derecha que de derecha a
     * izquierda.
     *
     * @param numero Número entero que se desea evaluar
     * @return True si el número es palíndromo, False en caso contrario
     */
    public boolean palíndromo(int numero) {
        int original = numero;
        int invertido = 0;
        while (numero > 0) {
            int num = numero % 10;
            invertido = invertido * 10 + num;
            numero = numero / 10;
        }
        return original == invertido;
    }

    /**
     * Método que calcula la raíz cúbica entera de un número. Retorna el valor
     * entero más grande cuya raíz cúbica elevada al cubo no exceda al número
     * dado
     *
     * @param numero Número entero no negativo del que se desea obtener la raíz
     * cúbica entera
     * @return la raíz cúbica entera
     */
    public int raiz(int numero) {
        int i = 0;
        while (i * i * i <= numero) {
            i++;
        }
        return i - 1;
    }

    /**
     * Método que revierte (invierte) las cifras de un número entero. Por
     * ejemplo, si se recibe 1234, devuelve 4321
     *
     * @param numero Número entero que se desea invertir
     * @return El número con sus cifras invertidas
     */
    public int revertir(int numero) {
        int invertir = 0;
        int num = numero;
        while (num != 0) {
            int digito = num % 10;
            invertir = invertir * 10 + digito;
            num = num / 10;
        }
        return invertir;
    }
}
