package Parcial1;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class IfAnidado {
    public static void main(String[] args) {
        String tipo = "Asalariado";
        int ganas = 400000;
        int cantidadTrabajos = 2;
        if(tipo.equals("Asalariado")){
            System.out.println("Patron");
            if(ganas >=400000 || cantidadTrabajos >= 2){
                System.out.println("Declaracion anual");
            }
        }else{
            System.out.println("Obigaciones");
            System.out.println("Declaracion anual");
            System.out.println("Declaración mensual");
        }

    }
}
