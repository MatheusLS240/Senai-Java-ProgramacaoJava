import java.io.Serializable;

public class Pessoa implements Serializable {
    private String nome;
    private double pc;   // peso corporal
    private double alt;  // altura em metros
    private String genero; // Sexo da pessoa (usando String para maior flexibilidade)
    private double cintura; // Comprimento da cintura

    // Construtor com gênero como String
    public Pessoa(String nome, double pc, double alt, String genero, double cintura) {
        this.nome = nome;
        this.pc = pc;
        this.alt = alt;
        this.genero = genero;
        this.cintura = cintura;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPC() {
        return pc;
    }

    public void setPC(double pc) {
        this.pc = pc;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getCintura() {
        return cintura;
    }

    public void setCintura(double cintura) {
        this.cintura = cintura;
    }

    // Método para calcular o IMC
    public double IMC() {
        return (getPC() / (getAlt() * getAlt()));
    }

    // Método para interpretar o IMC
    public String interpretaIMC() {
        double vlrIMC = IMC();
        if (vlrIMC < 18.5)
            return "Baixo peso";
        else if (vlrIMC < 25.0)
            return "Peso adequado";
        else if (vlrIMC < 30.0)
            return "Sobrepeso";
        else
            return "Obesidade";
    }

    // Método para interpretar a cintura
    public String interpretacaoCintura() {
        // Verificar risco de gordura abdominal baseado no gênero e cintura
        if (genero.equals("M") && cintura >= 94) {
            return "Risco de gordura abdominal (Masculino)";
        } else if (genero.equals("F") && cintura >= 80) {
            return "Risco de gordura abdominal (Feminino)";
        } else {
            return "Abdômen normal";
        }
    }
}

