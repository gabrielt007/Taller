package ClaseS7_Toaquiza_Abstracto;

public class Auto extends Vehiculo{
    public  Auto() {
    }
    @Override
    public double calcularValorMatricula(int kmRecorridos,int mesesUso){
        return 40+(kmRecorridos*0.8)+(mesesUso-1);
    }
}
