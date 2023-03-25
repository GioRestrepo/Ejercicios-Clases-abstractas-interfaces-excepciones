package Ejercicio_3;

public class Mp3 extends Audio{


    public Mp3(String duracion, String tamanio, String artista, String compositor, String generoMusical) {
        super(duracion, tamanio, artista, compositor, generoMusical);
    }

    @Override
    public String reproducir() {
        return "Mp3: " + "duracion: "+ duracion +", tamaño: " + tamanio + ", artista: "+ artista +
                ", compositor: " + compositor + ", Genero Musical: " + generoMusical;
    }
}
