package Parcial1;

import java.util.Scanner;

public class IfTernario {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Instancia de calsesita scanner para usar sus metodos
        //Como ustedes lo usaron :(
        System.out.println("Dame tu password");
        String password = leer.nextLine();
        String buenaContrasena = password.length() >= 8
                ? "Buena contraseña" : "Mala contraseña";
        System.out.println(buenaContrasena);


        System.exit(0);
        /**
        System.out.println("Que quiere ver hijo");
        String tipo = leer.nextLine();
        String serie = (tipo.equals("anime"))
                ? "Los 7 pecados capitales"
                : "Supernatural";
        System.out.println(serie);
         */
    }
}
