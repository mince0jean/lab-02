

package com.mycompany.laboratorio2;
import java.util.Scanner;


public class Laboratorio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int opcion;
       
        Plan P = new Plan("Preferencial", 15000, 80);
        Plan N = new Plan("Normal",7000, 120);
        
        
        int plan,min;
        do{
            System.out.println("Ingrese su nombre: ");
            String nombre=leer.next();
            System.out.println("ingrese 1 si su plan es preferencial, si su plan es normal ingrese 2: ");
            plan = leer.nextInt();
            
            System.out.println("Ingrese los minutos que ha consumido");
            min=leer.nextInt();
            while(min<0){
                System.out.print("Los minutos consumidos son erroneos");
                System.out.println("Ingrese los minutos que ha consumido");
                min=leer.nextInt();
            }
            if(plan==1){
                Cliente c = new Cliente(nombre,P,min);
                P.setCantidad_plan((P.getCantidad_plan()+1));
                c.pagar_total(P.getCosto_mantencion(),P.getCosto_minuto());
                }

            else{
                N.setCantidad_plan((N.getCantidad_plan()+1));
                Cliente c = new Cliente(nombre,N,min);
                c.pagar_total(N.getCosto_mantencion(),N.getCosto_minuto());
            }


            System.out.println(" Si desea continuar presione 0");
            opcion = leer.nextInt();
        }while(opcion == 0);   
        N.cantidad_plan();
        P.cantidad_plan();
        }
      
    }

