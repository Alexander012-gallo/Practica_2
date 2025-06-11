/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.repaso;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Repaso {

    /*transformar a letras las notas de los estudiantes 
    A 10
    B 9
    C 8
    E 7
    F 6 .... 0
     */
    public char transformarNotaLetra(float nota) {
        char resp = ' ';
        switch ((int) nota) {
            case 10:
                resp = 'A';
                break;
            case 9:
                resp = 'B';
                break;
            case 8:
                resp = 'C';
                break;
            case 7:
                resp = 'D';
                break;
            case 6:
                resp = 'E';
                break;
            default:
                resp = 'F';
                break;
        }
        return resp;
    }

    // numero perfecto
    public boolean verificar_num_perfecto(int num) {
        boolean band = false;
        int aux = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                aux = aux + i;
            }
        }
        if (num == aux) {
            band = true;
        }
        return band;
    }

    // Dada una hora en formato HH:MM (ej. 14:30) y una diferencia horaria (ej. +3 horas), calcular la nueva hora.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, x, min;
        char sig;
        System.out.println("Ingrese la hora: ");
        x = sc.nextByte();
        System.out.println("Ingrese el signo: ");
        sig = sc.next().charAt(0);
        System.out.println("Ingrese los minutos: ");
        min = sc.nextByte();
        System.out.println("Ingrese el numero de horas a calcular; ");
        hora = sc.nextByte();
        if (sig == '+') {
            System.out.println("El resultado es: " + (x + hora) + ":" + min);
        } else if (sig == '-') {
            System.out.println("El resultado es: " + (x - hora) + ":" + min);
        }
    }
}


