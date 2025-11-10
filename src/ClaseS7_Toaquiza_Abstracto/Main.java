package ClaseS7_Toaquiza_Abstracto;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        char eleccion;

        Scanner datos=new Scanner(System.in);

        do {
            System.out.println("-----MENU-----");
            System.out.print("1.Auto\n2.Moto\n3.Camion\n4.Salir\nIngrese la opcion: ");
            int opcion = datos.nextInt();
            datos.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("-------Datos del Auto------");
                    Auto auto=new Auto();
                    auto.pedirDatos(datos);
                    System.out.print("Desea ver calcular el valor de la matricula? (Y/N): ");
                    eleccion=datos.next().toUpperCase().charAt(0);
                    if (eleccion=='Y'){
                        System.out.print("Ingrese e valor de los km recorridos: ");
                        int km=datos.nextInt();
                        System.out.print("Ingrese los meses de uso del vehículo: ");
                        int meses=datos.nextInt();
                        datos.nextLine();
                        System.out.println("El valor de su matricula es: $"+auto.calcularValorMatricula(km,meses));
                    }
                    break;
                case 2:
                    System.out.println("-------Datos de la Moto------");
                    Moto moto=new Moto();
                    moto.pedirDatos(datos);
                    System.out.print("Desea ver calcular el valor de la matricula? (Y/N): ");
                    eleccion=datos.next().charAt(0);
                    if (eleccion=='Y'){
                        System.out.print("Ingrese e valor de los km recorridos: ");
                        int km=datos.nextInt();
                        System.out.print("Ingrese los meses de uso del vehículo: ");
                        int meses=datos.nextInt();
                        datos.nextLine();
                        System.out.println("El valor de su matricula es: $"+moto.calcularValorMatricula(km,meses));
                    }
                    break;
                case 3:
                    System.out.println("-------Datos del Camion------");
                    Camion caminon=new Camion();
                    caminon.pedirDatos(datos);
                    System.out.print("Desea ver calcular el valor de la matricula? (Y/N): ");
                    eleccion=datos.next().charAt(0);
                    if (eleccion=='Y'){
                        System.out.print("Ingrese e valor de los km recorridos: ");
                        int km=datos.nextInt();
                        System.out.print("Ingrese los meses de uso del vehículo: ");
                        int meses=datos.nextInt();
                        datos.nextLine();
                        System.out.println("El valor de su matricula es: $"+caminon.calcularValorMatricula(km,meses));
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }while(true);

    }
}
