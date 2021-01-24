import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalAlunos = 0;

    public void adiciona(Aluno aluno) {
        this.alunos[totalAlunos] = aluno;
        totalAlunos++;
    }

    public void adiciona2(int pos, Aluno aluno) {
        if(!posicaoValida(pos))
            throw new IllegalArgumentException("Posicao invalida");
        for(int i = totalAlunos - 1; i >= pos; i-=1) {
            alunos[i+1] = alunos[i];
        }
        alunos[pos] = aluno;
        totalAlunos++;
    }

    private boolean posicaoValida(int pos) {
        return pos >= 0 && pos <= totalAlunos;
    }

    public Aluno pega(int posicao) {
        if(!posicaoOcupada(posicao))
            throw new IllegalArgumentException("Posição inválida");
       return alunos[posicao];
    }

    public void remove(int posicao) {
        //remove pela posição
    }

    public boolean contem(Aluno aluno) {
        //descobre se o aluno está ou não na lista
        for(int i=0; i<totalAlunos; i++) {
            if(aluno.equals(alunos[i]))
                return true;
        }
        return false;
    }

    public int tamanho() {
        //devolve a quantidade de alunos
        return totalAlunos;
    }

    public String toString() {
        //facilitará na impressão
        return Arrays.toString(alunos);
    }

    private boolean posicaoOcupada(int pos){
        return pos >= 0 && pos < totalAlunos;
    }
}