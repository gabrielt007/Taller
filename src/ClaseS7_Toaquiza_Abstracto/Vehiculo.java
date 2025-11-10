package ClaseS7_Toaquiza_Abstracto;

import java.util.Scanner;

public abstract class Vehiculo {
    private String marca;
    private String placa;
    private int anio;
    private String propietario;

    public Vehiculo(){
        this.marca=null;
        this.anio=0;
        this.propietario=null;
        this.placa=null;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public abstract double calcularValorMatricula(int kmRecorridos,int mesesUso);

    public void pedirDatos(Scanner datos){
        System.out.print("Ingrese el nombre del propietario: ");
        String nombre=datos.nextLine();
        System.out.print("Ingrese la placa del Vehículo: ");
        String placa=datos.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca=datos.nextLine();
        System.out.print("Ingrese el año: ");
        int anio= datos.nextInt();
        setAnio(anio);
        setPropietario(nombre);
        setMarca(marca);
        setPlaca(placa);
    };
}

