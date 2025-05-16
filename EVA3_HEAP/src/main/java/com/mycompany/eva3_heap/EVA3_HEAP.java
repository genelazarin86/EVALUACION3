/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_heap;

/**
 *
 * @author Admin
 */
public class EVA3_HEAP {

    public static void main(String[] args) {
       Prueba  prueba = new Prueba();
       
        System.out.println(prueba.x);
        //Prueba prueba2;  // necesito un respaldo
        //prueba2 = prueba;
        Prueba prueba2 = new Prueba();
        prueba2.x = prueba.x ;
        System.out.println(prueba2.x);
        prueba.x = 200;
        
        System.out.println(prueba.x
        );
        System.out.println(prueba);
        System.out.println(prueba2);
        if(prueba == prueba2)
            System.out.println("objetos iguales");
        else
            System.out.println("objetos distintos");
    }
}
    class Prueba{
    int x = 100;
    }
    

