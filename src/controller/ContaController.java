package controller;

import model.Conta;

public class ContaController {
    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println(conta);
        conta.setSaldo(1000.00);
        System.out.println(conta.getSaldo());
        conta.deposito(300.00);
        System.out.println(conta.getSaldo());
        conta.saca(100.00);
        System.out.println(conta.getSaldo());
        conta.atualiza(1);
        System.out.println(conta.getSaldo());
        conta.saca(100.00);
        System.out.println(conta.getSaldo());
    }
}
