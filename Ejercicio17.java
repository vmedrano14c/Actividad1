/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.ejercicio17;

 /**
  *
  * @author Usuario
  */
 import java.util.Scanner;
 public class Ejercicio17 {
     public static void main(String[] args) {
         double radio, longitud, area;
         System.out.println("Ingrese el radio de la circunferencia: ");
         Scanner entrada = new Scanner(System.in);
         radio = entrada.nextDouble();        
         area = Math.pow(radio, 2) * Math.PI;
         longitud = 2* Math.PI * radio;
         System.out.println("El area del circulo es:  "+area);
         System.out.println("La longitud de la circunferencia es:  "+longitud);
     }
 }
 