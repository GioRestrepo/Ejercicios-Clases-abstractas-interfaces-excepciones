package Ejercicio_2;

import java.util.ArrayList;

public class FormalizacionEstudiante {
    private ArrayList<Estudiante> estudiante;

    public FormalizacionEstudiante(){
        this.estudiante = new ArrayList<>();

    }
    public void incribirEstudiante(Estudiante data){
        //estudiante =new Estudiante(data);
        estudiante.add(data);
    }

    public void imprimirListado(){
        for (Estudiante estudiante:estudiante) {
            System.out.println(estudiante);
        }
    }
    public ArrayList<Estudiante>  consultarMaterias(Integer id){


        for(Estudiante estudiante1: estudiante){
            if(estudiante1.equals(id))
                if(estudiante.get(4).equals("No tiene"))
                    return null;
        }

            return this.estudiante;


    }
}
