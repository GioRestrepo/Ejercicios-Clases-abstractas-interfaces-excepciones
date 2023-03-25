package Ejercicio_3;

import java.util.Date;

public abstract class Formato {
    protected String duracion;
    protected String tamanio;

    public Formato(String duracion, String tamanio) {
        this.duracion = duracion;
        this.tamanio = tamanio;
    }

    public abstract String reproducir();


}
