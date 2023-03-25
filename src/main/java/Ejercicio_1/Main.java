package Ejercicio_1;

public class Main {
    public static void main(String[] args) throws CineException {

        Cine cine = new Cine("Avatar",2022, 500, "Central",6, "Matutina");
        System.out.println(cine.valorBoleta());

    }
}
