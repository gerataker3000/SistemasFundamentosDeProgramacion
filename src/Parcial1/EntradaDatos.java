package Parcial1;

import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Cuantos veces");
        int visitasAlCine = scanner.nextInt();
        System.out.println("Visitas al cina: "+visitasAlCine);
    }
}
