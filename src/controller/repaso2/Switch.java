package controller.repaso2;

// SWITCH
public class Switch {

    /**
     * Método para determinar la estación del año según el mes
     *
     * @param mes Número de mes
     * @return Nombre de la estación correspondiente al mes ingresado
     */
    public String estacion(int mes) {
        String estacion = "";
        switch (mes) {
            case 1, 12, 2:
                estacion = "Invierno";
                break;
            case 3, 4, 5:
                estacion = "Primavera";
                break;
            case 6, 7, 8:
                estacion = "Verano";
                break;
            case 9, 10, 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes inválido";
                break;
        }
        return estacion;
    }

    /**
     * Método para detectar si un carácter ingresado es una vocal, consonante,
     * número o símbolo
     *
     * @param caracter Caracter individual a evaluar
     * @return Una cadena que indica si el carácter es "Vocal", "Consonante",
     * "Número" o "Símbolo".
     */
    public String verificar(char caracter) {
        String verificar = "";
        switch (caracter) {
            case 'a', 'e', 'i', 'o', 'u':
                verificar = "Vocal";
                break;
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z':
                verificar = "Consonante";
                break;
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                verificar = "Número";
                break;
            default:
                verificar = "Símbolo";
                break;
        }
        return verificar;
    }

    /**
     * Calcular precio de boletos según edad (niño, adulto, mayor).
     *
     * @param n1 Precio de boletos para niños
     * @param a2 Precio de boletos para adultos
     * @param m3 Precio de boletos para adultos mayores
     * @param edad Edad de la persona
     * @return
     */
    public float precio(float n1, float a2, float m3, int edad) {
        int categoria = 0;
        float resultado = 0;
        if (edad >= 3 && edad <= 12) {
            categoria = 1;
        } else if (edad >= 18 && edad <= 59) {
            categoria = 2;
        } else if (edad >= 60) {
            categoria = 3;
        }
        switch (categoria) {
            case 1:
                resultado = n1;
                break;
            case 2:
                resultado = a2;
                break;
            case 3:
                resultado = m3;
                break;
        }
        return resultado;
    }

    /**
     * Método para calcular el índice de masa corporal (IMC)
     *
     * @param peso Peso de la persona en Kilogramos
     * @param estatura Estatura de la persona en metros
     * @return Valor numérico del IMC
     */
    public float calcularimc(float peso, float estatura) {
        return peso / (estatura * estatura);
    }

    /**
     * Método para clasificar el valor del IMC, según la OMS
     *
     * @param imc Valor numérico del IMC calculado
     * @return Texto que indica la clasificación del IMC
     */
    public String IMC(float imc) {
        int categoria = 0;
        String resultado;
        if (imc < 18.5) {
            categoria = 1;
        } else if (imc >= 18.5 && imc <= 24.9) {
            categoria = 2;
        } else if (imc >= 25 && imc <= 29.9) {
            categoria = 3;
        } else if (imc >= 30) {
            categoria = 4;
        }
        switch (categoria) {
            case 1:
                resultado = "Bajo peso";
                break;
            case 2:
                resultado = "Peso normal";
                break;
            case 3:
                resultado = "Sobrepeso";
                break;
            case 4:
                resultado = "Obesidad";
                break;
            default:
                resultado = "Desconocido";
        }
        return resultado;
    }

}
