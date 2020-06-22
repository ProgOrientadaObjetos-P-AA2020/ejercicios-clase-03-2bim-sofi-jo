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
public class Rombo extends Figura {

    double diagonal_mayor;
    double diagonal_menor;

    public void establecerDiagonalMayor(int b) {
        diagonal_mayor = b;
    }

    public void establecerDiagonalMenor(int a) {
        diagonal_menor = a;
    }

    @Override
    public void calcular_Area() {
        area = (diagonal_mayor * diagonal_menor) / 2;
    }

    public double obtenerDiagonalMayor() {
        return diagonal_mayor;
    }

    public double obtenerDiagonalMenor() {
        return diagonal_menor;
    }

    @Override
    public String toString() {

        String cadena = String.format("Figura : %s\nBase: %.2f\nAltura: %.2f\n"
                + "Area: %.2f\n", obtenerCaracteristicas(),
                obtenerDiagonalMayor(), obtenerDiagonalMenor(),
                obtenerArea());
        return cadena;
    }

}
