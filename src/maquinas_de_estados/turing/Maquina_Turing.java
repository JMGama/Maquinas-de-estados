package maquinas_de_estados.turing;

import java.util.Arrays;
import java.util.List;

public class Maquina_Turing {

    public List<String> cinta;
    public String[][] quintuplas;
    public String estadoActual;
    public int posicionCinta;
    public String lectura;
    public String escritura;

    public Maquina_Turing(List<String> quintuplasList, List<String> cintaList) {
        cinta = cintaList;
        quintuplas = generarQuintuplas(quintuplasList);
        estadoActual = "1";// esto va a cambiar una vez definido el estado inicia PREGUNTA AL PROFE!!
        posicionCinta = 0;
    }

    public void lecturaDeCinta() {
        lectura = cinta.get(posicionCinta);
    }

    public void busquedaDeQuintupla() {

    }

    public static String[][] generarQuintuplas(List<String> quintuplasList) {
        String[][] quintuplas = new String[quintuplasList.size()][4];
        for (int i = 0; i < quintuplas.length; i++) {
            quintuplas[i] = quintuplasList.get(i).split(" ");
        }
        quintuplas = sortQuintuplas(quintuplas);
  
        /*for (int i = 0; i < quintuplas.length; i++) {
            for (int j = 0; j < quintuplas[i].length; j++) {
                System.out.print(quintuplas[i][j]);
            }
            System.out.println("");
        }*/
        return quintuplas;
    }
    
    public static String[][] sortQuintuplas(String[][] quintuplas){
        for (int i = 0; i < quintuplas.length; i++) {
            int burbuja = Integer.parseInt(quintuplas[i][0]); 
            for (int j = i+1; j < quintuplas.length; j++) {
                int comparador = Integer.parseInt(quintuplas[j][0]); 
                if (comparador < burbuja) {
                    String[] cambio = quintuplas[i];
                    quintuplas[i] = quintuplas[j];
                    quintuplas[j] = cambio;
                }
            }
        }
        return quintuplas;
    }
}
