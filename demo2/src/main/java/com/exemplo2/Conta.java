package com.exemplo2;

public class Conta {
    private String numeroConta;
    private int saldo;

    public Conta (String numerConta, int saldo){
        this.numeroConta = numerConta;
        this.saldo = saldo;
    }
    public String getNumeroConta(){
        return numeroConta;
    }

    public int getSaldo(){
        return saldo;
    }

    public void lancaCredito(int valor){
        saldo += valor;
    }
    public void lancaDebito(int valor){
        saldo -= valor;
    }
}
