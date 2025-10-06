import java.util.Scanner;
public class Empleado {
    String nombre;
    String cargo;
    int salario;
    String fechaIngreso;
    public Empleado(String nombre, String cargo, int salario, String fechaIngreso){
        this.nombre=nombre;
        this.cargo=cargo;
        this.salario=salario;
        this.fechaIngreso=fechaIngreso;
    }
    void imprimir(){
        System.out.println("Empleado "+nombre + " "+cargo +" " +salario +" "+fechaIngreso);
    }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa el nombre: ");
        String nombre1= datos.nextLine();
        System.out.println("Ingresa el cargo:");
        String cargo1= datos.nextLine();
        System.out.println("Ingresa el salario:");
        int salario1 = datos.nextInt();
        datos.nextLine();
        System.out.println("La fecha de ingreso:");
        String fecha1=datos.nextLine();
        Empleado nuevo = new Empleado(nombre1,cargo1,salario1,fecha1);
        nuevo.imprimir();
        System.out.println("Ingresa el nombre: ");
        String nombre2= datos.nextLine();
        System.out.println("Ingresa el cargo:");
        String cargo2= datos.nextLine();
        System.out.println("Ingresa el salario:");
        int salario2 = datos.nextInt();
        datos.nextLine();
        System.out.println("La fecha de ingreso:");
        String fecha2=datos.nextLine();
        Empleado nuevo2 = new Empleado(nombre2,cargo2,salario2,fecha2);
        nuevo2.imprimir();
        System.out.println("Ingresa el nombre: ");
        String nombre3= datos.nextLine();
        System.out.println("Ingresa el cargo:");
        String cargo3= datos.nextLine();
        System.out.println("Ingresa el salario:");
        int salario3 = datos.nextInt();
        datos.nextLine();
        System.out.println("La fecha de ingreso:");
        String fecha3=datos.nextLine();
        Empleado nuevo3 = new Empleado(nombre3,cargo3,salario3,fecha3);
        nuevo.imprimir();

    }

}