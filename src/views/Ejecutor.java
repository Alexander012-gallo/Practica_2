/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controller.repaso.Repaso;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {
    private static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        //para repaso transformar Nota
        System.out.println("Ingrese la nota");
        float nota = sc.nextFloat();
        Repaso rp = new Repaso ();
        char letra_nota = rp.transformarNotaLetra(nota);
        System.out.println("La nota es: " +letra_nota);      
}
}

