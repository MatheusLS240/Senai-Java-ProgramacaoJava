import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class App {
    private JPanel main;
    private JPanel titulo;
    private JPanel comandos;
    private JPanel senha;
    private JTextField salario;
    private JRadioButton fgts;
    private JButton calcularBotao;
    private JTextField resultado;
    private JRadioButton inss;
    private JRadioButton vr;
    private JRadioButton vt;
    private JPasswordField passwordField1;

    public App() {
        calcularBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double salarioDig = Double.parseDouble(salario.getText());
                double descCalculado = 0.00;
                char[] senhaDig = passwordField1.getPassword();
                char[] senha = {'S', 'e', 'n', 'a', 'i'};

                if (Arrays.equals(senha, senhaDig)) {
                    if (fgts.isSelected()) {
                        descCalculado = CalculaSalario.calcularFGTS(salarioDig);
                    } else if (inss.isSelected()) {
                        descCalculado = CalculaSalario.calcularINSS(salarioDig);
                    } else if (vt.isSelected()) {
                        descCalculado = CalculaSalario.calcularVT(salarioDig);
                    } else {
                        descCalculado = CalculaSalario.calcularVR(salarioDig);
                    }
                    resultado.setText(String.valueOf(descCalculado));
                } else {
                    resultado.setText("Senha errada!");
                }
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
