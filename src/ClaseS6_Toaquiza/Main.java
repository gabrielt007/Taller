package ClaseS6_Toaquiza;

public class Main {
    public static void main(String[] args){
        Persona uno = new Persona("Gabriel",21,"1727083923");
        Estudiante dos = new Estudiante("Toto",21,"1417283914","toto007");
        Profesor tres = new Profesor("Claudia",22,"1727083914","Fisica");
        uno.imprimir();
        dos.imprimir();
        tres.imprimir();
    }
}
