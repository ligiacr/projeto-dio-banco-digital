package me.dio;

public interface InterfaceConta {

     void sacar(double valor);
     void depositar(double valor);
     void transferir(double valor, Conta contaDestino);
     void estornar(Conta contaDestino, double valor);
     void imprimirExtrato();
}
