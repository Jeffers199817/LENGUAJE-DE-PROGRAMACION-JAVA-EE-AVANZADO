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
public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        
    //contador
        int repeticiones =0;
        
    //Crear el vector para 15 números 
    
    int vector[] = new int[15];

    //creamos el objeto scanner para capturar la entrada por teclado
    Scanner teclado = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("Programa que permite cargar 15 números en un vecto");
        System.out.println("====================================================");
    
    // Creamos el bucle para llenar el Vector]
    
    for(int i=0; i<vector.length; i++){
        
        System.out.println("Ingrese el valor" + (i+1) +" del vector"+ " La posición del vector es: " + "vector["+(i+1)+"]");
        vector[i]= teclado.nextInt();
        System.out.println("Posicion almacenada");
        
        if(vector[i]==3)
            repeticiones++;
       
}
    
        System.out.println("Gracias por Utilizar el programa");
        System.out.println("---------------------------------");
        System.out.println("su vector completo es:");
        for(int i=0; i<vector.length; i++){
            
              System.out.println("vector[ "+ (i+1)+ "] es = " + vector[i]);
            
        }
        System.out.println("Se cargaron: " + repeticiones + "  veces el número 3." );
      
    
    
    }
    
    
}
