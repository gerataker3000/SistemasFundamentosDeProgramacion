package Parcial1;

import java.util.Scanner;

public class Elif {
    public static void main(String[] args) {
        Scanner leer2 = new Scanner(System.in);
        String tipoAmor;
        System.out.println("Descubre la verdad amigo no cierres los ojos");
        tipoAmor = leer2.nextLine();

        if(tipoAmor.equals("Te amo")){
            System.out.println("Te ama");
        } else if (tipoAmor.equals("Te quiere")) {
            System.out.println("Te quiere");
        } else if (tipoAmor.equals("Le gustas")) {
            System.out.println("Le gustas");
        }else{
            System.out.println(" ERES UN JUGUETE");
        }


        System.exit(0);

        Scanner leer = new Scanner(System.in);
        System.out.println("1 Debito 2 Credito 3 Efectivo:");
        int opcion = leer.nextInt();
        if(opcion == 1){
            System.out.println("Guarda dinero y transferenca");
            System.out.println("Clonar tarjeta");
            System.out.println("vaciar dinero");
            System.out.println("Robar identidad");
            System.out.println("No generas historial crediticio");
        } else if (opcion == 2) {
            System.out.println("generas historial creditic");
            System.out.println("puntos");
            System.out.println("Cashback");
            System.out.println("Viajes");
        } else if (opcion == 3) {
            System.out.println("Descapitalización");
        }else{
            System.out.println("Opció no valida");
        }
    }

}
