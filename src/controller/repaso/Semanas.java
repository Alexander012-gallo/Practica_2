/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.repaso;

import java.util.Scanner;

/**
 *
 *  
 *
 */
public class Semanas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String DiaSemana;
        System.out.println("Ingrese el dia a calcular: ");
        num = sc.nextInt();
        switch (num){
            case 1: DiaSemana="Lunes";
            break;
            case 2: DiaSemana="Martes";
            break;
            case 3: DiaSemana="Miercoles";
            break;
            case 4: DiaSemana="Jueves";
            break;
            case 5: DiaSemana="Viernes";
            break;
            default: DiaSemana="Numero invalido"; 
        }
            System.out.println("El dia de la semana es: "+DiaSemana);
      
    }
    
    
    
    
}
