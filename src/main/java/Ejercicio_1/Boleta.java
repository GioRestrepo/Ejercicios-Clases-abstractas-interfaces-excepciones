package Ejercicio_1;

public class Boleta extends Pelicula {

    protected double valor;
    protected String ubicacionEnSala;
    protected int cantidadDeBoletas;


    public Boleta(String nombrePelicula, int anioDeEstreno, double valor, String ubicacionEnSala, int cantidadDeBoletas) {
        super(nombrePelicula, anioDeEstreno);
        this.valor = valor;
        this.ubicacionEnSala = ubicacionEnSala;
        this.cantidadDeBoletas = cantidadDeBoletas;

    }

    //Descuento del 5%
    public double descuento(){
        double descuento = this.valor*0.05;
        return descuento;

    }

}
