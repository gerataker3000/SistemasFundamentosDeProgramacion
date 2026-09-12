package Parcial2;

public class Metoditos2 {
    public static void main(String[] args) {
        int dinero = 10000;
        mandarMensajeAmor("Carlos",dinero);
        mandarMensajeAmor("Axel",dinero);
        mandarMensajeAmor("Daniel",dinero);
        mandarMensajeAmor("Gabriel",dinero);
        mandarMensajeAmor("Jazmani",dinero);
        mandarMensajeAmor("Max steel",dinero);
        mandarMensajeAmor("Goku",dinero);
        mandarMensajeAmor("Miguel",0);
    }

    static void mandarMensajeAmor(String nombreFulano,int dinero){
        if(dinero == 0){
            dinero = 25000;
        }
        System.out.println("Buenos dias mi amor, tu mi querido: "+nombreFulano);
        System.out.println("Te ves sexy el dia de hoy");
        System.out.println("te espero en la noche con mucho amor");
        System.out.println("Tu amor mio traime porfi $"+dinero+"  el dinero y yo la diversión");
        System.out.println("------------------------------------");

    }
}
