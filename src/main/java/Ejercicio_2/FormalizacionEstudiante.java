package Ejercicio_2;

import java.util.ArrayList;

public class FormalizacionEstudiante {
    private ArrayList<Estudiante> estudiantes;

    public FormalizacionEstudiante(){
        this.estudiantes = new ArrayList<>();
    }
    public void incribirEstudiante(Estudiante data){
        estudiantes.add(data);
    }

    public void incribirMateriaEstudiante(int id, String materia){
        for (Estudiante  estudiante: estudiantes) {
            if(estudiante.getIdentificacion() == id){
                estudiante.InscribirMateria(materia);
            }
        }
    }

    public void imprimirListado(){
        for (Estudiante estudiante: estudiantes) {
            System.out.println(estudiante.toString());
        }
    }

    public Estudiante  consultarMateriasPorEstudiante(int id){
        Estudiante estudianteEncontrado = null;

        for (Estudiante  estudiante: estudiantes) {
            if(estudiante.getIdentificacion() == id){
                estudianteEncontrado = estudiante;
            }
        }
        if(estudianteEncontrado==null){
            throw new RuntimeException("Estudiante no encontrado");
        }

        return estudianteEncontrado;
    }
}
