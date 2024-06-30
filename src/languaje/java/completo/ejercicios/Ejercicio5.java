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
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        //variables
        
        long dni ;
        String nombre;
        int edad;
        int contadorDeUsuarios= 0;
        
        //Centinelas
        
        int centinela=1;
        String centinela1="";
        
        //objeto scanner
        
        Scanner teclado = new Scanner(System.in);
        
        
        
        while( centinela != 0 && !centinela1.equalsIgnoreCase("fin")){
                      
            System.out.println("================================================");
            System.out.println("Bienvenido a la incripción a la maraton.");
            System.out.println("================================================");
        
            System.out.println("Ingrese su dni: ");
            dni =teclado.nextLong();
            nombre = teclado.nextLine();
            
            System.out.println("Ingrese su nombre: ");
            nombre = teclado.nextLine();
            
            if(dni!=0 && !nombre.equalsIgnoreCase("fin")){
         
            System.out.println("Ingrese su edad:");
            edad = teclado.nextInt();
            nombre = teclado.nextLine();
     
            System.out.println("Datos ingresados Correctamente");
            
            System.out.println("Desea Inscribirse digite: SI o NO");
            
            String respuesta = teclado.nextLine();

            
            if(respuesta.equalsIgnoreCase("SI")){
            
            
            if(edad >= 6 && edad<=10){
                
                System.out.println("Usted pertenece a la categoria A (de 6 a 10 años");
                System.out.println("Gracias por incribirsi, le esperamos");
               
            }else if(edad >= 11 && edad <=17){ 
                
                System.out.println("Usted pertenece a la categoria B (de 11 a 17 años");
                System.out.println("Gracias por incribirsi, le esperamos");
                
                
            }else if(edad>= 18 && edad<= 30){
                
                System.out.println("Usted pertenece a la categoria Juveniles (de 18 a 30 años");
                System.out.println("Gracias por incribirsi, le esperamos");
                
            
            }else if(edad>= 31 && edad<=50){
                System.out.println("Usted pertenece a la categoria Adultos (de 31 a 50 años");
                System.out.println("Gracias por incribirsi, le esperamos");
                
                
            }else if(edad>=51){
                System.out.println("Usted pertenece a la categoria Adultos mayores (mayores de 50 años");
                System.out.println("Gracias por incribirsi, le esperamos");
 
            }else{
                
                System.out.println("Su edad no se admite para esta competencia");
            }
            
            
            }else{
                
                System.out.println("Gracias, hasta pronto.");
            }
            
            }else{
                
                System.out.println("Fin del dia muchas gracias a todos por registrarse.");
                System.out.println("Numero de participantes para la maraton son: " + contadorDeUsuarios);
                
                centinela--;
                centinela1="fin";
            }
            

        contadorDeUsuarios++;
            
        }
        
       
    }
    
}
