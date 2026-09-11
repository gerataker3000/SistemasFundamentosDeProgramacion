package Parcial2;

public class Arrays {
    public static void main(String[] args) {
        //Forma de crear un arreglo
        // No lo haga joven
        //String[] musicaFea= new String[2];
        //musicaFea[0] = "Corridos";
        //musicaFea[1] = "Banda";
        String[] categoriaChidaMusica = {"Pop", "Rock and roll", "Bolero", "Jazz"};
        for (int iterador = 0; iterador < categoriaChidaMusica.length ; iterador++){
            System.out.println(iterador);
            System.out.println(categoriaChidaMusica[iterador]);
        }

        // Forma de iterar un arreglo

        System.exit(0);
        // Forma de crear un arreglo agregando datos directo
        String[] categoriaMusica = {"Pop", "Rock and roll", "Bolero", "Jazz"};
        System.out.println(categoriaMusica[0]);
        //Actualizar el dato o cambiar dato o agregarñp
        categoriaMusica[2] =  "Metal";
        System.out.println(categoriaMusica[2]);
        System.out.println(categoriaMusica[3]);
        // No puedes poner 4 porque el tamaño involuntariamente lo pusiste arriba
        //categoriaMusica[4] = "Hip hop";
    }
}
