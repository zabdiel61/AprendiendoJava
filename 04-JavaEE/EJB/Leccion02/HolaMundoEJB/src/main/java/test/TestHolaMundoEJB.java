package test;

import beans.HolaMundoEjbRemote;
import javax.naming.*;

/**
 *
 * @author jonat
 */
public class TestHolaMundoEJB {

    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try {
            Context jndi = new InitialContext();
            HolaMundoEjbRemote holaMundoEjbRemote = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado = holaMundoEjbRemote.sumar(2, 3);
            System.out.println("resultado EJB suma = " + resultado);
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
