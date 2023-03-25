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

        //public int buscarCliente(String r){
            int index = -1;
            int bound = estudiante.size();
            for (int userInd = 0; userInd < bound; userInd++) {
                if (estudiante.get(userInd).nombre.equals(id)) {
                    index = userInd;
                    break;
                }
            }
            //return index;
    }

      /*  for(Estudiante estudiante1: estudiante){
            if(estudiante1.equals(id))
                if(estudiante.get(4).equals("No tiene"))
                    return null;
        }

            return this.estudiante;*/



  /*  public void inscribir(Integer id, String nombreMateria){
        materia.add(nombreMateria);
        if(estudiante.get(0).equals(id)){
            //estudiante.addAll(inscribirMateria(nombreMateria));
            //Collections.addAll(estudiante,inscribirMateria(nombreMateria));
            //List<String> list = new ArrayList<>();
            //Stream.of(estudiante, materia).forEach(list::addAll);
        }

    }
    public ArrayList<String> inscribirMateria (String data){
        ArrayList<String> materia = new ArrayList<>();
        materia.add(data);
        return materia;
    }*/
}
