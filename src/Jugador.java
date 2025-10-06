import java.util.Scanner;

public class Jugador {
    String nombre;
    int edad;
    String posicion;
    String equipo;
    public Jugador(String nombre, int edad, String posicion, String equipo){
        this.nombre=nombre;
        this.edad=edad;
        this.posicion=posicion;
        this.equipo=equipo;
    }
    void imprimir(){
        System.out.println("Bienvenido "+nombre+" "+edad+" "+ posicion +" "+ equipo);

    }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        Jugador nuevo = new Jugador("Gabriel",21,"delantero","liga de quito");
        nuevo.imprimir();
        System.out.println("Ingresa el nombre del jugador: ");
        String nombre1 = datos.nextLine();
        System.out.println("Ingresa su edad:");
        int edad1 = datos.nextInt();
        datos.nextLine();
        System.out.println("Ingresa su posicion en el equipo:");
        String posicion1=datos.nextLine();
        System.out.println("Ingresa el nombre de su equipo:");
        String equipo1 = datos.nextLine();

        Jugador nuevo2 = new Jugador(nombre1,edad1,posicion1,equipo1);
        nuevo2.imprimir();
        Jugador nuevo3 = new Jugador("Alberto",23,"Arquero","Ballenita");
        nuevo3.imprimir();
    }
}