package Parcial2;

public class VariableGlobalLocal {
    static int nivel = 5;
    public static void main(String[] args) {
        String videojuego = "Gears";
        System.out.println(nivel);
       // System.out.println(vidas);
        if(nivel < 6){
            System.out.println(videojuego);
            int vidas = 5;
            System.out.println(vidas);
            System.out.println(nivel);
        }
        //System.out.println(vidas);
    }
}
