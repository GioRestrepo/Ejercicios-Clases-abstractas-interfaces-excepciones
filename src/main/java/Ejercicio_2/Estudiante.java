package Ejercicio_2;

import java.util.ArrayList;

public class Estudiante {
    private int identificacion;
    private String nombre;
    private int edad;
    private int curso;
    private ArrayList<String> materia;

    public Estudiante(int identificacion, String nombre, int edad, int curso) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        materia = new ArrayList<>();
    }

    public Estudiante(int identificacion, String nombre, int edad, int curso, ArrayList<String> materia) {
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

    public void InscribirMaterias(ArrayList<String> materias){
        this.materia.addAll(materias);
    }

    public void InscribirMateria(String materia){
        this.materia.add(materia);
    }
}
