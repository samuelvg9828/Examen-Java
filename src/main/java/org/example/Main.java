package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<HashMap<String, Object>> obras = new ArrayList<>();
        Scanner lea = new Scanner(System.in);

        //MENU OPCIONES
        System.out.println("******PEQUEÑO TEAOTRO******");
        System.out.println("***************************");
        System.out.println("1- Nombre de la obra: ");
        System.out.println("2- Cual es el director de la obra: ");
        System.out.println("3- Ingrese el genero de la obra: ");
        System.out.println("4- Cual es el costo de la obra: ");
        System.out.println("5- Fecha de fin de la obra: ");
        System.out.println("0- Salir");
        System.out.println("****************************");

        //ELEGIR OPCION
        int opcionElegida;
        do {
            HashMap<String,Object>obra=new HashMap<>();

            System.out.println("Digita una opcion: ");
            opcionElegida=lea.nextInt();
            lea.nextLine();
            if (opcionElegida==1){
                System.out.println("INGRESANDO A UNA OBRA");
                System.out.println("Ingresa el nombre de la obra: ");
                String nombreObra = lea.nextLine();
                System.out.println("Ingrese la director del la obra: ");
                String directorObra = lea.nextLine();
                System.out.println("Ingrese el genero de la obra: ");
                String generoObra=lea.nextLine();
                System.out.println("Costo de la obra");
                int costoObra = lea.nextInt();
                Random aleatorio = new Random();
                int idObra = new Random().nextInt(2);
                LocalDate fechaObra = LocalDate.of(2024,12,10);


                //LLENANDO HASHMAP
                obra.put("nombre", nombreObra);
                obra.put("descripsion", directorObra);
                obra.put("genero",generoObra);
                obra.put("id", idObra);
                obra.put("director",directorObra);
                obra.put("fecha",fechaObra);


                //LLENANDO ARRAYLIST
                obras.add(obra);
                
            } else if (opcionElegida==2){
                System.out.println("Todas las obras:");
                for (HashMap<String,Object>obraAuxiliar:obras){
                    System.out.println(obraAuxiliar);
                }
            } else if (opcionElegida==3){
                System.out.println("Busar una obra: ");
                System.out.println("Ingresa el nombre del la obra que deseas ver: ");
                String nombreObraBuscar = lea.nextLine();
                
                //RECORRIENDO ARREGLO
                for (HashMap<String,Object>obraAuciliar: obras){
                    System.out.println(obraAuciliar.get("nombre"));
                    
                    if (nombreObraBuscar.equals(obraAuciliar.get("nombre")));{}
                    System.out.println("obra encontrada");
                    int indiceObra = obras.indexOf("Obra encontrada");
                    System.out.println(obraAuciliar.put("nombre", obra.get("nombre")));

                }


            } else if (opcionElegida==4) {
                System.out.println("Modificar obra");
            } else if (opcionElegida==0) {
                System.out.println("Saliendo");
            }else {
                System.out.println("Opcion invalida");
            }


        }while (opcionElegida!=0);
    }
}