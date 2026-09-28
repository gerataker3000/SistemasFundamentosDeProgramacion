package Parcial2;

public class MetoditoDinerojejejejej {
    public static void main(String[] args) {
        retiroCajero(10000,0);
    }

    static void retiroCajero(double retiro,double saldo){
        if(retiro <=saldo && retiro > 0){
            saldo = saldo -retiro;
            // saldo -= retiro;
            System.out.println("Saldo nuevo pobre es:"+saldo);
        }else{
            System.out.println("Pobre saldo insuficiente, trabaja");
        }
    }
}
