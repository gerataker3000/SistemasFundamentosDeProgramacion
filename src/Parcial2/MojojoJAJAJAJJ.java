package Parcial2;

public class MojojoJAJAJAJJ {
    public static void main(String[] args) {
        String[] misCanciones = {"bohemian rhapsody","Hotel california","Imagine John Lenhon"};
        String[] misCanciones2 = {"Eminem","godzilla","Monkey"};
        leerArreglo(misCanciones);
        leerArreglo(misCanciones2);
    }

    static void leerArreglo(String[] canciones){
        for (int i = 0; i < canciones.length;i++){
            System.out.println(canciones[i]);
        }
    }
}
