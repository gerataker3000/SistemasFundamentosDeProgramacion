package Parcial2;

import java.util.Scanner;

public class CubosRubicNosejajajja {
    public static void main(String[] args) {
        //Primero mandamos llamar este metodo
        mostrarResultados();
    }

    static int leerPorcentaje(){
        System.out.print("Ingresa el % de uso: ");
        Scanner leer = new Scanner(System.in);
        int uso = leer.nextInt();
        while (uso < 0 || uso > 100){
            System.out.print("Favor de ingresar un porcentaje válido (0-100): ");
            uso = leerPorcentaje();
        }
        return uso;
    }

    static String evaluarProcesador(int uso){
        String rangoProcesador = uso <= 70 ? "Estado normal" : uso >= 71 && uso <= 85
                ? "Requiere supervisión" : "Estado crítico";
        return uso + "% - " + rangoProcesador;
    }

    static String evaluarMemoria(int uso){
        String rangoProcesador = uso <= 75 ? "Estado normal" : uso >= 76 && uso <= 85
                ? "Requiere supervisión" : "Estado crítico";
        return uso + "% - " + rangoProcesador;
    }

    static String evaluarAlmacenamiento(int uso){
        String rangoProcesador = uso <= 75 ? "Estado normal" : uso >= 76 && uso <= 85
                ? "Requiere supervisión" : "Estado crítico";
        return uso + "% - " + rangoProcesador;
    }

    static String evaluarServidor(int procesador,  int memoria, int almacenamiento){
        if (procesador > 70){
            return "No está funcionando correctamente el procesador";
        }
        if (memoria > 75){
            return "No está funcionando correctamente la memoria RAM";
        }
        if (almacenamiento > 70){
            return "No está funcionando correctamente";
        }
        return "Todo está bien";
    }

    static String mostrarResultados() {
        // obtener los datos
        int valorProcesador =leerPorcentaje();
        int valorMemoria =leerPorcentaje();
        int valorAlmacenamiento =leerPorcentaje();

        //Mostrar resultados
        String procesador = evaluarProcesador(valorProcesador);
        String memoria = evaluarMemoria(valorMemoria);
        String almacenamiento = evaluarAlmacenamiento(valorAlmacenamiento);

        //Evaluar el srerver
        String resultadoServidor = evaluarServidor(valorProcesador,valorMemoria,valorAlmacenamiento);
        System.out.println("-------------------------");
        System.out.println("   Reporte de Servidor   ");
        System.out.println("-------------------------");
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria: " + memoria);
        System.out.println("Almacenamiento: " + almacenamiento);
        System.out.println("Estado del servidor: " + resultadoServidor);
        System.out.println("-------------------------");
        return "";
    }
}
