/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

/**
 *
 * @author Melanie
 */
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;


import interfaces.*;

public class Proyector implements Dispositivo {
    private boolean encendido = false;
    private int volumen = 0;
    private JPanel panel;
    private JLabel volumenLabel;

    public Proyector() {
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Proyector"));
        panel.setBackground(Color.GRAY);
        volumenLabel = new JLabel("Volumen: 0");
        panel.add(volumenLabel);
    }
    // Métodos de implementación específicos del proyector
    @Override
    public void encender() {
        encendido = true;
        panel.setBackground(Color.WHITE);
        System.out.println("Proyector encendido");
    }


    @Override
    public void apagar() {
        encendido = false;
        panel.setBackground(Color.GRAY);
        System.out.println("Proyector apagado");
    }

    @Override
    public void subirVolumen() {
        volumen++;
        volumenLabel.setText("Volumen: "+String.valueOf(volumen));
        System.out.println("Volumen del proyector: " + volumen);
    }

    @Override
    public void bajarVolumen() {
        volumen--;
        volumenLabel.setText("Volumen: "+String.valueOf(volumen));
        System.out.println("Volumen del proyector: " + volumen);
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }

    public JPanel getPanel() {
        return panel;
    }
}
//Implementación concreta para Proyector