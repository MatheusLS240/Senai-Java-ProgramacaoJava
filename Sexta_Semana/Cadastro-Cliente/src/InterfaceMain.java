import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceMain {
    private JPanel inicio;
    private JPanel titulo;
    private JPanel funcoes;
    private JButton cadastrarCliente;''
    private JButton atualizarInformacoes;
    private JButton listarInformacoes;

    public InterfaceMain() {
        cadastrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastroCliente telaCadastro = new cadastroCliente();
                inicio.setVisible(false)

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("InterfaceMain");
        frame.setContentPane(new InterfaceMain().inicio);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
