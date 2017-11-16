
package maquinas_de_estados.main;

import javax.swing.JOptionPane;

public class Maquinas_de_estados {

    public static void main(String[] args) {
        JFrameHome jFrameHome = new JFrameHome();
        jFrameHome.setVisible(true);
        JOptionPane.showMessageDialog(null, "Inserta una cinta y maquina para comenzar. "
                + "\n Load → Machine \n Load → Tape "
                + "\n-----------------------------------------------"
                + "\n Selecciona la maquina que quieres usar"
                + "\n Machine → (Turing, Mealy o Moore)","Inicio",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
