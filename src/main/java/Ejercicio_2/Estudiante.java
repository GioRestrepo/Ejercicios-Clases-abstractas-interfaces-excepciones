package Ejercicio_2;

import java.util.ArrayList;

public class Estudiante {
    private int identificacion;
    private String nombre;
    private int edad;
    private int curso;
    private String materia;

    public Estudiante(int identificacion, String nombre, int edad, int curso, String materia) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.materia = materia;

    }

    public int getIdentificacion() {
        return identificacion;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "identificacion=" + identificacion +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso=" + curso +
                ", materia='" + materia + '\'' +
                '}';
    }
}
