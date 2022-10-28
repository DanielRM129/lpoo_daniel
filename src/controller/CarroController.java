package controller;

import model.Carro;

public class CarroController {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro);
        carro.setAnoFabricacao(2020);
        System.out.println(carro.getAnoFabricacao());
        carro.setMarca("Volkswagen");
        System.out.println(carro.getMarca());
        carro.setModelo("jdk");
        System.out.println(carro.getModelo());
    }
}
