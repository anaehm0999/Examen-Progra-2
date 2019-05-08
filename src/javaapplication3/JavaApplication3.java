/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE-IS
 */
public class JavaApplication3 {

    public static void main(String[] args) {
        
      System.out.println("Ejercicio 3");
      Scanner dato = new Scanner(System.in);
      int n;
      System.out.println("Ingrese su edad: ");
      n = dato.nextInt();
      
      if(n<21){
          System.out.println("Es joven.");
      }
      else{
          if (n>=21 && n<60){
            System.out.println("Es adulto.");
          }
          else{
              System.out.println("Es un adulto mayor.");
            }
          
        }  
        
      System.out.println();
      System.out.println();  
      System.out.println("Ejercicio 4");  
      Scanner d = new Scanner(System.in);
      int m;
      System.out.println("Ingrese un numero del 1 al 7: ");
      m = dato.nextInt();
      
      switch(m){
          case 1:
              System.out.println("Domingo");
              break;
          case 2:
              System.out.println("Lunes");
              break;
          case 3:
              System.out.println("Martes");
              break;
          case 4:
              System.out.println("Miercoles");
              break;
          case 5:
              System.out.println("Jueves");
              break;
          case 6:
              System.out.println("Viernes");
              break;
          case 7:
              System.out.println("Sabado");
              break;
      }
    
        
        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 5");
        for (int i=65; i<=90; i++){
          System.out.print((char)i);
      }
        
        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 6");
        for (int i=1; i<=50; i++){
          if (i%2 != 0){
              System.out.print(i);
          }
        }
        
        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 7");
        for (int i=1000; i>964; i--){
          if (i%2 != 1){
              System.out.print(i+",");
          }
        }
        
        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 8");
        int a=0;
        for (int i=1000; i>=962; i--){     
            if (i%2 != 1){
              System.out.print(i+","); 
            }
            a++;            
            if (a==8){
                System.out.println(" ");
                a=0;
            }

        }
        
    }
}    