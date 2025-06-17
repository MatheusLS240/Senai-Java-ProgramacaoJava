import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Janela4 {
    public static void main(String[] args) {
        JFrame janelaPrincipal = new JFrame("Editor de Arquivo");
        janelaPrincipal.setSize(500, 200);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setLayout(new FlowLayout());

        JLabel labelBuscar = new JLabel("Buscar:");
        JTextField buscarCampo = new JTextField(15);

        JLabel labelSubstituir = new JLabel("Substituir por:");
        JTextField substituirCampo = new JTextField(15);

        JLabel fileLabel = new JLabel("Nenhum arquivo selecionado");

        JButton uploadButton = new JButton("Selecionar Arquivo");

        uploadButton.addActionListener((ActionEvent e) -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(janelaPrincipal);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectFile = fileChooser.getSelectedFile();
                fileLabel.setText("Arquivo: " + selectFile.getName());

                String buscar = buscarCampo.getText();
                String substituir = substituirCampo.getText();

                if (buscar.isEmpty() || substituir.isEmpty()) {
                    JOptionPane.showMessageDialog(janelaPrincipal, "Preencha os dois campos de texto.");
                    return;
                }

                try {
                    Scanner sc = new Scanner(selectFile);
                    StringBuilder conteudo = new StringBuilder();

                    while (sc.hasNextLine()) {
                        String linha = sc.nextLine();
                        String linhaModificada = linha.replace(buscar, substituir);
                        conteudo.append(linhaModificada).append(System.lineSeparator());
                    }
                    sc.close();

                    FileWriter writer = new FileWriter(selectFile);
                    writer.write(conteudo.toString());
                    writer.close();

                    JOptionPane.showMessageDialog(janelaPrincipal, "Arquivo atualizado com sucesso!");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(janelaPrincipal, "Erro: " + ex.getMessage());
                }
            } else {
                fileLabel.setText("Nenhum arquivo selecionado");
            }
        });

        janelaPrincipal.add(labelBuscar);
        janelaPrincipal.add(buscarCampo);

        janelaPrincipal.add(labelSubstituir);
        janelaPrincipal.add(substituirCampo);

        janelaPrincipal.add(uploadButton);
        janelaPrincipal.add(fileLabel);

        janelaPrincipal.setVisible(true);
    }
}
