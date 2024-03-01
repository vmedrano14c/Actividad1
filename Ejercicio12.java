/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.ejercicio12;

 /**
  *
  * @author Usuario
  */
 public class Ejercicio12 {
 
     public static void main(String[] args) {
         int horas = 48;
         double valor_hora = 5000, retencion_fuente = 0.125;
         double salario_bruto, retencion_valor, salario_neto;
         
         salario_bruto = horas * valor_hora;
         retencion_valor = salario_bruto * retencion_fuente;
         salario_neto = salario_bruto - retencion_valor;
         
         System.out.println("El salario bruto del trabajador es: "+salario_bruto);
         System.out.println("La retencion en la fuente del trabajador es: "+retencion_valor);
         System.out.println("El salario neto del trabajador es: "+salario_neto);
     }
 }
 