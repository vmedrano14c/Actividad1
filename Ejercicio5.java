/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.ejercicio5;

 /**
  *
  * @author Usuario
  */
 import java.util.Scanner;
 public class Ejercicio5 {
 
     public static void main(String[] args) {
         
         double suma, x, y;
         System.out.println("Ingrese el valor de X: "); 
         System.out.println("Ingrese el valor de Y: ");
         Scanner entrada = new Scanner(System.in);
         
         x = entrada.nextInt();
         y = entrada.nextInt();
         suma = 0;
         suma = suma + x;
         x = x+Math.pow(y, 2);
         suma = suma + (x/y);
         
         System.out.println("El valor de la suma es:  "+suma);                                               
                                                                                               
     }
 }