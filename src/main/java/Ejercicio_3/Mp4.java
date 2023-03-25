package Ejercicio_3;

public class Mp4 extends Video{


    public Mp4(String duracion, String tamanio, String creador, String tipoVideo) {
        super(duracion, tamanio, creador, tipoVideo);
    }

    @Override
    public String reproducir() {
        return "Mp4: " + "Creador: " + this.creador + ",Tipo de video: "+this.tipoVideo +
                "duracion: "+ duracion +", tamaño: " + tamanio;
    }
}
