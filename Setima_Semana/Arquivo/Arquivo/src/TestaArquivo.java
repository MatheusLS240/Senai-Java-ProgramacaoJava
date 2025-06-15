/*
Trabalhar com arquivos em java

Usar as bibliotecas java.io.File e
java.io.IOException
 */


import java.io.File;
import java.io.IOException;

public class  TestaArquivo {
    public static void main(String[] args) {
            /*
            Como pode haver problemas externos ao software,
            criaremos um objeto arquivo em um laço try.
            Usamos a classe File e os argumentos são o caminho,
            com \ duplas e o nome do arquivo.
             */

            try {
                File testaArquivo = new File("C:\\Users\\Administrator\\Downloads\\b.txt");
                // O metodo booleano createNewFile() retorna true caso
                // um arquivo tenha sido criado
                if (testaArquivo.createNewFile()) {
                    // Usamos 2 metodos da classe para exemplo
                    // getName() e getAbsolutePath()
                    System.out.println("Nome do Arquivo: " + testaArquivo.getName());
                    System.out.println("Caminho do Arquivo: " + testaArquivo.getAbsolutePath());
                } else {
                    System.out.println("Arquivo ja existente!");
                }
            } catch (IOException e) {
                System.out.println("Ocorreu um erro.");
                e.printStackTrace();
            }

        System.out.println("Fim do programa.");

    }// Fim main
}// Fim da classe



