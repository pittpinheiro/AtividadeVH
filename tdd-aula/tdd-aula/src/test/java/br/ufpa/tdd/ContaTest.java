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
        Conta conta4 = new Conta();
        conta4.deposito(0);
        assertThrows(IllegalArgumentException.class, () -> conta4.deposito(0));
    }
    void ContaSaque0QueSaldo(){
        Conta conta5 = new Conta();
        conta5.saque(0);
        assertThrows(IllegalArgumentException.class, () -> conta5.saque(0));
    }
    void ContaSaqueMenor0QueSaldo(){
        Conta conta6 = new Conta();
        conta6.saque(-1);
        assertThrows(IllegalArgumentException.class, () -> conta6.saque(-1));
    }
    void ContaSaqueMaiorQueSaldo(){
        Conta conta7 = new Conta();
        conta7.deposito(10);
        conta7.saque(11);
        assertEquals(10, conta7.getSaldo());
    }
}