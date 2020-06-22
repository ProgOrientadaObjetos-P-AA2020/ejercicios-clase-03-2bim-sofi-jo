package paqueteseis;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
         */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int opc;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // inicio de solución
        System.out.println("Ingrese cuantos Estudiantes Presenciales desea ingresar");
        opc = entrada.nextInt();
        
        for (int i = 0; i < opc; i++) {
            entrada.nextLine();
            System.out.printf("Ingrese los nombres del estudiante: %d\n", i+1);
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            // Solicitar ingreso de valores para variables 
            // Solicitar numeroCreds, costoCred
            // Leer numeroCreds, costoCred
            System.out.println("Ingrese el número de créditos");
            numeroCreds = entrada.nextInt();
            System.out.println("Ingrese el costo de cada créditos");
            costoCred = entrada.nextDouble();
            // Declarar,crear e iniciar objeto tipo EstudiantePresencial
            EstudiantePresencial estudianteP = new EstudiantePresencial(nombresEst, 
                    apellidosEst, numeroCreds, costoCred);
            // se hace uso de los métodos establecer para asignar valores
            // a los datos (atributos) del objeto
            estudianteP.establecerIdentificacionEstudiante(identificacionEst);
            estudianteP.establecerEdadEstudiante(edadEst);
            // Se agrega al arrayList estudiantes un objeto de tipo
            // EstudiantePresencial
            estudiantes.add(estudianteP);
        }
        System.out.println("Ingrese cuantos Estudiantes a distancia desea ingresar");
        opc = entrada.nextInt();
        
        for (int i = 0; i < opc; i++) {
            entrada.nextLine();
            // Solicitar nombresEst, apellidosEst, identificacionEst, edadEst
            // Leer nombresEst, apellidosEst, identificacionEst, edadEst
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            // Solicitar ingreso de valores para variables 
            // Solicitar numeroAsigs, costoAsig 
            // Leer numeroAsigs, costoAsig
            System.out.println("Ingrese el número de asignaturas");
            numeroAsigs = entrada.nextInt();
            System.out.println("Ingrese el costo de cada cada asignatura");
            costoAsig = entrada.nextDouble();

            // Declarar,crear e iniciar objeto tipo EstudianteDistancia
            EstudianteDistancia estudianteD = new EstudianteDistancia(numeroAsigs
                    , costoAsig, nombresEst, apellidosEst);
            // se hace uso de los métodos establecer para asignar valores
            // a los datos (atributos) del objeto
            estudianteD.establecerIdentificacionEstudiante(identificacionEst);
            estudianteD.establecerEdadEstudiante(edadEst);
            // Se agrega al arrayList estudiantes un objeto de tipo
            // EstudianteDistancia
            estudiantes.add(estudianteD);
        }

        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}
