package exercício_3;

import java.util.ArrayList;

public class GereUC {

    ArrayList<Nota> notas = new ArrayList<>();

    public int getAllNotas(){
        return notas.size();
    }
    public boolean insereNotaUc(int numAluno, double nota){
        Nota notaUc = new Nota(numAluno, nota);
        if (nota > 0 && nota <=20){
            notas.add(notaUc);
            return true;
        }
            return false;
    }

    public double pesquisaAluno(int numAluno){
        for (Nota nota : notas) {
            if (nota.getNumAluno() == numAluno) {
                return (nota.getNota());
            }
        }
        return -1;
    }

    public double media() {
        double sum = 0;
        for (Nota nota : notas) {
            sum = sum + nota.getNota();
        }
        if (sum != 0) {
            return (sum / notas.size());
        }
        return -1;
    }

    public boolean aprovado(int numAluno) {
        for (Nota nota : notas) {
            if (nota.getNumAluno() == numAluno) {
                return nota.getNota() >= 9.5;
            }
        }
        return false;
    }


}
