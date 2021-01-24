package listaligada;

public class TestaListaLigada {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("Mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("Paulo");
        System.out.println(lista);
        lista.adicionaNoComeco("Guilherme");
        System.out.println(lista);
        lista.adicionaNoFim("José");
        System.out.println(lista);
        lista.adicionaNoMeio(3, "Nathália");
        System.out.println(lista);
        System.out.println("Nome: "+lista.pega(2));
        System.out.println("Tamanho da lista: "+lista.tamanho());
        lista.removeDoComeco();
        System.out.println(lista);
        System.out.println("Tamanho da lista: "+lista.tamanho());
        lista.removeDoFim();
        System.out.println(lista);
        System.out.println("Tamanho da lista: "+lista.tamanho());
        lista.adicionaNoFim("João");
        lista.adicionaNoFim("Roberto");
        System.out.println(lista);
        lista.removePorPoisicao(2);
        System.out.println(lista);
        System.out.println(lista.contem("Guilherme"));
        System.out.println(lista.contem("Roberto"));
    }
}
