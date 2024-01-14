package ventanas;
import javax.swing.*;
import javax.swing.border.LineBorder;

import dispositivos.*;

import java.awt.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CasaUI extends JFrame {
    /*private JButton tvButton;
    private JButton computerButton;
    private JButton projectorButton;
*/
	Televisor televisor;
	Proyector proyector;
	JPanel tvPanel;
    public CasaUI() {
    	televisor=new Televisor();
    	proyector=new Proyector();
        setTitle("Device Control");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();//new BorderLayout());
        panel.setBounds(50, 50, 700, 700);
        
        panel.add(televisor, BorderLayout.NORTH);
        
        /*
        JPanel tvPanel = new JPanel();        
        tvPanel.add(new JLabel("Televisor"));
        tvPanel.setBounds(40,40,500, 300);
        tvPanel.setBorder(new LineBorder(Color.BLACK));
        panel.add(tvPanel, BorderLayout.NORTH);
        
        JPanel compuPanel = new JPanel();        
        compuPanel.add(new JLabel("Computadora"));
        panel.add(compuPanel, BorderLayout.SOUTH);*/
        
        
        panel.add(proyector, BorderLayout.CENTER);
        /*
        tvButton = new JButton("Televisor");
        computerButton = new JButton("Computadora");
        projectorButton = new JButton("Proyector");
        //tvButton.

        tvButton.addActionListener(new DeviceControlListener("Televisor"));
        computerButton.addActionListener(new DeviceControlListener("Computadora"));
        projectorButton.addActionListener(new DeviceControlListener("Proyector"));

        //JPanel panel = new JPanel();
        panel.add(tvButton);
        panel.add(computerButton);
        panel.add(projectorButton);
*/
        add(panel);

        //pack();
        //setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> new CasaUI());
    }/*
    private class DeviceControlListener implements ActionListener {
        private String deviceName;
        private boolean isOn;

        public DeviceControlListener(String deviceName) {
            this.deviceName = deviceName;
            this.isOn = false;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (isOn) {
                // Apagar el dispositivo
                isOn = false;
                JOptionPane.showMessageDialog(null, deviceName + " apagado");
                // Puedes agregar lógica adicional aquí para apagar el dispositivo específico.
            } else {
                // Encender el dispositivo
                isOn = true;
                JOptionPane.showMessageDialog(null, deviceName + " encendido");
                // Puedes agregar lógica adicional aquí para encender el dispositivo específico.
            }
        }
    }
*/
}
