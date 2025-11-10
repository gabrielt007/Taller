package ClaseS7_Toaquiza_Abstracto;

public class Camion extends Vehiculo{
    public  Camion(){
    }
    @Override
    public double calcularValorMatricula(int kmRecorridos,int mesesUso){
        return 50+(kmRecorridos*0.1)+(mesesUso);
    }
}
