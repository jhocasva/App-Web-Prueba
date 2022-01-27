package ejercico2;

public class Atleta {
    private int numeroAtleta;
    private String  nombre;
    private float tiempoCarrera;

    //construcctor


    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String mostrarDatosGanador(){
        return  "numero atleta : " +numeroAtleta+ "\n nombre atleta : "+ nombre +"\n tiempo de carrera: "+ tiempoCarrera;

    }
}
