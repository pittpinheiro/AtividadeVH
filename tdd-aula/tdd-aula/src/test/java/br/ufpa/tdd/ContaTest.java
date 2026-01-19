package br.ufpa.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void novaContaIniciaComSaldo0() {
        Conta acc = new Conta();
        assertEquals(0, acc.getSaldo());
    }
    @Test
    void novaContaIniciaComExtrato0() {
        Conta acc = new Conta();
        assertEquals(0, acc.getExtrato());
    }
    @Test
    void ContaDeposito() {
        Conta conta1 = new Conta();
        conta1.deposito(10);
        assertEquals(10, conta1.getDeposito());
    }

    @Test
    void ContaCriaDeposito() {
        Conta conta2 = new Conta();
        conta2.deposito(10);
        assertEquals(1, conta2.getDeposito());
    }

    void ContaAlteraSaldo(){
        Conta conta3 = new Conta();
        conta3.deposito(10);
        conta3.saque(2)
        assertEquals(8, conta3.getDeposito());
    }

    void ContaCriaSaldo(){
        Conta conta3 = new Conta();
        conta3.deposito(10);
        conta3.saque(2)
        assertEquals(2, conta3.getDeposito().size());
    }

    void ContaDepoitoErro(){
        conta conta4 = new Conta();
        ...
    }
}