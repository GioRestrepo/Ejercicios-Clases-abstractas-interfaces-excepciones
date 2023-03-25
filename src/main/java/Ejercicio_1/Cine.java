package Ejercicio_1;

public class Cine extends Boleta {
    private int numeroDeSillas = 124;
    private String tipoDePresentacion;

    public Cine(String nombrePelicula, int anioDeEstreno, double valor, String ubicacionEnSala, int cantidadDeBoletas,
                String tipoDePresentacion) {
        super(nombrePelicula, anioDeEstreno, valor, ubicacionEnSala, cantidadDeBoletas);
        this.tipoDePresentacion = tipoDePresentacion;
    }


    public double valorBoleta() throws CineException {
        double valorBoleta;
        if (cantidadDeBoletas > 0 && cantidadDeBoletas <= numeroDeSillas) {

            if (cantidadDeBoletas > 5) {
                valorBoleta = this.valor -= descuento();
            } else {
                valorBoleta = this.valor;
            }
        } else {
            throw new CineException("la cantidad de boletas no está dentro de los rangos establecidos");

        }

        return valorBoleta;
        //Valor de la boleta depende de la cantidad
        //Si dentro del método
        //encuentra que la cantidad de boletas no está dentro de los rangos establecidos
    }

}
