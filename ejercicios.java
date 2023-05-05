/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author USUARIO 1
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        busquedaRemplazo();

    }

    public static void busquedaRemplazo() {
        String nombres[] = {"Yeferson", "Arlete", "Leonardo", "Juan", "Kevin", "Danny", "Ricardo", "Nicolas", "Santiago", "Andres", "Anderson"};
        Scanner scaner = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero a buscar");
        String dato = scaner.nextLine();
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(dato)) {
                System.out.println("Se encontro el nombre en el arreglo");
                System.out.println("Desea remlazar el nombre Y/N");
                String reemplazar = scanner.nextLine();
                if (reemplazar.equals("Y")) {
                    System.out.println("Por favor ingrese el valor a remplazar");
                    String valor = scaner.nextLine();
                    nombres[i] = valor;

                } else {
                    System.out.println("Ud decidio no remplaar el elemnto");
                }
            }

        }
    }

    public static void arreglos() {
        String nombres[] = new String[11];
        nombres[0] = "Yerferson";
        nombres[1] = "Arlete";
        nombres[2] = "Leonardo";
        nombres[3] = "Juan";
        nombres[4] = "Kevin";
        nombres[5] = "Danny";
        nombres[6] = "Ricardo";
        nombres[7] = "Nicolas";
        nombres[8] = "Santiago";
        nombres[9] = "Andres";
        nombres[10] = "Anderson";

        for (int i = nombres.length - 1; i > 0; i--) {
            System.out.println(nombres[i]);
        }
    }

    public static void sumarArreglos() {
        int[] arreglos1 = {1, 2, 3, 4, 5, 6, 7, 8, 9
        };
    int[] arreglos2 = {1, 28, 3, 4,6, 5, 6, 7, 8, 9
        };
    int [] suma = new int[arreglos1.length+arreglos2.length];
        
        }
    }

