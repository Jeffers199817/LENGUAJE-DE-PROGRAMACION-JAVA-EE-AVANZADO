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
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        
        String categoria1 = "1-repositor";
        String categoria2 = "2-cajero";
        String categoria3 = "3-supervisor";
        int intento = 1;
        
        while(intento>0){
        System.out.println("========================================================");
        System.out.println("Ingrese una acción para calcular el sueldo de empleado");
        System.out.println("1-repositor");
        System.out.println("2-cajero");
        System.out.println("3-supervisor");
         System.out.println("========================================================");
        
        Scanner entrada = new Scanner(System.in);
        
        int categoria = entrada.nextInt();
        
        if(categoria >0 && categoria <4){
        
        double pagoR = 15.890;
        double pagoC = 25.73090;
        double pagoS = 35.56020;
        
        double bono = pagoR*0.1;
        double descuento = pagoS*0.11;
        
        switch(categoria){ 
            
            case 1: System.out.println("Sueldo de empleado " + categoria1);
                System.out.println("Su sueldo es de " + pagoR + " + un bono del 10%");
                System.out.println("Sueldo Total: " + (bono + pagoR));
                break;
                
            case 2: System.out.println("Sueldo de empleado " + categoria2);
                System.out.println("Su sueldo es de " + pagoC + " pago fijo");
                break;
                
            case 3: System.out.println("Sueldo de empleado " + categoria3);
            System.out.println("Su sueldo es de " + pagoS + " - un descuento del 11%");
                System.out.println("Sueldo Total: " + (pagoS - descuento));
                
        }
        
        }else{
            System.out.println("No existe ese empleado en la lista elija del 1 al 3");
        }
        
        
        
        
        
        intento++;
        
        }
    }
    
}
