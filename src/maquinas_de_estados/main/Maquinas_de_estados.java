
package maquinas_de_estados.main;

import javax.swing.JOptionPane;

public class Maquinas_de_estados {

    public static void main(String[] args) {
        JFrameHome jFrameHome = new JFrameHome();
        jFrameHome.setVisible(true);
        ventana_inicial();
    }
    
    public static void ventana_inicial(){
        JOptionPane.showMessageDialog(null, "Inserta una maquina y una cinta para comenzar. "
                + "\n Load → Machine "
                + "\n Load → Tape "
                + "\n-----------------------------------------------"
                + "\nSelecciona la maquina que deseas utilizar"
                + "\n Machine → (Turing, Mealy o Moore)","Inicio",JOptionPane.INFORMATION_MESSAGE);
    }
}
