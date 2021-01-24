import java.util.Objects;

public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object arg0) {
        Aluno outro = (Aluno) arg0;
        return outro.getNome().equals(this.nome);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
