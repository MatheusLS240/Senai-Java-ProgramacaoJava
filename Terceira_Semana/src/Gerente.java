public class Gerente {
    private String nome;
    private int senha;

    public Gerente(String nome, int senha) {
        this.senha = senha;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }


}
