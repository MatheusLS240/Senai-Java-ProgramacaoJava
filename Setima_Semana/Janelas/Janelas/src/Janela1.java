/*
Código para montar janelas sem o uso da ferramenta
swing UI,
Também vamos verificar como codificar mais de uma janela.
 */
// Imporatar as bibliotecas necessarias
import javax.swing.*; // Importa o pacote swing
//Importa os pacotes awt w awt.event
import java.awt.*;
import java.awt.event.*;

public class Janela1 {
    // Iniciar metodo main
    public static void main(String[] args) {
        // Criar a janela Principal
        // Instanciar um JFrame
        JFrame janelaPrincipal = new JFrame("Main Window");
        // Definir que o programa termina quando a janela for fechada
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Definir o tamanho da janela
        janelaPrincipal.setSize(300,200);

        // Criar um botão para abrir uma nova janela
        // Instanciar um botão (Classe JButton)
        // O texto no argumento é o texto do botão
        JButton botaoNewWin = new JButton("Abrir new Win");
        // Incluir funcionalidade para o botão
        // incluir o parametro new ActionListner e usar um Tab
        // para autocompletar a extrutura.
        botaoNewWin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Criar a nova janela
                // Instanciar nova Janela
                JFrame newWin = new JFrame("new Window");
                // Configurar para a janela fechar- SEM TERMINAR O PROGRAMA
                newWin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                // Configurar o tamanho da janela
                newWin.setSize(200, 150);

                // Adicionar um label na janela
                // Instanciar um JLabel
                JLabel etiqueta = new JLabel ("Abriu uma nova Janela");
                // Alinhando no centro da janela
                etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
                // Incluir a etiqueta na janela new Win
                newWin.getContentPane().add(etiqueta);
                // Configurar a janela como visivel

                newWin.setVisible(true);
            }
        });

        // Adicionar o botão botaoNovaJanela na janela Principal centralizado
        janelaPrincipal.getContentPane().add(botaoNewWin, BorderLayout.CENTER);

        // Tornar a janela principal visivel
        janelaPrincipal.setVisible(true);


    }// Fim do metodo main
} // Fim da classe Janelas
