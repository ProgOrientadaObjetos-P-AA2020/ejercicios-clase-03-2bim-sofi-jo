/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

/**
 *
 * @author reroes
 */
public class Triangulo extends Figura {

    double base;
    double altura;

    public void establecerBase(int b) {
        base = b;
    }

    public void establecerAltura(int a) {
        altura = a;
    }

    @Override
    public void calcular_Area() {
        area = (base * altura) / 2;
    }

    public double obtenerBase() {
        return base;
    }

    public double obtenerAltura() {
        return altura;
    }

    @Override
    public String toString() {

        String cadena = String.format("Figura : %s\nBase: %.2f\nAltura: %.2f\n"
                + "Area: %.2f\n", obtenerCaracteristicas(), obtenerBase(),
                obtenerAltura(), obtenerArea());
        return cadena;
    }

}
