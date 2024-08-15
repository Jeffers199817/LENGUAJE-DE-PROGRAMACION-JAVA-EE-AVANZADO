/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package languaje.java.completo.ejercicios;

/**
 *
 * @author JEFFERSON
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        
        int matriz[][] = new int[4][4];
        
        for(int f=0; f<4; f++){
            
            for(int c=0; c<4; c++){
                if(f!=c){
                    matriz[f][c] =1;
                    System.out.print(matriz[f][c]);
                }
                else{
                    matriz[f][c]=0;
                    System.out.print(matriz[f][c]);
                }
               
            }
             System.out.println("");
        }
    }
    
}
