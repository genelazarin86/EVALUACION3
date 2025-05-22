package com.mycompany.eva3_4_busqueda_binaria;

public class EVA3_4_BUSQUEDA_BINARIA {

    public static void main(String[] args) {
            
        int[] tamanios = {10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};

        for (int n : tamanios) {
            int[] arreglo = new int[n];

            // Llenamos el arreglo con números consecutivos ordenados
            for (int i = 0; i < n; i++) {
                arreglo[i] = i + 1; // valores de 1 a n
            }

            int valorBuscado = n; // Buscar el último valor (el más difícil de encontrar)

            long tiempoInicio = System.nanoTime(); // Tiempo inicial

            int resultado = busquedaBinaria(arreglo, valorBuscado);

            long tiempoFin = System.nanoTime(); // Tiempo final

            long duracion = tiempoFin - tiempoInicio; // Duración en nanosegundos

            System.out.println("Tamaño del arreglo: " + n);
            if (resultado != -1) {
                System.out.println("Valor encontrado en la posición: " + resultado);
            } else {
                System.out.println("Valor no encontrado.");
            }
            System.out.println("Tiempo de búsqueda: " + duracion + " nanosegundos");
            System.out.println("-----------------------------");
        }
    }

    public static int busquedaBinaria(int[] arreglo, int valorBuscado) {
        return busquedaBinariaRecu(arreglo, valorBuscado, 0, arreglo.length - 1);
    }

    private static int busquedaBinariaRecu(int[] arreglo, int valorBuscado, int ini, int fin) {
        if (ini > fin) {
            return -1;
        }

        int mid = ini + ((fin - ini) / 2);

        if (valorBuscado == arreglo[mid]) {
            return mid;
        } else if (valorBuscado < arreglo[mid]) {
            return busquedaBinariaRecu(arreglo, valorBuscado, ini, mid - 1);
        } else {
            return busquedaBinariaRecu(arreglo, valorBuscado, mid + 1, fin);
        }
    }
}

