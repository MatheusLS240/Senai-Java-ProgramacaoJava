/*
Para ler arquivos, os mesmos já devem exixtir
e devemos importar as bibliotecas abaixo:
 */

import java.io.File;  //Biblioteca geral para arquivos
import java.io.FileNotFoundException;  // Biblioteca para erros de arquivo não encontrado
import java.util.Scanner; // Biblioteca para ler o arquivo

public class LerArquivo {
    public static void main(String[] args) {
        try {
            // Cria as instâncias para a leitura
            File LeArq = new File("C:\\Users\\Administrator\\Downloads\\a.txt"); // Abre o arquivo
            Scanner Leitor = new Scanner(LeArq); // A instancia do arquivo é argumento para Scanner
            // Verifica se há dados no arquivo.
            while (Leitor.hasNextLine()) {
                // Recolhe o dado do arquivo
                String dados = Leitor.nextLine();
                System.out.println(dados);
            }
            Leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }

        System.out.println("Fim do programa.");
    }// Fim main
}// Fim classe
