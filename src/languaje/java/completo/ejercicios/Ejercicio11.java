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
public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        //LLevar a cabo un programa que permite cargar completamente con números 5 una matriz de 4x5;
        
        
        int matriz[][] = new int[4][5];
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido al Programa para llenar un matriz 4x5 de solo números 5.");
        
        
        for(int i=0; i<4;i++){ 
            
            for(int j=0; j<5; j++){
                
                 int numeroCentinela =0;
                 
                 while(numeroCentinela != 5){ 
                  
                
                System.out.println("Ingrese el número: "+ (j+1) );

                int numero =teclado.nextInt();
                
                
                if(numero == 5 ){ 
                      matriz[i][j]=numero;
                      numeroCentinela =5;
                     
                     }else{
                        System.out.println("Solo puedes ingresar el número 5. Vuelve a intentarlo");
                        System.out.println("=======================================================");
                        }

            }
                 
                 
            }
        }
        
        for(int i=0; i<4;i++){ 
            
            for(int j=0; j<5; j++){
        
        System.out.println("Su matriz llena es: ");
        System.out.println("matriz"+ "["+(1+i)+"]"+ "["+(j+1)+"] = "+matriz[i][j]);
        
    }}}
    
}
