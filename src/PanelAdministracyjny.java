import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;




public class PanelAdministracyjny extends JFrame{
	
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new Suwak("SliderDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
 
    public static void main(String[] args) {
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
         
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            	
            }
        });
    }

}
