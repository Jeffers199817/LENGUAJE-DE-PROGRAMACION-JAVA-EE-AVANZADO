/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package languaje.java.completo.ejercicios;

/**
 *
 * @author JEFFERSON
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
       
        int altura = 14;
        
        
    //bucle para recorrer todas las filas (altura)
    
    for(int filas=0 ; filas<altura; filas++){
        
   
        //bulce para los espacios
         
            for(int espacio=0; espacio<(altura-filas-1); espacio++){
                System.out.print(" ");
            
               }
            //bulce para los asteriscos
            
            for(int asterisco = 0; asterisco<(filas*2)+1;asterisco++){ 
                System.out.print("*");
                

                    }
            
             System.out.println("");
                }
    
    
                //TRONCO 
                
                int largoTronco = 1;
                
                for(int base=0; base<largoTronco; base++){
                    
                //espacios en blanco
                
                 for(int espacio=0; espacio<(altura-2); espacio++){
                     System.out.print(" ");
                
            }
                 
                 for(int tronco=0; tronco<3; tronco++){
                     
                     System.out.print("|");
                 }
                    System.out.println("");
                
                }
    
        
}  

    
}
