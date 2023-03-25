package Ejercicio_3;

public abstract class Audio extends Formato{
    protected String artista;
    protected String compositor;
    protected String generoMusical;

    public Audio(String duracion, String tamanio, String artista, String compositor, String generoMusical) {
        super(duracion, tamanio);
        this.artista = artista;
        this.compositor = compositor;
        this.generoMusical = generoMusical;
    }

    public abstract String reproducir();
}
