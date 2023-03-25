package Ejercicio_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante(
                1,
                "Juan",
                12,
                3
        );

        FormalizacionEstudiante formalizacionEstudiante = new FormalizacionEstudiante();

        formalizacionEstudiante.incribirEstudiante(estudiante1);

        formalizacionEstudiante.incribirEstudiante(new Estudiante(2, "Luis", 15, 8));

        formalizacionEstudiante.imprimirListado();

        formalizacionEstudiante.incribirMateriaEstudiante(1, "POO");
        formalizacionEstudiante.incribirMateriaEstudiante(2, "Geografia");
        System.out.println("-------------");

        System.out.println(formalizacionEstudiante.consultarMateriasPorEstudiante(1).toString());




    }
}
