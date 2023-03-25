package Ejercicio_3;

public class Wav extends Audio{


    public Wav(String duracion, String tamanio, String artista, String compositor, String generoMusical) {
        super(duracion, tamanio, artista, compositor, generoMusical);
    }

    @Override
    public String reproducir() {
        return "Wav: " + "duracion: "+ duracion +", tamaño: " + tamanio + ", artista: "+ artista +
                ", composito: " + compositor + ", Genero Musical: " + generoMusical;
    }
}
