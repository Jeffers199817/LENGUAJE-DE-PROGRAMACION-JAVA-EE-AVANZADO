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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
     //definir las variables necesarias 
     
     double notas[][]= new double[4][4];
     double promedioEstudiante[] = new double[4];
   
     //Definir el obejto scanner
     
     Scanner teclado = new Scanner(System.in);
     
     
     for(int f=0; f<4 ; f++){ 
         
         
         
         for(int c=0; c<4; c++){ 
             if(f<4 && c<3){
             System.out.println("Estudiante: "+(f+1));
             System.out.println("Ingrese la nota: " + (c+1) );
             
             notas[f][c]=teclado.nextDouble();
                 System.out.println("Nota "+(c+1) + " ingresada Exitosamente");
                 
             promedioEstudiante[f] = (notas[f][c] + notas[f][c]+notas[f][c])/3; 
             
           
                 
             }if(f<4 && c==3){
             
                 
                 System.out.println("El promedio de el Estudiante "+ (f+1) + " es: " + promedioEstudiante[f] );
                 
                 
                 
             }
             
             
             
             
             
             
             
             
             
         }
     }
     
    }
    
    
    
}
