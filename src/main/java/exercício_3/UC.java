package exercício_3;

import java.util.ArrayList;

public class UC {
    private String nomeUC;
    private ArrayList<Nota> notas;
    private int totalAlunos;

    public UC(String nomeUC, ArrayList<Nota> notas, int totalAlunos) {
        this.nomeUC = nomeUC;
        this.notas = notas;
        this.totalAlunos = totalAlunos;
    }

    public String getNomeUC() {
        return nomeUC;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public int getTotalAlunos() {
        return totalAlunos;
    }
}
