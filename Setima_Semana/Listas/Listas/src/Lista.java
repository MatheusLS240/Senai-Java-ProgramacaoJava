/*
Para criar listas com funcionalidades melhores do que o array,
temos a biblioteca ArrayList, que permite inclusão de novos itens,
modificação e outras funcionalidades.
 */

// para iniciar importamos o pacote java.util.ArrayList
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

    // Para instanciar um ArrayList, incluimos o tipo de variavel, ou objeto
    // num "diamante" <>
    // Instanciando um ArreyList nomeAluno
    ArrayList<String> nomeAluno = new ArrayList<>();

    // Para incluir informações, usamos o metodo .add()
    nomeAluno.add("Fulano de Tal");
    nomeAluno.add("Beltrano Soares");
    nomeAluno.add("Maria Silvestre");
    System.out.println(nomeAluno); // Imprime todos o conteudo da Lista

    // Metodo .get(int indice) tras um item específico conforme o indice
    // Obs.: O primeiro indice é 0
    String umNome = nomeAluno.get(1);
    System.out.println(umNome);
    // .getFirst() retorna o primeiro item da lista
    umNome =  nomeAluno.getFirst();
    System.out.println("O Prieiro da Lista é: " + umNome);
    // .getLast() retorna o último elemento da lista
    umNome = nomeAluno.getLast();
    System.out.println("O ultimo nome da lista é: " + umNome);

    // O metodo for-each varre um array e um arrayList
    // Sintaxe for (tipo variavel noeme variavel : nome arrayList) { bloco de codigo }
    // o codigo abaixo imprime um nome da lista por linha
    for (String nome : nomeAluno) {
         System.out.println(nome);
     }


    // O metodo .getClaas retorna a classe que foi instanciada
    String nomeClasse = String.valueOf(nomeAluno.getClass());
    System.out.println("A classe original instanciada foi:" + nomeClasse);

    // O Metdo .set(int indice, valor a ser alterado) altera um item
    nomeAluno.set(1, "Henrique de Oliveira");
    System.out.print("Alterado o item 1: ");
    System.out.println(nomeAluno);

     // O metodo .remove(int indice) remove um item da lista
     nomeAluno.remove(2); // removeu o 3º item
     System.out.println("Remvendo o item 3 a lista fica:  " + nomeAluno);

     // O metdo .size() retorna quantos elementos tem a lista
     int qtd = nomeAluno.size();
     System.out.println(" A lista tem " + qtd + " elementos" );

     // O metodo .clear() limpa toda a lista
     nomeAluno.clear();
        System.out.println("A lista depois do .clear() contem: " + nomeAluno);


} // Fim do main
} // Fim da classe Lista
