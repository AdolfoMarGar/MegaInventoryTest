package Services;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Util {

    public static void msg_info(String titulo,String mensaje){
        JOptionPane.showMessageDialog(new JFrame(), mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void msg_error(String titulo,String mensaje){
        JOptionPane.showMessageDialog(new JFrame(), mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }

    public static void msg_warning(String titulo,String mensaje){
        JOptionPane.showMessageDialog(new JFrame(), mensaje, titulo, JOptionPane.WARNING_MESSAGE);
    }

}