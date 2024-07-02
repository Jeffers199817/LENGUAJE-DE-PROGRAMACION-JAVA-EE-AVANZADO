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
public class Ejercicio12 {
    public static void main(String[] args) {
        
        
        //declaramos las variables 
        
        String vuelos[] = {"Mañana", "Mediodía", "Noche"};
        String paises[] = {"Janeiro", "Cancún ","Madrid ","Roma   ","Milán  ","Iguazú "};
        String usuarios[]=new String[6];
        int usuario=0;
        int destino[]=new int[100];
        int horario[] = new int[100];
        int asientos[]= new int[100];
        
    
        
        int asientosDisponibles[][]=new int[6][3];
        
        int opcionDeRespuesta=0;
        String centinela = "";

        
        Scanner teclado = new Scanner(System.in);
        
        
        
        while(!centinela.equalsIgnoreCase("finish")){
            
            
             System.out.println("===============================================");
            System.out.println("Bienvenido al Sistema de Vuelos de Ecuador.");
            System.out.println("Ingrese la acción que desea realizar.");
            System.out.println("===============================================");
            System.out.println("");
            
            System.out.println("opcion 1. Ingresar asientos disponibles");
            System.out.println("Opcion 2. Registraste para un vuelo");
            System.out.println("Opcion 3. Consultar Horario.");
            System.out.println("Opcion 4. Salir y imprimir reporte de usuarios Registrados");
            System.out.print(":");
            
            opcionDeRespuesta = teclado.nextInt();
            
        
        switch(opcionDeRespuesta){
        
            case 1: 
        System.out.println("==========================================================");

        System.out.println("Hola Bienvenido al Sistema de vuelos de Ecuador");
        System.out.println("Ingrese los asientos diponibles para nuestros viajes.");
        
        System.out.println("==========================================================");

        
        
        //ILUSTRA EL  BLOQUE DE CÓDIGO 
        for(int i=0; i<3; i++){
            System.out.print("                    "+vuelos[i] +" ");
            
        }
            for(int j=0; j<paises.length;j++){ 
                System.out.println("");
                
                  System.out.println((j+1)+".-"+paises[j]);
         }
         // FIN DEL BLOQUE DE CÓDIGO 
         
         
         //BLUQUE PARA LLENAR LOS HORAIOS DISPOBIBLES DE LAS 6 RUTAS 
            
        for(int f=0; f<6;f++){
            for(int c=0; c<3; c++){ 
                System.out.println("===================================================================================");
                
                System.out.println("Ingrese asientos disponibles para " + paises[f]+ " en horario " + vuelos[c]+": ");
                asientosDisponibles[f][c]=teclado.nextInt();
                System.out.println("Horario ingresado Exitosamente.");
                System.out.println("===================================================================================");
                System.out.println("");
                
               
                
               //CREA EL BLOQUE DE CÓDIGO COMPLETO      
        for(int i=0; i<3; i++){
            System.out.print("                          "+vuelos[i] +" ");
            
        }
                System.out.println("");
                    
                System.out.println("1"+".-"+paises[0] +"               "+ asientosDisponibles[0][0] + "                              " + asientosDisponibles[0][1]+ "                               " + asientosDisponibles[0][2]);
                System.out.println("1"+".-"+paises[1] +"               "+ asientosDisponibles[1][0] + "                              " + asientosDisponibles[1][1]+ "                               " + asientosDisponibles[1][2]);
                System.out.println("1"+".-"+paises[2] +"               "+ asientosDisponibles[2][0] + "                              " + asientosDisponibles[2][1]+ "                               " + asientosDisponibles[2][2]);
                System.out.println("1"+".-"+paises[3] +"               "+ asientosDisponibles[3][0] + "                              " + asientosDisponibles[3][1]+ "                               " + asientosDisponibles[3][2]);
                System.out.println("1"+".-"+paises[4] +"               "+ asientosDisponibles[4][0] + "                              " + asientosDisponibles[4][1]+ "                               " + asientosDisponibles[4][2]);
                System.out.println("1"+".-"+paises[5] +"               "+ asientosDisponibles[5][0] + "                              " + asientosDisponibles[5][1]+ "                               " + asientosDisponibles[5][2]);
         
            
            
            }
        }
        
        break;
        
        
            case 2:
                
                
        System.out.println("==========================================================");

        System.out.println("Hola Bienvenido al Sistema de registro de vuelos de Ecuador");
  
        System.out.println("==========================================================");
        
                System.out.println("");
                teclado.nextLine();
                System.out.println("Ingrese su nombre:");    
                
                usuarios[0+usuario]=teclado.nextLine();
                
                System.out.println("Usuario "+ usuarios[0+usuario]+" Registrado, Exitosamente:");
                usuario++;
                
                System.out.println("");
                System.out.println("====================================================");
                
                System.out.println("Destinos, horarios y asientos disponibles para el viaje");
                
                System.out.println("====================================================");
          for(int i=0; i<3; i++){
            System.out.print("                          "+(i+1) +" ");           
        }
                System.out.println("");
           
             for(int i=0; i<3; i++){
          
            System.out.print("                          "+vuelos[i] +" ");
            
        }
                System.out.println("");
                    
                System.out.println("1"+".-"+paises[0] +"               "+ asientosDisponibles[0][0] + "                              " + asientosDisponibles[0][1]+ "                               " + asientosDisponibles[0][2]);
                System.out.println("2"+".-"+paises[1] +"               "+ asientosDisponibles[1][0] + "                              " + asientosDisponibles[1][1]+ "                               " + asientosDisponibles[1][2]);
                System.out.println("3"+".-"+paises[2] +"               "+ asientosDisponibles[2][0] + "                              " + asientosDisponibles[2][1]+ "                               " + asientosDisponibles[2][2]);
                System.out.println("4"+".-"+paises[3] +"               "+ asientosDisponibles[3][0] + "                              " + asientosDisponibles[3][1]+ "                               " + asientosDisponibles[3][2]);
                System.out.println("5"+".-"+paises[4] +"               "+ asientosDisponibles[4][0] + "                              " + asientosDisponibles[4][1]+ "                               " + asientosDisponibles[4][2]);
                System.out.println("6"+".-"+paises[5] +"               "+ asientosDisponibles[5][0] + "                              " + asientosDisponibles[5][1]+ "                               " + asientosDisponibles[5][2]);
           
            
                System.out.println("Elija un Destino y el horario. Por ej:4 =roma , 2= medio dia. asientos= los dispobibles.");
                System.out.println("Ingrese número de su Destino: ");
                
                destino[0+usuario]=teclado.nextInt();
                
                System.out.println("Ingrese número de su horario: ");
                
                horario[0+usuario]=teclado.nextInt();
                int centinela2=3;
                
                while(centinela2!=2){
                
                System.out.println("Ingrese cantidad de ascientos que deseea: ");
                asientos[0+usuario]= teclado.nextInt();
            
               
                
                if(asientosDisponibles[destino[0+usuario]-1][horario[0+usuario]-1]<=0){
                    System.out.println("disculpe, no se pudo completar su operación dado que no hay asientos disponibles");
                    centinela2=2;
                    
                    
                }else if(asientosDisponibles[destino[0+usuario]-1][horario[0+usuario]-1]<asientos[0+usuario]){
                    
                        System.out.println("El número de asientos ingresados es mayor al disponible");
                        System.out.println("número de asientos ingresados: " +asientos[0+usuario] );
                        System.out.println("número de asientos dispobible: "+ asientosDisponibles[destino[0+usuario]-1][horario[0+usuario]-1]);
                        System.out.println("Su reserva no se realizo.");
                        System.out.println("Vuelva a intentarlo");
                }else{
                     asientosDisponibles[destino[0+usuario]-1][horario[0+usuario]-1]= asientosDisponibles[destino[0+usuario]-1][horario[0+usuario]-1]-asientos[0+usuario];
                     System.out.println("Su reserva fue realizada con éxito");
                     centinela2=2;
                }
                }
                
                break;
                
                
                
                
            
            case 3:
                
         System.out.println("==========================================================");

        System.out.println("Hola Bienvenido HORARIOS DISPONIBLES");
  
        System.out.println("==========================================================");
                  //BLOQUE MOSTRAR TODO EL HORARIO COMPLETO 
        for(int i=0; i<3; i++){
            System.out.print("                          "+vuelos[i] +" ");
            
        }
                System.out.println("");
                    
                System.out.println("1"+".-"+paises[0] +"               "+ asientosDisponibles[0][0] + "                              " + asientosDisponibles[0][1]+ "                               " + asientosDisponibles[0][2]);
                System.out.println("1"+".-"+paises[1] +"               "+ asientosDisponibles[1][0] + "                              " + asientosDisponibles[1][1]+ "                               " + asientosDisponibles[1][2]);
                System.out.println("1"+".-"+paises[2] +"               "+ asientosDisponibles[2][0] + "                              " + asientosDisponibles[2][1]+ "                               " + asientosDisponibles[2][2]);
                System.out.println("1"+".-"+paises[3] +"               "+ asientosDisponibles[3][0] + "                              " + asientosDisponibles[3][1]+ "                               " + asientosDisponibles[3][2]);
                System.out.println("1"+".-"+paises[4] +"               "+ asientosDisponibles[4][0] + "                              " + asientosDisponibles[4][1]+ "                               " + asientosDisponibles[4][2]);
                System.out.println("1"+".-"+paises[5] +"               "+ asientosDisponibles[5][0] + "                              " + asientosDisponibles[5][1]+ "                               " + asientosDisponibles[5][2]);
         

        
        break;
                
        
            case 4:
                System.out.println("Gracias por preferirnos vuelva pronto.");
                 System.out.println("Usuarios registrados: " + usuario + " asientoes reservados: " + asientos[0+usuario] + "  destino: " + destino[0+usuario] + "  Horario: " + horario[0+usuario]);
                 for(int i=0; i<=usuarios.length; i++){
                     
                     System.out.println((i+1)+".-" + usuarios[i] + " asientos reservados: " + asientos[0+i+1] + "  destino: " + paises[destino[0+i] +1 ]+ "  Horario: " +vuelos[horario[0+i] +1 ]);
                 }
                 centinela="finish";
                 break;
                
            
                
                
            default:
                System.out.println("No es una opcion valida, Ingresa una opción valida.");
                
                break;
        
    }
    


    

        

        
    }
        
       
    
}}
