package Parcial1;

public class VariablesConstantes {
    public static void main(String[] args) {
        int nombre = 1;

       // Peluchitos
        int cantidadProductos = 24;
        double precioProducto = 230.0;
        final double IVA = 0.16;

        double subTotal = cantidadProductos*precioProducto;
        double impuesto = subTotal*IVA;
        double total = impuesto+subTotal;
        System.out.println("Cantidad Productos: "+cantidadProductos);
        System.out.println("Precio: "+precioProducto);
        System.out.println("subTotal: "+ subTotal );
        System.out.println("Total: "+total);


        /**
        int salario;
        salario= 4000;
        System.out.println(salario);
        salario= 12000;
        System.out.println(salario);
        salario = 30000;
        */
    }
}
