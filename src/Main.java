

public class Main {

    public static void main(String[] args) {
        System.out.println("Marí");
        System.out.println("Welcome to Gears of war e day");
        leerMensaje("Mari");
        leerMensaje("Ale");
        leerMensaje("Claudia");

        int intentosVar;
        intentosVar = mandarIntentos(5);
        System.out.println(intentosVar);
        intentosVar = mandarIntentos(0);
        System.out.println(intentosVar);
    }

    static void  leerMensaje(String nombre){
        System.out.println("Hola como estas mi querida "+nombre);
        System.out.println("Estydive pendanso ");
        System.out.println("");
    }

    static int mandarIntentos(int intentos){
        return  intentos*100;
    }


}