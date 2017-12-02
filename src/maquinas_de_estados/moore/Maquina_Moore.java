package maquinas_de_estados.moore;

import java.util.ArrayList;
import java.util.List;

public class Maquina_Moore {

    private List<String> cinta;
    private List<String> cintaResultante = new ArrayList<>();
    private String[][] tuplas;
    private String estadoActual;
    private int posicionCinta;
    private String lectura;

    public Maquina_Moore(List<String> tuplasList, List<String> cintaList) {
        cinta = new ArrayList(cintaList);
        tuplas = generartuplas(tuplasList);
        estadoActual = "1";
        posicionCinta = 0;
    }

    public List<String> primer_movimiento() {
        for (String[] tupla : tuplas) {
            if (tupla[0].equals(estadoActual)) {
                cintaResultante.add(tupla[2]);
                break;
            }
        }
        return cintaResultante;
    }

    public List<String> analizar() {
        if (posicionCinta <= cinta.size() - 1) {
            lecturaDeCinta();
            analizarPosicion();
        }
        return cintaResultante;
    }

    private void lecturaDeCinta() {
        lectura = cinta.get(posicionCinta);
    }

    private void analizarPosicion() {
        for (String[] tupla : tuplas) {
            if (tupla[0].equals(estadoActual) && tupla[1].equals(lectura)) {
                cintaResultante.add(tupla[4]);
                posicionCinta++;
                estadoActual = tupla[3];
                break;
            }
        }
    }

    private static String[][] generartuplas(List<String> tuplasList) {
        String[][] tuplas = new String[tuplasList.size()][4];
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
