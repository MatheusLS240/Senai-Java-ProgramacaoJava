import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel main;
    private JPanel titulo;
    private JPanel converte;
    private JLabel converter;
    private JTextField inserirValor;
    private JComboBox escolherMedida;
    private JButton enviar;
    private JTextField printResultado;
    private JLabel polegadas;
    private JLabel unidadeSelecionada;

    public App() {
        escolherMedida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unidadeSelecionada.setText((String) escolherMedida.getSelectedItem());
            }
        });
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double[] multiplicador = {0.0254, 2.54, 25.4};
                int indice = escolherMedida.getSelectedIndex();

                double valorInserido = Double.parseDouble(inserirValor.getText());
                double res = valorInserido * multiplicador[indice];

                printResultado.setText(String.valueOf(res));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
