package me.dio;

public class Main {
    public static void main(String[] args) {

        Cliente ligia = new Cliente();
        ligia.setNome("Lígia");
        ligia.setCpf("000.000.000-00");

        Conta corrente = new ContaCorrente(ligia);
        corrente.depositar(500); //depósito na conta corrente

        Conta poupanca = new ContaPoupanca(ligia);
        corrente.transferir(200, poupanca); //transferência para a conta poupança

        corrente.estornar(poupanca, 200); //estorno do valor transferido

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
