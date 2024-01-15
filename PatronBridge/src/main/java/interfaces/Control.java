/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Melanie
 */
public class Control {
    private Dispositivo dispositivo;

    public Control(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
    // Métodos para interactuar con el dispositivo
    public void encenderDispositivo() {
        dispositivo.encender();
    }

    public void apagarDispositivo() {
        dispositivo.apagar();
    }

    public void subirVolumen() {
    	dispositivo.subirVolumen();
    }
    
    public void bajarVolumen() {
    	dispositivo.bajarVolumen();
    }
}
//Abstracción de control que mantiene una referencia a un dispositivo
