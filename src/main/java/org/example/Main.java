package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre;
        String cedula;
        Integer opcion;
        Integer cantidadProducto;
        Double costoTotal=0.0;
        Double sumatoriaCostos=0.0;
        Scanner teclado = new Scanner(System.in);

        //proceso
        //1. CREAR UN MENU DE OPCIONES
        System.out.println("******PELUCHITOS SA******");
        System.out.println("1. Cumpleaños");
        System.out.println("2. Dia de la mujer");
        System.out.println("3. Baby showers");
        System.out.println("4. SALIR");

        //2. construir un ciclo para permitir que el usuario escoja
        do{
            System.out.print("Digita la opcion deseada: ");
            opcion=teclado.nextInt();

            //3. Evaluando las opciones del menu
            if(opcion==1){
                System.out.println("Digita cuantos kit de cumpleaños deseas: ");
                cantidadProducto=teclado.nextInt();
                costoTotal=180000.0*cantidadProducto;
                sumatoriaCostos=sumatoriaCostos+costoTotal;


            }else if(opcion==2){
                System.out.println("Digita cuantos kit de mujer deseas: ");
                cantidadProducto=teclado.nextInt();
                costoTotal=60000.0*cantidadProducto;
                sumatoriaCostos=sumatoriaCostos+costoTotal;

            }else if(opcion==3){
                System.out.println("Digita cuantos kit de bebes deseas: ");
                cantidadProducto=teclado.nextInt();
                costoTotal=250000.0*cantidadProducto;
                sumatoriaCostos=sumatoriaCostos+costoTotal;

            }else if(opcion==4){
                System.out.println("Gracias, hasta pronto ");
            }else{
                System.out.println("Digita una opcion valida ");
            }

        }while(opcion!=4);

        System.out.println("El costo es de: "+sumatoriaCostos);





    }
}