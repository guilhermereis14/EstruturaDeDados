public class VetorTeste {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("José");
        Aluno a3 = new Aluno("Guilherme");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona2(200, a3);
        System.out.println(lista);


    }
}
