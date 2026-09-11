package Parcial2;

public class CiclosFor {
    public static void main(String[] args) {
        String[] categorias = new String[5];
        categorias[0] = "uno";

        leeMensaje("Fernanda");
        leeMensaje("Arguello");

        String nombre = "Fernanda no te suelto";
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(1));
        System.out.println(nombre.charAt(2));
        for(int teQuiero = 0; teQuiero <=nombre.length(); teQuiero++){
            System.out.println(nombre.charAt(teQuiero));
        }

        /*
        for (int iterador =-100; iterador <=100; iterador=iterador+5 ){
            System.out.println(iterador);
        }

         */
    }

    static void leeMensaje(String nombre){
        System.out.println("Hola mi amor: "+nombre);
        System.out.println("Como has estado");
    }
}
