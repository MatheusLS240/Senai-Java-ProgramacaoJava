/*
Para gravar dados no arquivo, na forma de strings,
usamos as bibliotecas:
java.io.FileWriter
java.io.IOException

 */
import java.io.FileWriter;
import java.io.IOException;

public class GravaArquivo {

    public static void main(String[] args) {
        try {
            FileWriter escreveArc = new FileWriter("C:\\Users\\Administrator\\Downloads\\a.txt");
            escreveArc.write("Texto de teste de gravação no arquivo.txt ");
            escreveArc.close(); // usado para fechar o arquivo.
            System.out.println("Arquivo recebeu texto!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }


    } // Fim main
}// Fim classe

