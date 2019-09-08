/**
 * Write a description of class Pendulo here.
 * @author Dennis Urrea/Alejandro Rodriguez Mancera 
 * @version 08-sep-2019
 */
import java.lang.Math ;
import java.util.Scanner;
public class Pendulo 
 {
  //atributos
  double longitud;
  double aceleracion_gravitacional;
  //constructor
  public Pendulo(double longitud ,double aceleracion_gravitacional){
   this.longitud = longitud;
   this.aceleracion_gravitacional = aceleracion_gravitacional;
   }
  public double calcular_periodo_oscilacion(){
   double periodo = (2 * Math.PI)*(Math.sqrt(this.aceleracion_gravitacional/this.longitud));
   return periodo ;
   }
  public static void main(String args[]) {
   //MENU
   Scanner teclado = new Scanner(System.in);
   double longitud = 0,aceleracion_gravitacional= 0;
   boolean mantener = true;
   int opcion; 
   while(mantener){  
    System.out.println("------------------------------------------------"); 
    System.out.println("Guia 3 Actividad 2 Programa Péndulo             ") ;
    System.out.println("------------------------------------------------");          
    System.out.println("1.Crear péndulo");
    System.out.println("2.Hallar periodo del péndulo");
    System.out.println("3.Salir del programa");
    opcion = teclado.nextInt(); 
    Pendulo pendulo = new Pendulo(longitud ,aceleracion_gravitacional);        
    switch(opcion){
     case 1:
      System.out.println("ingrese la longitud del pendulo: ");
      longitud = teclado.nextDouble();
      System.out.println("ingrese la  aceleración gravitacional del pendulo");
      aceleracion_gravitacional = teclado.nextDouble();
      pendulo.longitud = longitud;
      pendulo.aceleracion_gravitacional = aceleracion_gravitacional;
      break;
     case 2:
      double periodo = pendulo.calcular_periodo_oscilacion(); 
      System.out.println("el periodo del pendulo es : "+ periodo);
      break;
     case 3:
      mantener = false;   
      break ;
     default: 
      System.out.println("ingreso mal la opcion");
     }
    }
  }
}