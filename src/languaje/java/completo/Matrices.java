/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package languaje.java.completo;

import java.util.Scanner;

/**
 *
 * @author JEFFERSON
 */
public class Matrices {
    
    public static void main(String[] args) {
        //Declaración matriz
        
        int matriz[][] = new int [3][3];
        
        Scanner teclado = new Scanner(System.in);

        //Asignación(Manual)
        

            
            for(int i=0; i<3; i++){

                for(int j=0; j<3; j++){
                    
                    System.out.println("Ingrese el valor de la posicion : [ " + i+ " ]" + "[" + j+ " ]");
                    
                    matriz[i][j] = teclado.nextInt();
                   
                    System.out.println("==========================================");
                    
             
                    
                }
                
                
                
            }
     
            
            
            for(int i=0; i<2; i++){

                for(int j=0; j<3; j++){
                    
                    System.out.println("La matriz: [ " + i+ " ]" + "[" + j+ " ]");
                    System.out.println("Su valor es: "+ matriz[i][j]);
                    System.out.println("==========================================");
                    
             
                    
                }
                
                
                
            }
        
        
    }
    
}
