package testclientews;

import clientews.servicio.*;

public class TestServicioSumarWS {

    public static void main(String[] args) {
        ServicioSumarWS servicioSumarWS = new ServicioSumarImplService().getServicioSumarImplPort();

        System.out.println("Ejecutando servicio sumar ws");

        int x = 5;
        int y = 7;

        int resultado = servicioSumarWS.sumar(x, y);
        System.out.println("Resultado: " + resultado);
        System.out.println("Fin de servicio sumar WS");
    }
}
