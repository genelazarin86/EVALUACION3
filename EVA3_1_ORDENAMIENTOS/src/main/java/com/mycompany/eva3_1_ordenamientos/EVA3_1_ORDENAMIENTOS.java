/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_ordenamientos;

import java.awt.BorderLayout;

/**
 *
 * @author Admin
 */
public class EVA3_1_ORDENAMIENTOS {

    public static void main(String[] args) {
        long ini, fin, tiempo;

        int[] original = new int[10];
        int[] copiaSelection = new int[10];
        int[] copiaInsertion = new int[10];

        llenar(original); // LLENA CON VALORES ALEATORIOS
        System.out.println("ARREGLO ORIGINAL:");
        imprimir(original);

        copiar(original, copiaSelection);
        copiar(original, copiaInsertion);

        // SELECTION SORT
        System.out.println("SELECTION SORT------------------");
        ini = System.nanoTime();
        selectionSort(copiaSelection);
        fin = System.nanoTime();
        tiempo = fin - ini;
        imprimir(copiaSelection);
        System.out.println("Tiempo: " + tiempo + " ns");

        // INSERTION SORT
        System.out.println("INSERTION SORT------------------");
        ini = System.nanoTime();
        insertionSort(copiaInsertion);
        fin = System.nanoTime();
        tiempo = fin - ini;
        imprimir(copiaInsertion);
        System.out.println("Tiempo: " + tiempo + " ns");
    }

    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "] ");
        }
        System.out.println("\n");
    }

    public static void copiar(int[] arreglo, int[] copia) {
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
    }

    public static void selectionSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            // Intercambiar
            int temp = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
        }
    }

    public static void insertionSort(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int temp = arreglo[i];
            int insP = i;
            for (int prev = i - 1; prev >= 0; prev--) {
                if (arreglo[prev] > temp) {
                    arreglo[insP] = arreglo[prev];
                    insP = prev;
                } else {
                    break;
                }
            }
            arreglo[insP] = temp;
        }
    }
}

        
    
    
