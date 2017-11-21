package maquinas_de_estados.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ManejoDeArchivos {

    public File seleccionArchivo() {
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
        fc.setFileFilter(filtro);
        int seleccion = fc.showOpenDialog(fc);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            return fc.getSelectedFile();
        }
        return null;
    }

    public List<String> obtenerCinta(File archivo) {
        List<String> cinta = new ArrayList<>();
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader bf = new BufferedReader(fr);
            String linea;
            while ((linea = bf.readLine()) != null) {
                cinta.add(linea);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer cinta: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return cinta;
    }

    public List<String> obtenerMaquina(File archivo) {
        List<String> maquina = new ArrayList<>();
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader bf = new BufferedReader(fr);
            String linea;
            while ((linea = bf.readLine()) != null) {
                maquina.add(linea);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer maquina: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return maquina;
    }
}
