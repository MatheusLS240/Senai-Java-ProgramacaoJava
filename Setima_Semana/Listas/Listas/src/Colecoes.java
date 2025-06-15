/*
A classe Colections possui metodos para trabalhar com o ArrayList
 */
// Importar as classes ArrayList e Colections

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Colecoes {
    public static void main(String[] args) {
        // Criar um ArrayList
        ArrayList<String> animais = new ArrayList<>();
        animais.add("Gato");
        animais.add("Zebra");
        animais.add("Cachorro");
        animais.add("Pato");
        // Imprimir o aray
        System.out.println("Lista na ordem de inclusão: " + animais);

        // colocar em ordem alfabetica metodo Collections.sort(nome array)
        Collections.sort(animais);
        System.out.println("Em ordem alfabetica: " + animais);

    }// Fim do main

}// |Fim da classe Colecoes
