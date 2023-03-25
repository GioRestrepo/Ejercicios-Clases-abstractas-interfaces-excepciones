package Ejercicio_3;

public abstract class Video extends Formato {
    public String creador;
    public String tipoVideo;

    public Video(String duracion, String tamanio,  String creador, String tipoVideo) {
        super(duracion, tamanio);
        this.creador = creador;
        this.tipoVideo = tipoVideo;
    }


    public abstract String reproducir();
}
