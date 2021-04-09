
package proyectos;

import java.util.Scanner;


public class Promedio {
    
    
    public static void main(String[] args){
      double acum=1;
      int notas=0;
        Scanner r = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de numeros a promediar: ");
        double cn = r.nextFloat();
        
        while (acum <= cn){
            System.out.println("Ingrese la nota numero: "+ acum);
            int n = r.nextInt();
            notas += n;
            acum++;
            
        }
      
double promedio = notas / cn;
        System.out.println("El promedio es: "+ promedio);
        }
    
    
    }

