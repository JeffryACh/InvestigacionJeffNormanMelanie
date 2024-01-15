/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author Melanie
 */
import javax.swing.JPanel;

public interface Dispositivo {
    void encender();
    void apagar();
    void subirVolumen();
    void bajarVolumen();
    boolean estaEncendido();
    JPanel getPanel();
}
//Interfaz de implementación que define las operaciones comunes para todos los dispositivos
