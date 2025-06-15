import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Janela3 {
    public static void main(String[] args) {
        JFrame janelaPrincipal = new JFrame("Hora atualizada!");
        janelaPrincipal.setSize(300, 100);
        janelaPrincipal.setLayout(new BorderLayout());
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DateTimeFormatter formataHorario = DateTimeFormatter.ofPattern("E - dd/MM/yyyy - HH:mm:ss", Locale.forLanguageTag("pt-BR"));

        JLabel labelHorario = new JLabel();
        labelHorario.setHorizontalAlignment(SwingConstants.CENTER);
        labelHorario.setVerticalAlignment(SwingConstants.CENTER);
        janelaPrincipal.getContentPane().add(labelHorario);

        Timer timer = new Timer(1000, e -> {
            LocalDateTime horarioAtual = LocalDateTime.now();
            String texto = formataHorario.format(horarioAtual);
            labelHorario.setText(texto);
        });

        timer.start();

        janelaPrincipal.setVisible(true);
    }
}
