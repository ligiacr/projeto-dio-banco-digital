package me.dio;

public class Main {
    public static void main(String[] args) {

        Cliente ligia = new Cliente();
        ligia.setNome("Lígia");

        Conta corrente = new ContaCorrente(ligia);
        corrente.depositar(500);

        Conta poupanca = new ContaPoupanca(ligia);
        corrente.transferir(200, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
