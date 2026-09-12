package Parcial2;

public class Metodo3 {
    public static void main(String[] args) {
        // Operaciones matematica
        int calificacionFinalParcial = calcularPromedio(95,97,92);
        int calificacionFinalParcial2 = calcularPromedio(100,10,92);
        int calificacionFinalParcial3 = calcularPromedio(75,85);
        System.out.println(calificacionFinalParcial);
        System.out.println(calificacionFinalParcial2);
        System.out.println(calificacionFinalParcial3);

    }

    static int calcularPromedio(int promedio1, int  promedio2,int promedio3){
        validarPromedio(promedio1);
        validarPromedio(promedio2);
        validarPromedio(promedio3);
        return (promedio1+promedio2+promedio3)/3;
    }

    static int calcularPromedio(int promedio1, int  promedio2){
        validarPromedio(promedio1);
        validarPromedio(promedio2);
        return (promedio1+promedio2)/2;
    }

    static void validarPromedio(int promedio){
        if(promedio < 0){
            System.out.println(" No lo haga joven: " +promedio+ " se felix no haga eso");
            System.exit(0);
        }
    }
}
