
package javagui;
import javax.swing.SwingUtilities;

public class JavaGUI {

   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new frmIntro().setVisible(true));
      
    }
    
}
