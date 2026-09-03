package Parcial1;

import java.util.Scanner;

public class IfSencillo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto ki de sayayin tienes:");
        int aura = leer.nextInt();
        boolean tienesMemorias = leer.nextBoolean();
        // AND && que tiene que cumplir todas las condiciones
        // OR || que una de las dos cumplan
        if(aura >= 100 && tienesMemorias == false){
            System.out.println("Bienvenido a tu primer start up");
        }



        System.exit(0);
        System.out.println(10 >3);
        System.out.println(10 < 3);
        System.out.println(10 >=3);
        System.out.println(10 <=3);
        System.out.println(10 == 3);
        System.out.println(10 != 3);


        System.exit(0);
        int corazones = 48;
        if(corazones == 13){
            System.out.println("Completo");
        }
        if(corazones >= 20){
            System.out.println("Tienes mods");
        }
        System.out.println("Fin del programa");
    }
}
