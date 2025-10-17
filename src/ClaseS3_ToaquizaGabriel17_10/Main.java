package ClaseS3_ToaquizaGabriel17_10;

public class Main {
    public static void main() {
        VideoJuego nuevo = new VideoJuego();
        System.out.println("\nEjercicio 1:\n");
        System.out.println("\nTitulo: "+nuevo.getTitulo()+"\nPlataforma: "+nuevo.getPlataforma()+"\nPuntuacion: "+nuevo.getPuntuacion());
        nuevo.setPuntuacion(89);
        System.out.println("Nueva puntuacion: "+nuevo.getPuntuacion());
        System.out.println("\nEjercicio 2:\n");
        Personaje newCharter = new Personaje();
        System.out.println("\nNombre de personaje: "+newCharter.getNombrePersonaje());//Al intentar acceder a el nombre directamente no se puede a que es privado por lo tanto se crea un metodo get
    }
}
