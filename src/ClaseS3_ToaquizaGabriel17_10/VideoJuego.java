package ClaseS3_ToaquizaGabriel17_10;

public class VideoJuego {
    private String titulo;
    private String plataforma;
    private int puntuacion;

    public VideoJuego(){
        titulo="Juego Malote";
        plataforma="Steam";
        puntuacion=85;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        if(puntuacion>0){
            this.puntuacion = puntuacion;
        }
    }
}
