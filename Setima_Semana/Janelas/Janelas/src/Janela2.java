import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Janela2 extends JFrame{
    public static void main(String[] args) {
        int[] i = {1};

        JFrame janelaInicial = new JFrame("Teste");
        janelaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaInicial.setSize(200, 200);
        janelaInicial.setLayout(new FlowLayout());
        janelaInicial.setVisible(true);

        JButton botao = new JButton("Abrir nova Janela");
        janelaInicial.getContentPane().add(botao);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame janelaSecundaria = new JFrame("Janela");
                janelaSecundaria.setSize(200, 100);
                janelaSecundaria.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

                JLabel titulo = new JLabel("Janela Aberta (" + i[0] + ")");
                titulo.setHorizontalAlignment(SwingConstants.CENTER);
                titulo.setVerticalAlignment(SwingConstants.CENTER);
                janelaSecundaria.getContentPane().add(titulo, BorderLayout.CENTER);
                janelaSecundaria.setVisible(true);

                i[0]++;

                janelaSecundaria.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        i[0] = 1;
                    }
                });
            }
        });
    }
}
