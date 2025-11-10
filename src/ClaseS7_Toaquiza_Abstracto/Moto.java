package ClaseS7_Toaquiza_Abstracto;

public class Moto extends Vehiculo {
    public  Moto(){
    }
    @Override
    public double calcularValorMatricula(int kmRecorridos,int mesesUso){
        return 30+(kmRecorridos*0.4)+(mesesUso-1);
    }
}
