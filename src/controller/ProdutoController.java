package controller;

import model.Produto;

public class ProdutoController {
    public static void main(String[] args) {
        Produto produto = new Produto();
        System.out.println(produto);
        produto.setNome("Gol");
        System.out.println(produto.getNome());
        produto.setDescricao("Carro");
        System.out.println(produto.getDescricao());
        produto.setEstoque(10);
        System.out.println(produto.getEstoque());
        produto.setValor(22999.99);
        System.out.println(produto.getValor());


    }
}