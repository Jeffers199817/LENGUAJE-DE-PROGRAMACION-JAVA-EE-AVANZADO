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
public class OperadorTenario {
    
    
    public static void main(String[] args) {
        double promedio;
        String condicionFinal;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el promedio general alumno en TodoCode:"+ '\n');
        promedio = entrada.nextDouble();
        
        condicionFinal = promedio>=6 ?"Aprobado": "Desaprobado";
        
        System.out.println("La condición final del alumno es:" + condicionFinal);
        
        
        
    }
    
}
