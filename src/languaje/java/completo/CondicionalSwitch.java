/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package languaje.java.completo;

/**
 *
 * @author JEFFERSON
 */
public class CondicionalSwitch {
    
    public static void main(String[] args) {
        
        int dia = 45;
        String nombreDia="";
        
        switch(dia){
            
            case 1: nombreDia = "Lunes";
                
                break;
            case 2: nombreDia = "Martes";
                break;
            case 3: nombreDia = "Miercoles";
                        break;
            case 4: nombreDia = "Jueves";   
                    break;
            case 5: nombreDia = "Viernes";
                       break;
                       
            case 6: nombreDia = "Sábado";
                    break;
            case 7: nombreDia = "Domingo";
             break;
            
            default: 
                System.out.println(" \"No es un dia valido\"");
                        break;
            
                            
        
    }
        
        System.out.println("El día de la semana seleccionado es: " + nombreDia);
    
}
}
