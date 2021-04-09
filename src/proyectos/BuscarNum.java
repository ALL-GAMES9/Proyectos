package proyectos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BuscarNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int tam[];

        tam = new int[10];
        for (int i = 1; i < 10; i++) {
            System.out.println(i + ".-Ingrese un numero:");
            tam[i] = sc.nextInt();
        }
        System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
        System.out.println("¿QUE NUMERO DESEA BUSCAR?");
        num = sc.nextInt();
        int i = 0;

        while (i < 10 && tam[i] < num) {
            i++;
        }
        
        if(i==10){
            System.out.println("EL NUMERO A BUSCAR NO SE ENCUENTRA DENTRO DE LA LISTA:" + "-1");
        }
        else{
        if(tam[i]==num){
            System.out.println("El numero seleccionado esta en la posición: " + i);
        }
        }
       
    }
}
