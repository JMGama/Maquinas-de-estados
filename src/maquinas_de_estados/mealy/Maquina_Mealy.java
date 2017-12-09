package maquinas_de_estados.mealy;

import java.util.ArrayList;
import java.util.List;

public class Maquina_Mealy {

    private List<String> cinta;
    private String[][] tuplas;
    private String estadoActual;
    private int posicionCinta;
    private String lectura;

    public Maquina_Mealy(List<String> tuplasList, List<String> cintaList) {
        cinta = new ArrayList(cintaList);
        tuplas = generartuplas(tuplasList);
        estadoActual = "1";
        posicionCinta = 0;
    }

    private void lecturaDeCinta() {
        lectura = cinta.get(posicionCinta);
    }

    public List<String> analizar() {
        if (posicionCinta <= cinta.size() - 1) {
            lecturaDeCinta();
            analizarPosicion();
        }
        return cinta;
    }

    private void analizarPosicion() {
        for (String[] tupla : tuplas) {
            if (tupla[0].equals(estadoActual) && tupla[1].equals(lectura)) {
                cinta.set(posicionCinta, tupla[2]);
                estadoActual = tupla[3];
                posicionCinta++;
                break;
            }
        }
    }

    private static String[][] generartuplas(List<String> tuplasList) {
        String[][] tuplas = new String[tuplasList.size()][3];
        for (int i = 0; i < tuplas.length; i++) {
            tuplas[i] = tuplasList.get(i).split(" ");
        }
        tuplas = sorttuplas(tuplas);
        return tuplas;
    }

    private static String[][] sorttuplas(String[][] tuplas) {
        for (int i = 0; i < tuplas.length; i++) {
            int burbuja = Integer.parseInt(tuplas[i][0]);
            for (int j = i + 1; j < tuplas.length; j++) {
                int comparador = Integer.parseInt(tuplas[j][0]);
                if (comparador < burbuja) {
                    String[] cambio = tuplas[i];
                    tuplas[i] = tuplas[j];
                    tuplas[j] = cambio;
                }
            }
        }
        return tuplas;
    }
}
