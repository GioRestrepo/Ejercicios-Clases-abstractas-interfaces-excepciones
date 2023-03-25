package Ejercicio_3;

public class Reproductor{
   public static void main(String[] args) {

      Formato formatoMp3 = new Mp3("3:5m", "5mb", "Queen", "Queen", "Rock");
      String imprimirFormatoMp3 = formatoMp3.reproducir();
      System.out.println(imprimirFormatoMp3);

      Formato formatoWva = new Wav("4:5m", "6mb", "Bathory", "Bathory", "Metal");
      String imprimirFormatoWva = formatoWva.reproducir();
      System.out.println(imprimirFormatoWva);

      Formato formatoMp4 = new Mp4("120:5m", "120mb", "Tarantino", "Cine");
      String imprimirFormatoMp4 = formatoMp4.reproducir();
      System.out.println(imprimirFormatoMp4);
   }





}
