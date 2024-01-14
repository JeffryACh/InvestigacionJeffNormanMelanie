package ventanas;
import javax.swing.SwingUtilities;

public class DeviceControlApp {
	public static void main(String[] args) {
        SwingUtilities.invokeLater(CasaUI::new);
    }
}
