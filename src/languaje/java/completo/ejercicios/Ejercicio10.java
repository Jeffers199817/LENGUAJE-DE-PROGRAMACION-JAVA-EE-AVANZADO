/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package languaje.java.completo.ejercicios;

import java.util.Scanner;

/**
 *
 * @author JEFFERSON
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        
        //definir las varibales
       //vectores 3 
       
       String ciudades[] = new String[5];
        double temperaturaMax[] = new double[5];
        double maximo = Double.MIN_VALUE; // Inicializar con el mínimo valor posible
        double temperaturaMin[] = new double[5];
        double minimo = Double.MAX_VALUE;  // Inicializar 
       String ciudadTa = "";
       String ciudadTb = "";
       
       // crear el objeto scanner
       Scanner teclado = new Scanner(System.in);
       
       for(int i=0; i<ciudades.length; i++){ 
           
           System.out.println("Ingrese la ciudad número: " + (i+1));
           ciudades[i]=teclado.nextLine();
           System.out.println("Ingrese la temperatura maxima: ");
           temperaturaMax[i] =teclado.nextInt();
           System.out.println("Ingrese la tempertura minima: ");
           temperaturaMin[i] = teclado.nextInt();
           teclado.nextLine();
           
           System.out.println("");
           
       }
       
       System.out.println("Las ciudades ingresadas con su temperatura max y min son: ");
           System.out.println("Ciudad      " + " Temperatura Maxima      " + "Temperatura Minima");
           
       for(int j=0; j<ciudades.length; j++){ 
           
           
           System.out.println("Ciudad " + (j+1) + " :" + ciudades[j] +"  "+ temperaturaMax[j] + "  "+ temperaturaMin[j]);
           
          
       }
       for(int j=0; j<ciudades.length; j++){ 

           
           System.out.println("=======================================================");
           if(temperaturaMax[j]>maximo){
               
               maximo = temperaturaMax[j];
               ciudadTa = ciudades[j];
               
               
      
           }
           
           if(temperaturaMin[j]<minimo){
               
               minimo = temperaturaMin[j];
               ciudadTb = ciudades[j];
           }
           
       }
       
       
        System.out.println("La ciudad con la mayor temperatura es:" + ciudadTa +" " + "Su temperatura Maxima es: " + maximo);
        System.out.println("La ciudad con menor temperatura es:" + ciudadTb +" " + "Su temperatura Minima es: " + minimo);
        
       
    }
    
}
