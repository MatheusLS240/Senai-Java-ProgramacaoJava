public class ContaCorrente extends Conta implements Saque {
    private double limite = 0;
    final private String tipo = "Conta Corrente";

    public ContaCorrente(String nome, int cpf, int senha) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSenha(senha);
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void saque(double valor, int senha) {
        if(getSenha() == senha) {
            double disponivel = getSaldo() + this.limite;
            if(disponivel >= valor) {
                double novoSaldo = getSaldo() - valor;
                setSaldo(novoSaldo);
                System.out.println("\nSaque realizado! Saldo atual: " + novoSaldo);
            } else {
                System.out.println("\nSaldo insuficiente! Acima do limite: " + this.limite);
            }
        } else {
            System.out.println("\nSenha incorreta. Tente Novamente");
        }
    }
}
