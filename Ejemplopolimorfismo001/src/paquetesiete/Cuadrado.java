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
public class Cuadrado extends Figura {

    double lado;
    

    public void establecerLado(double l) {
        lado = l;
    }

    @Override
    public void calcular_Area() {
        area = lado * lado;
    }

    public double obtenerLado() {
        return lado;
    }

    @Override
    public String toString() {

        String cadena = String.format("Caracteristica : %s\nLado: %.2f\nArea: %.2f\n",
                obtenerCaracteristicas(), obtenerLado(), obtenerArea());
        return cadena;
    }
}
