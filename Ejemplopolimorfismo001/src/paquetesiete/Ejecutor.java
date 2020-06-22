/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner so = new Scanner(System.in);
        double lado;
        double diagM;
        double diagMen;
        double base;
        double altura;
        
        System.out.println("Cuadrado");
        for (int i = 0; i < 4; i++) {
            Cuadrado c = new Cuadrado();
            System.out.println("Ingrese el lado del cuadrado");
            lado = so.nextDouble();
            c.establecerCaracteristicas("Cuadrado");
            c.establecerLado(lado);
            figuras.add(c);
        }
        System.out.println("Rombo");
        for (int i = 0; i < 3; i++) {
            Rombo r = new Rombo();
            System.out.println("Ingrese el tamaño de la diagonal mayor");
            diagM = so.nextDouble();
            System.out.println("Ingrese el tamaño de la diagonal menor");
            diagMen = so.nextDouble();
            
            r.establecerCaracteristicas("Rombo");
            r.establecerDiagonalMayor(diagM);
            r.establecerDiagonalMenor(diagMen);
            figuras.add(r);
        }
        System.out.println("Triangulo");
        for (int i = 0; i < 5; i++) {
            Triangulo t = new Triangulo();
            System.out.println("Ingrese la base del triangulo");
            base = so.nextDouble();
            System.out.println("Ingrese el altura del triangulo");
            altura = so.nextDouble();
            t.establecerCaracteristicas("Triangulo");
            
            t.establecerBase(base);
            t.establecerAltura(base);
            figuras.add(t);
        }
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
