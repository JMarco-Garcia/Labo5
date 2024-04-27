package session5;

import session5.Pantallas.PantallaPersonas;

/**
 *
 * @author Estudiante
 */
public class Session5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea el objeto de JFrame
        PantallaPersonas pantalla = new PantallaPersonas();
        // Muestra la pantalla
        pantalla.setVisible(true);
        // Centra en JFrame en la pantalla
        pantalla.setLocationRelativeTo(null);
    }
    
}
