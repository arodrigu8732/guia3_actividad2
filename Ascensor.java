/**
 * Write a description of class Pendulo here.
 * @author Dennis Urrea/Alejandro Rodriguez Mancera 
 * @version 08-sep-2019
 */
import java.util.Scanner;
public class Ascensor 
 {
  //Atributos
  int piso_actual;
  int pisos_edificio;
  int sotanos;
  //Constructor
  public Ascensor(int pisos_edificio , int sotanos, int piso_actual){
   this.pisos_edificio = pisos_edificio;
   this.piso_actual = piso_actual;
   this.sotanos = sotanos ;
   }  
   
  public void siguiente_piso_arriba(){
    int piso_siguiente ;
    System.out.println("------------------------------------------------"); 
    System.out.println("Guia 3 Actividad 2 Programa Ascensor            ");
    System.out.println("------------------------------------------------");     
    if(piso_actual < pisos_edificio ){
        if(piso_actual != -1 ){
        piso_siguiente = (piso_actual + 1);
        }else{
         piso_siguiente = 1;
        }
        System.out.println("El siguiente piso es  :" + piso_siguiente);
     }else{
        System.out.println("No se puede subir más");
     }   
    }
  public void siguiente_piso_abajo(){
    if(piso_actual >(-sotanos)){
        int piso_siguiente;
        if(piso_actual != 1 ){
        piso_siguiente = (piso_actual - 1);
        }else{
           piso_siguiente = -1;
        }
        System.out.println("El siguiente piso es  :" + piso_siguiente);
    }else{
         System.out.println("No se puede bajar mas");
     }   
    }  
  public void cuantos_pisos_atiende(){
    int pisos_totales= sotanos + pisos_edificio ;
    System.out.println("El número de pisos que puede atender el ascensor es  :" + pisos_totales);
    }
  public static void main(String args[]){
  //MENU
  Scanner teclado = new Scanner(System.in);
  int piso_actual= 0;
  int pisos_edificio = 0;
  int sotanos = 0;
  boolean mantener = true;
  int opcion; 
  while(mantener){  
   System.out.println("1.Crear ascensor");
   System.out.println("2.Hallar piso siguiente arriba");
   System.out.println("3.Hallar piso siguiente abajo");
   System.out.println("4.Número de pisos que atiende");
   System.out.println("5.Salir del programa");
   opcion = teclado.nextInt(); 
   Ascensor ascensor = new Ascensor(pisos_edificio,sotanos,piso_actual);
   switch(opcion){
     case 1:
      System.out.println("Ingrese cuantos pisos (sin incluir sótanos) tiene el edificio : ");
       pisos_edificio = teclado.nextInt();
      System.out.println("Ingrese cuantos sótanos tiene el edificio");
       sotanos = teclado.nextInt();
      System.out.println("Indique el piso actual del ascenor");
       piso_actual = teclado.nextInt();
       ascensor.pisos_edificio =  pisos_edificio;
       ascensor.sotanos =   sotanos;
       ascensor.piso_actual =  piso_actual;
       break;
     case 2:
       ascensor.siguiente_piso_arriba();
       break;
     case 3:
       ascensor.siguiente_piso_abajo();   
       break ;
     case 4:
       ascensor.cuantos_pisos_atiende();
       break ;
     case 5:
       mantener = false;   
       break ;
     default: 
      System.out.println("Ingreso mal la opción");
    }
   }
  }
 }


