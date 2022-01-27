package ejercicios;

import java.util.Scanner;

public class VehiculoEjecutable {
    public static int indiceCarroMasBarato(Vehiculo carros[]){
        float precio;
        int indice=0;

        precio= carros[0].getPrecio();

        for(int i=1 ; i< carros.length;i++ ){
            if(carros[i].getPrecio()<precio){
             precio=carros[i].getPrecio();
             indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String marca;
        String modelo;
        float precio;
        int numeroVehiculos ;
        int indiceMasBarato;

        System.out.println("digite la cantidad de vehiculos");
        numeroVehiculos= lector.nextInt();

        Vehiculo carros[] = new Vehiculo[numeroVehiculos];

        for (int i=0;i < carros.length; i++ ){
            lector.nextLine();
            System.out.println("digite las caracrteristcias del carro" +(i+1)+ ":");
            System.out.println("digite la marca");
            marca= lector.nextLine();
            System.out.print("digite el modelo del carro" +(i +1)+ ":");
            modelo= lector.nextLine();
            System.out.print("digite el precio del carro"+ (i+1)+":");
            precio = lector.nextFloat();

            carros[i] = new Vehiculo(marca,modelo,precio);
        }

        indiceMasBarato= indiceCarroMasBarato(carros);//

        System.out.println("\n el coche mas barato es :");
        System.out.println(carros[indiceMasBarato].mostrarDatos());
    }
}
