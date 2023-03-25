package Ejercicio_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante(1, "Juan",12, 3, "No tiene");

        FormalizacionEstudiante formalizacionEstudiante = new FormalizacionEstudiante();
        formalizacionEstudiante.incribirEstudiante(estudiante1);
        formalizacionEstudiante.incribirEstudiante(new Estudiante(2, "Luis", 15, 8, "Geografía"));
         formalizacionEstudiante.imprimirListado();
        System.out.println("-------------");
        formalizacionEstudiante.consultarMaterias(1);



    }
}
