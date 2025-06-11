package controller.repaso2.ejercicios2;

import java.util.ArrayList;
import java.util.List;

// EJERCICIO DE SECCIÓN 2 
/**
 * Una empresa de oficinas dispone de torniquetes con lectores de tarjeta. Cada
 * empleado tiene un nivel de acceso: VISITANTE, EMPLEADO, ADMINISTRADOR. Crea
 * un enum NivelAcceso y un programa que, leyendo un flujo de eventos de
 * tarjetas, que permita o deniegue el paso. El usuario debe proporcionar su
 * usuario y clave solo se permiten tres intentos
 */
public class Ejercicios2 {

    public enum NivelAcceso {
        VISITANTE, EMPLEADO, ADMINISTRADOR
    }

    public static class Empleado {

        private String usuario;
        private String clave;
        private NivelAcceso nivel;

        public Empleado(String usuario, String clave, NivelAcceso nivel) {
            this.usuario = usuario;
            this.clave = clave;
            this.nivel = nivel;
        }

        /**
         *
         * @param u Prámetro que representa el nombre de usuario ingresado
         * @param c Parámetro que representa la clave ingresada
         * @return Devuelve un true si usuario y clave coinciden y un false si
         * no
         */
        public boolean autenticar(String u, String c) {
            return usuario.equals(u) && clave.equals(c);

        }

        /**
         * Obtiene el nivel de acceso del empleado
         *
         * @return el nicel de acceso asignado
         */
        public NivelAcceso getnivel() {
            return nivel;
        }
    }

    public static class ControllerAcceso {

        private List<Empleado> empleados;

        public ControllerAcceso() {
            empleados = new ArrayList<>();
            empleados.add(new Empleado("Alex", "0961", NivelAcceso.EMPLEADO));
            empleados.add(new Empleado("María", "admin", NivelAcceso.ADMINISTRADOR));
            empleados.add(new Empleado("Luis", "visit", NivelAcceso.VISITANTE));
        }

        /**
         *
         * @param usuario Nombre de usuario ingresado por teclado
         * @param clave Clave ingresada por usuario
         * @return Un mensaje de texto indicando si el acceso fue permitido o
         * denegado
         */
        public String verificaracceso(String usuario, String clave) {
            for (Empleado e : empleados) {
                if (e.autenticar(usuario, clave)) {
                    return "Torniquete abierto. Acceso Permitido. Nivel: " + e.getnivel();
                }
            }
            return "Torniquete bloqueado. Acceso Denegado";
        }
    }

    /**
     * Un banco concede préstamos de TIPO_PERSONAL, HIPOTECARIO o COFIDIS. Cada
     * tipo tiene su propia tasa de interés. Calcula la cuota mensual con la
     * fórmula correspondiente y muestra amortización anual.
     */
    // eje 2 
    public enum Tipoprestamo {
        TIPO_PERSONAL, HIPOTECARIO, COFIDIS
    }

    public static class prestamo {

        private double monto;
        private int PlazoMeses;
        private Tipoprestamo tipo;

        public prestamo(double monto, int PlazoMeses, Tipoprestamo tipo) {
            this.monto = monto;
            this.PlazoMeses = PlazoMeses;
            this.tipo = tipo;
        }

        public double tasanual() {
            switch (tipo) {
                case TIPO_PERSONAL:
                    return 0.12;
                case HIPOTECARIO:
                    return 0.08;
                case COFIDIS:
                    return 0.18;
                default:
                    return 0.10;
            }
        }

        public double cuotamensual() {
            double TasaMensual = tasanual() / 12;
            return (monto * TasaMensual) / (1 - Math.pow(1 + TasaMensual, -PlazoMeses));
        }

        public double totalanual() {
            return cuotamensual() * 12;
        }
    }

    /**
     * Método que calcula el total a pagar por el consumo de agua, incluyendo
     * cargos por alcantarillado, tasa de basura y procesamiento.
     *
     * @param consumo Cantidad de agua consumida en m^3
     * @return Total a pagar considerando consumo de bse, excesos y tasas
     * adicionales
     */
    public static double calculartotal(double consumo) {
        double ValorAgua = 3.00;
        if (consumo > 15) {
            double exceso = consumo - 15;
            if (exceso <= 10) {
                ValorAgua += exceso * 0.10;
            } else if (exceso <= 25) {
                ValorAgua += 10 * 0.10 + (exceso - 10) * 0.20;
            } else if (exceso <= 45) {
                ValorAgua += 10 * 0.10 + 15 * 0.20 + (exceso - 25) * 0.30;
            } else {
                ValorAgua += 10 * 0.10 + 15 * 0.20 + 20 * 0.30 + (exceso - 45) * 0.35;
            }
        }
        double Alcantarillado = ValorAgua * 0.35;
        double TasaBasura = 0.75;
        double TasaProcesamiento = 0.50;
        return ValorAgua + Alcantarillado + TasaBasura + TasaProcesamiento;
    }

    /**
     * Reconozca, genere mediante teclado, y resuelva la siguiente serie (1 /
     * 1)^2 + (1 / 3)^4 - (2 / 5)^6 - (3 / 7)^8 + (5 / 9)^10 + (8 / 11)^12 ….
     */
    public static String serie = "";
    public static double calcularserie(int terminos) {
        double suma = 0.0;
        int num1 = 1, num2 = 1;
        int denominador = 1;
        int exponente = 2;
        serie = "";
        for (int i = 1; i <= terminos; i++) {
            double base = (double) num1 / denominador;
            double potencia = Math.pow(base, exponente);
            String signo = (((i - 1) / 2) % 2 == 0) ? "+" : "-";

            if (i == 1) {
                serie += String.format("(%d/%d)^%d", num1, denominador, exponente);
                suma += potencia;
            } else {
                serie += String.format(" %s (%d/%d)^%d", signo, num1, denominador, exponente);
                suma += signo.equals("+") ? potencia : -potencia;
            }
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;

            denominador += 2;
            exponente += 2;

        }
        return suma;
    }

    /**
     * Método que calcula el tiempo total de riego en base a 12 mediciones
     * aleatorias de humedad
     *
     * @return Tiempo total de riego e minutos
     */
    public static int riego() {
        int TiempoRiego = 0;
        for (int i = 0; i < 12; i++) {
            int humedad = (int) (Math.random() * 101);

            if (humedad < 30) {
                TiempoRiego += 2;
            }
        }
        return TiempoRiego;
    }

}
