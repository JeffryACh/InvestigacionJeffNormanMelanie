package ventanas;
import dispositivos.*;
import interfaces.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class ControlUI extends JFrame{
	JButton encenderButton, volumenButton,encenderButton2, volumenButton2, prencenderButton, prvolumenButton, prencenderButton2, prvolumenButton2, tvButton;
	JPanel panel,tvPanel, proyectorPanel, tvPanel2, proyectorPanel2;
	public ControlUI() {
		CasaUI panelCasa=new CasaUI();
		
		setTitle("Control");
        setSize(700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        panel=new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        
        encenderButton=new JButton("Encender/Apagar");
        encenderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelCasa.televisor.operar();
            }
        });
        
        volumenButton=new JButton("Volumen");
        volumenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelCasa.televisor.volumen();
            }
        });
        
        tvPanel=new JPanel();
        tvPanel.add(new JLabel("Televisor"));
        //tvPanel.setBounds(40,40,500, 300);
        tvPanel.setBorder(new LineBorder(Color.BLACK));
        tvPanel.add(encenderButton, BorderLayout.SOUTH);
        tvPanel.add(volumenButton, BorderLayout.CENTER);
        
        prencenderButton=new JButton("Encender/Apagar");
        prencenderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelCasa.proyector.operar();
            }
        });
        
        prvolumenButton=new JButton("Volumen");
        prvolumenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelCasa.proyector.volumen();
            }
        });
        proyectorPanel=new JPanel();
        proyectorPanel.add(new JLabel("Proyector"));
        //proyectorPanel.setBounds(40,40,500, 300);
        proyectorPanel.setBorder(new LineBorder(Color.BLACK));
        proyectorPanel.add(prencenderButton, BorderLayout.SOUTH);
        proyectorPanel.add(prvolumenButton, BorderLayout.CENTER);
        
        encenderButton2=new JButton("Encender/Apagar");
        encenderButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelCasa.televisor.operar();
            }
        });
        
        volumenButton2=new JButton("Volumen");
        volumenButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelCasa.televisor.volumen();
            }
        });
        tvPanel2=new JPanel();
        tvPanel2.add(new JLabel("Televisor"));
        //tvPanel.setBounds(40,40,500, 300);
        tvPanel2.setBorder(new LineBorder(Color.BLACK));
        tvPanel2.add(encenderButton2, BorderLayout.SOUTH);
        tvPanel2.add(volumenButton2, BorderLayout.CENTER);
        
        prencenderButton2=new JButton("Encender/Apagar");
        prencenderButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelCasa.proyector.operar();
            }
        });
        
        prvolumenButton2=new JButton("Volumen");
        prvolumenButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelCasa.proyector.volumen();
            }
        });
        proyectorPanel2=new JPanel();
        proyectorPanel2.add(new JLabel("Proyector"));
        //proyectorPanel.setBounds(40,40,500, 300);
        proyectorPanel2.setBorder(new LineBorder(Color.BLACK));
        proyectorPanel2.add(prencenderButton2, BorderLayout.SOUTH);
        proyectorPanel2.add(prvolumenButton2, BorderLayout.CENTER);
        
        volumenButton=new JButton("Volumen");
        
        Celular celular=new Celular(tvPanel, proyectorPanel);
        ControlRemoto control=new ControlRemoto(tvPanel2, proyectorPanel2);
        //celular.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        //celPanel.add(encenderButton);
        panel.add(celular);
        panel.add(control);//, BorderLayout.NORTH);
        /*
        JPanel compuPanel = new JPanel();        
        compuPanel.add(new JLabel("Computadora"));
        panel.add(compuPanel);
        
        JPanel proyectorPanel = new JPanel();        
        proyectorPanel.add(new JLabel("Proyector"));
        panel.add(proyectorPanel);
        */
        //panel.add(celPanel);
        add(panel);
        setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new ControlUI());
	}
	
	
}
