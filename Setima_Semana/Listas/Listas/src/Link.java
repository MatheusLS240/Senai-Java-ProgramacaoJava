/*
A classe LinkedList é uma evolução da classe ArrayList, mas seu funcionamento é mais
eficiente.
A classe LinkedList possui os mesmos métodos vistos até aqui pela classe ArrayList

Recomendação: Usar ArrayList para armaenar e acessar dados
              Usar LinkedList para manipular dados.
 */
// Importar o pacote LinkedList

import java.util.LinkedList;


public class Link {
    public static void main(String[] args) {
        // exemplo de uso
        // Instanciar a classe
        LinkedList<String> animais = new LinkedList<>();
        animais.add("Gato");
        animais.add("Zebra");
        animais.add("Cachorro");
        animais.add("Pato");
        System.out.println("A lista digitada foi " + animais);
     }
}// Fim da classe Link
