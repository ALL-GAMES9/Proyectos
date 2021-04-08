package proyectos;

import java.util.Scanner;

public class Loxxo {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        int codigoCliente;
        String nombre;
        String apellidopaterno;
        String apellidomaterno;
        String telefono;
        String direccion;
        int edad;
      
        System.out.println("1- AGREGAR CLIENTE");
        System.out.println("2- MOSTRAR CLIENTES");
        System.out.println("3- BUSCAR CLIENTE");
        System.out.println("4- CERRAR SECION");

        System.out.println("----------------------------------");
        System.out.println("Elige una opcion: ");
        opcion = sn.nextInt();
        System.out.println("-----------------------------------");


switch (opcion) {
            case 1:
                System.out.println("1- INGRESA CODIGO DEL CLIENTE: ");
                codigoCliente = sn.nextInt();

                System.out.println("2- NOMBRE DEL CLIENTE: ");
                nombre = sn.nextLine();

                System.out.println("3- APELLIDO PATERNO: ");
                apellidopaterno = sn.nextLine();

                System.out.println("4- APELLIDO MATERNO: ");
                apellidomaterno = sn.nextLine();

                System.out.println("5- TELEFONO: ");
                telefono = sn.nextLine();

                System.out.println("6- DIRECCIÓN: ");
                direccion = sn.nextLine();

                System.out.println("7- EDAD: ");
                edad = sn.nextInt();

                break;
           
        }
    }

}
