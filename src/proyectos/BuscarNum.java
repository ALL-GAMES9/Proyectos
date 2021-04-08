package proyectos;

import java.util.Scanner;

public class BuscarNum {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], numero;
        boolean creciente = true;
        arreglo = new int[10]; //el arreglo es de 10 posiciones

        do {
            //pedimos el arreglo
            System.out.println("Rellene el arreglo");
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " Digite un numero: ");

                arreglo[i] = entrada.nextInt();
            }
            //verificar si el arreglo  esta ordenado

            for (int i = 0; i < 9; i++) {
                if (arreglo[i] < arreglo[i + 1]) {//creciente: 1,2,3...
                    creciente = true;
                }

            }

            //pedimos el numero a buscar 
            System.out.println("\nIntroduzca el numero a buscar: ");
            numero = entrada.nextInt();

            //buscamos el numero en el  arreglo
            int i = 0;

            while (i < 10 && arreglo[i] < numero) {
                i++;
            }

            if (i == 10) {//hemos reocorrido todo el arreglo y no encontramos nada
                System.out.println("\n -1");
            } else {
                if (arreglo[i] == numero) {

                    System.out.println("\nNumero encontrado, en la posición: " + i);
                }
            }
        }
        
    }
}
