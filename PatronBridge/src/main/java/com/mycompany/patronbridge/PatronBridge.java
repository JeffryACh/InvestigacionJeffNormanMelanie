/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronbridge;

/**
 *
 * @author Melanie
 */
import javax.swing.*;

import dispositivos.*;
import interfaces.*;

import java.awt.*;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class PatronBridge extends JFrame{

    private Televisor televisor;
    private Proyector proyector;
    private Control controlCelular;
    private Control controlRemoto;

    public PatronBridge (){
        setTitle("Control de Dispositivos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());
        // Creación e inicialización de dispositivos
        televisor = new Televisor();
        proyector = new Proyector();

        JPanel panelEstado = new JPanel(new GridLayout(1, 2));
        panelEstado.add(televisor.getPanel());
        panelEstado.add(proyector.getPanel());
        // Creación de controles que utilizan los dispositivos
        controlCelular = new Celular(televisor);
        controlRemoto = new ControlRemoto(proyector);

        JPanel panelControl = new JPanel(new GridLayout(2, 4));
        panelControl.add(crearBoton("Encender TV", e -> controlCelular.encenderDispositivo()));
        panelControl.add(crearBoton("Apagar TV", e -> controlCelular.apagarDispositivo()));
        panelControl.add(crearBoton("Subir Vol. TV", e -> controlCelular.subirVolumen()));
        panelControl.add(crearBoton("Bajar Vol. TV", e -> controlCelular.bajarVolumen()));
        panelControl.add(crearBoton("Encender Proyector", e -> controlRemoto.encenderDispositivo()));
        panelControl.add(crearBoton("Apagar Proyector", e -> controlRemoto.apagarDispositivo()));
        panelControl.add(crearBoton("Subir Vol. Proyector", e -> controlRemoto.subirVolumen()));
        panelControl.add(crearBoton("Bajar Vol. Proyector", e -> controlRemoto.bajarVolumen()));

        add(panelEstado, BorderLayout.CENTER);
        add(panelControl, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JButton crearBoton(String texto, ActionListener listener) {
        JButton boton = new JButton(texto);
        boton.addActionListener(listener);
        return boton;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PatronBridge::new);
    }
}
//La interfaz de usuario principal que integra los controles y los dispositivos

