package ejercico2;

import java.util.Scanner;

public class Principal {

    public static int indiceGanador(Atleta atletas[]){
        float tiempoCarrera;
        int indice =0;

        tiempoCarrera = atletas[indice].getTiempoCarrera();
        for(int i = 1; i < atletas.length;i++){
            if(atletas[i].getTiempoCarrera() < tiempoCarrera);
            tiempoCarrera = atletas[i].getTiempoCarrera();
            indice = i;

        }
        return indice;

    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombre;
        int numeroAtleta;
        int cantidadAtletas;
        float tiempoCarrera;
        int indiceAtletaGanador;

        System.out.print("digite la cantidad de atletas:");
        cantidadAtletas = lector.nextInt();

        Atleta atletas[] = new Atleta[cantidadAtletas];

        for(int i =0; i < atletas.length;i++){
            System.out.println("Digite los datpos del atleta" + (i+1)+ ":");
            System.out.print("introduzca el numero  del atleta"+ (i+1)+ ":");
            numeroAtleta= lector.nextInt();
            lector.nextLine();
            System.out.print("introduzca el nombre  del atleta"+ (i+1)+ ":");
            nombre= lector.nextLine();
            System.out.print("introduzca el tiempo de carrera");
            tiempoCarrera = lector.nextFloat();

            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);
        }
        indiceAtletaGanador = indiceGanador(atletas);
        System.out.println(atletas[indiceAtletaGanador].mostrarDatosGanador());


    }
}
