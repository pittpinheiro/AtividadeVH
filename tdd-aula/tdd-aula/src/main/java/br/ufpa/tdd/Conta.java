package br.ufpa.tdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conta {
    private float saldo;
    private float[] extrato;
    private int deposito;

    public Conta(saldo) {
        saldo = 0;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ArrayList<String> getExtrato() {
        return extrato;
    }

    public void deposito(int quantidade){
        saldo+=quantidade;
        String saida = "DEPOSITO DE ";
        saida += Integer.toString(quantidade);
        SaidaExtrato(saida);
    }
    public void SaidaExtrato(){
        extrato.add(saida)
    }
    public void saldo(int quantidade){
        if(quantidade <= 0){
            throw new IllegalArgumentException("Saldo nao pode ser menor que zero")
        }
        else {
            saldo+=quantidade;
            String saida = "DEPOSITO DE ";
            saida += Integer.toString(quantidade);
            SaidaExtrato(saida);
        }
    }

}
