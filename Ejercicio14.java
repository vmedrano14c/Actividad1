/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.ejercicio14;

 /**
  *
  * @author Usuario
  */
 import java.util.Scanner;
 public class Ejercicio14 {
 
     public static void main(String[] args) {
     double cuadrado, cubo;
     System.out.println("Ingrese el numero:  ");
     Scanner entrada = new Scanner(System.in);
     int numero = entrada.nextInt();
     cuadrado = Math.pow(numero, 2);
     cubo = Math.pow(numero, 3);
     
     System.out.println("El cuadrado de  "+numero+" es "+cuadrado);
     System.out.println("El cubo de  "+numero+" es "+cubo);
     }
 }