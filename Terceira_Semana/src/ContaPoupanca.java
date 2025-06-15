public class ContaPoupanca extends Conta implements Saque {
    private double rendimento;
    final private String tipo = "Conta Poupança";
    final private double juros = 0.05;

    public ContaPoupanca(String nome, int cpf, int senha) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSenha(senha);
    }

    private double getRendimento() {
        return rendimento;
    }

    private void setRendimento(double saldo, int dias) {
        rendimento = Math.pow(saldo * (1 + juros), dias);
    }

    private String getTipo() {
        return tipo;
    }

    @Override
    public void saque(double valor, int senha) {
        if(getSenha() == senha) {
            if(getSaldo() >= valor) {
                double novoSaldo = getSaldo() - valor;
                setSaldo(novoSaldo);
                System.out.println("\nSaque realizado! Saldo: " + novoSaldo);
            } else {
                System.out.println("\nSaldo insuficiente!");
            }
        } else {
            System.out.println("\nSenha incorreta. Tente novamente");
        }
    }
}
