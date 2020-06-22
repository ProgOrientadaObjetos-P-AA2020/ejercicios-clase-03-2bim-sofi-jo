/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
         */

        // inicio de la solución
        ArrayList<Figura> figuras = new ArrayList<>();
        Cuadrado c = new Cuadrado();
        Cuadrado c2 = new Cuadrado();
        Cuadrado c3 = new Cuadrado();
        Cuadrado c4 = new Cuadrado();

        c.establecerCaracteristicas("Cuadrado");
        c.establecerLado(10);
        c2.establecerCaracteristicas("Cuadrado");
        c2.establecerLado(3);
        c3.establecerCaracteristicas("Cuadrado");
        c3.establecerLado(7.5);
        c4.establecerCaracteristicas("Cuadrado");
        c4.establecerLado(23);

        figuras.add(c);
        figuras.add(c2);
        figuras.add(c3);
        figuras.add(c4);

        Rombo r = new Rombo();
        Rombo r2 = new Rombo();
        Rombo r3 = new Rombo();

        r.establecerCaracteristicas("Rombo");
        r2.establecerCaracteristicas("Rombo");
        r3.establecerCaracteristicas("Rombo");

        r.establecerDiagonalMayor(10);
        r.establecerDiagonalMenor(8);
        r2.establecerDiagonalMayor(16);
        r2.establecerDiagonalMenor(5);
        r3.establecerDiagonalMayor(22);
        r3.establecerDiagonalMenor(7);

        figuras.add(r);
        figuras.add(r2);
        figuras.add(r3);

        Triangulo t = new Triangulo();
        Triangulo t2 = new Triangulo();
        Triangulo t3 = new Triangulo();
        Triangulo t4 = new Triangulo();
        Triangulo t5 = new Triangulo();

        t.establecerCaracteristicas("Triangulo");
        t2.establecerCaracteristicas("Triangulo");
        t3.establecerCaracteristicas("Triangulo");
        t4.establecerCaracteristicas("Triangulo");
        t5.establecerCaracteristicas("Triangulo");

        t.establecerBase(6);
        t.establecerAltura(7);
        t2.establecerBase(3);
        t2.establecerAltura(9);
        t3.establecerBase(12);
        t3.establecerAltura(5);
        t4.establecerBase(11);
        t4.establecerAltura(9);
        t5.establecerBase(8.3);
        t5.establecerAltura(5.6);

        figuras.add(t);
        figuras.add(t2);
        figuras.add(t3);
        figuras.add(t4);
        figuras.add(t5);
        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcular_Area();

            System.out.printf("Datos de Figura\n"
                    + "%s\n",
                    figuras.get(i));
        }
    }
}
