/*
Para ler um arquivo com várias strings (linhas) e poder
alterar, remover ou modificar essas informações,
usamos a classe BufferedReader. Essa classe lê o arquivo linha
por linha e guarda num buffer
Estes dados podem ser passados para um ArrayList ou um StringBuilder para
facilitar o trabalho.
Para remover uma string, usamos o metodo replace()
Para gravar o  arquivo modificado usar a classe BufferedWriter
para gravar as linhas modificadas de volta para o arquivo
 */
// Impotar ppacote java.io.*
/*
OBSERVAÇÂO: Antes de rodar este programa,
incluir uma linha com o texot Escola Senai
no arquivo c:\java\arquivo.txt
 */

import java.io.*;


public class TrabalhandoArquivos {
    public static void main(String[] args) {
        // Criar uma String com o patH + nome do arquivo
        String nomeArq = "C:\\Users\\Administrator\\Downloads\\a.txt";

        try{
            //Ler arquivovusando a classe BufferedReader
            BufferedReader lerArq = new BufferedReader(new FileReader(nomeArq));
            // Criar instancia do buffer
            StringBuilder arqModificado = new StringBuilder();
            String linha; // Esta Strig recebe cada linha do arquivo

            while ((linha = lerArq.readLine())!= null) {
                // Codigo a ser efetuado com as mudanças no arquivo
                // Exemplo: Remover Escola Senai, usando metodo .replace()
                // .replace("String a ser trocada", "String substituta")
                linha = linha.replace("Escola Senai","");
                // Para salvar a linha modificada, usamos o metodo
                //.append(String a ser incluida)
                //.ppend("\n") é o comando enter
                arqModificado.append(linha).append("\n");
            } // Fim do while

            lerArq.close(); // Fecha a leitura do arquivo
            // Gravar o arquivo modificado
            // Instanciar a classe BufferedWriter
            BufferedWriter gravar = new BufferedWriter(new FileWriter(nomeArq));
            // Usar o metodo write (instancia do arquivo a gravar), mas
            // mas deve ser convertido numa String - .toString()
            gravar.write(arqModificado.toString());
            gravar.close(); // Fechar o arquivo
            // Mensagem de operação realizada
            System.out.println("Arquivo Modificado");

        /*
        As linhas catch - throw foram incluidas automaticamente pelo
        IDE IntelliJ Incluidos manualmente os prints e comentadas
        as linhas com throw
         */
        } catch (FileNotFoundException e) {
           // throw new RuntimeException(e);
            System.out.println("Ocorreu um erro. Arquivo não encontrado");
            e.printStackTrace();
        } catch (IOException e) {
           // throw new RuntimeException(e);
            System.out.println("Ocorreu um erro de IO.");
            e.printStackTrace();
        }
    } // Fim do main
} // Fim da Classe Trabalhando com arquivos
