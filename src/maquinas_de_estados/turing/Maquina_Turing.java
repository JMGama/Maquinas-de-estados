package maquinas_de_estados.turing;

import java.util.ArrayList;
import java.util.List;

public class Maquina_Turing {

    private List<String> cinta;
    private String[][] quintuplas;
    private String estadoActual;
    private int posicionCinta;
    private String lectura;

    public Maquina_Turing(List<String> quintuplasList, List<String> cintaList) {
        cinta = new ArrayList(cintaList);
        quintuplas = generarQuintuplas(quintuplasList);
        estadoActual = "1";// esto va a cambiar una vez definido el estado inicia PREGUNTA AL PROFE!!
        posicionCinta = 0;
    }

    public List<String> analizar() {
        lecturaDeCinta();
        analizarPosicion();
        imprimirCinta();
        return cinta;
    }

    private void imprimirCinta() {
        cinta.forEach(System.out::println);
    }

    private void lecturaDeCinta() {
        lectura = cinta.get(posicionCinta);
    }

    private void analizarPosicion() {
        for (String[] quintupla : quintuplas) {
            if (quintupla[0].equals(estadoActual) && quintupla[1].equals(lectura)) {
                cinta.set(posicionCinta, quintupla[2]);
                switch (quintupla[4]) {
                    case "R":
                        posicionCinta++;
                        break;
                    case "L":
                        posicionCinta--;
                        break;
                }
                estadoActual = quintupla[3];
                break;
            }
        }
    }

    private static String[][] generarQuintuplas(List<String> quintuplasList) {
        String[][] quintuplas = new String[quintuplasList.size()][4];
        for (int i = 0; i < quintuplas.length; i++) {
            quintuplas[i] = quintuplasList.get(i).split(" ");
        }
        quintuplas = sortQuintuplas(quintuplas);
        return quintuplas;
    }

    private static String[][] sortQuintuplas(String[][] quintuplas) {
        for (int i = 0; i < quintuplas.length; i++) {
            int burbuja = Integer.parseInt(quintuplas[i][0]);
            for (int j = i + 1; j < quintuplas.length; j++) {
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
