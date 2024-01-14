package dispositivos;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import interfaces.*;

public class Televisor extends JPanel implements DispositivoCasa {
    public boolean encendido;
    public int volumen;
    JLabel volumenLabel;
    public Televisor() {
        encendido=false;
        volumen=0;
        this.add(new JLabel("Televisor"));
        this.setBounds(40,40,500, 300);
        this.setBorder(new LineBorder(Color.BLACK));
        this.add(new JLabel("Volumen: "));
        volumenLabel=new JLabel(String.valueOf(volumen));
        this.add(volumenLabel);
    }

    @Override
    public void encender() {
    	encendido=true;
    	this.setBackground(Color.WHITE);
    }


	@Override
	public void apagar() {
		encendido=false;
		this.setBackground(null);
	}

	@Override
	public void volumen() {
		volumen++;
		volumenLabel.setText(String.valueOf(volumen));
	}
	
	public void operar() {
		if(encendido) {
    		apagar();
    	}else {
    		encender();
    	}
	}

	@Override
	public void bajarVolumen() {
		// TODO Auto-generated method stub
		
	}

	

}
