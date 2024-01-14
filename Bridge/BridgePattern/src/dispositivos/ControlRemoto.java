package dispositivos;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import interfaces.*;
public class ControlRemoto extends JPanel implements DispositivoControl {
    //boolean encendido;
    //int volumen;
    public ControlRemoto(JPanel tvPanel, JPanel proyectorPanel) {
    	setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    	this.setBorder(new LineBorder(Color.BLACK));
        this.add(new JLabel("Control Remoto"));
        this.add(tvPanel);
        this.add(proyectorPanel);
    }

    public void operar(DispositivoCasa dispositivo) {
    	dispositivo.operar();
    }

    public void volumen(DispositivoCasa dispositivo) {
        dispositivo.volumen();
    }



}
