import java.util.Random;
import java.util.Scanner;

public class Conta extends Cliente {
    final private String banco = "Banco da Gente";
    final private int agencia = 3497;
    private int numeroConta;
    private double saldo = 0;
    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void deposito(double valorDepositado, int senha) {
        if(this.senha == senha) {
            saldo += valorDepositado;
            System.out.println("\nDeposito concluido! Saldo atual: " + saldo);
        } else {
            System.out.println("\nSenha incorreta. Tente novamente");
        }
    }
}