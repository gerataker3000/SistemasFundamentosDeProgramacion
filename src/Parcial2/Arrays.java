package Parcial2;

public class Arrays {
    public static void main(String[] args) {
        //Forma de crear un arreglo
        // No lo haga joven
        //String[] musicaFea= new String[2];
        //musicaFea[0] = "Corridos";
        //musicaFea[1] = "Banda";
        String[] categoriaChidaMusica = {"Pop", "Rock and roll", "Bolero", "Jazz"};
        for (int iterado= 0; iterado<categoriaChidaMusica.length; iterado++){
            if(categoriaChidaMusica[iterado].equals("Pop")){
                System.out.println(categoriaChidaMusica[iterado]);
                System.out.println("Chayyane, Michael Jakcson");
            }

            //IMAGINADO QUE AL PROFE NO LE GUSTA :)
            if(categoriaChidaMusica[iterado].equals("Rock and roll")){
                continue;
                //System.out.println(categoriaChidaMusica[iterado]);
                //System.out.println("Nirvana, Yourlove");
            }

            if(categoriaChidaMusica[iterado].equals("Bolero")){
                System.out.println(categoriaChidaMusica[iterado]);
                System.out.println("Quien sabe");
                break;
            }

        }


        System.exit(0);
        System.out.println(categoriaChidaMusica[0]);
        System.out.println(categoriaChidaMusica[2]);
        categoriaChidaMusica[2] = "Hip hop";
        System.out.println(categoriaChidaMusica[2]);
        System.out.println(categoriaChidaMusica.length);

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
