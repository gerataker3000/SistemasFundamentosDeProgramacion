package Parcial2;

public class CicloViciosoDeMojojoPorHablarAsiRaro {
    static boolean capitulosAnimeVistos(int cantidadVistas){
        return cantidadVistas < 5;
    }
    public static void main(String[] args) {
        int capituloPorDia = 0;
        while (capitulosAnimeVistos(capituloPorDia)){
            System.out.println("One pies");
            System.out.println("estás enfermo bruce wayne");
            capituloPorDia++;
        }


        System.exit(0);
        int cantidadBateria = 0;
        while(cantidadBateria < 100){
            //hay que recar el celular
            cantidadBateria +=20;
            System.out.println(cantidadBateria);
        }
    }
}
