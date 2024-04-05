import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemporizadorConMensajePersonalizado {
    private static int contador = 0;

    public static void main(String[] args) {
        int intervalo = 2000; // Intervalo en milisegundos (2 segundos)

        Timer timer = new Timer(intervalo, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                String mensaje = obtenerMensaje();
                System.out.println(mensaje);
            }
        });

        timer.start();
    }

    private static String obtenerMensaje() {
        if (contador < 5) {
            return "Mensaje predeterminado";
        } else {
            return "Mensaje modificado después de 5 iteraciones";
        }
    }
}
