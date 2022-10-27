package control;

import model.Pessoa;

public class PessoaControler extends Object{
    public static void main(String[] args) {
//sout
        //cria uma instancia da classegit
        Pessoa pessoa1 = new Pessoa(1L,"azul", 1.75);
        Pessoa pessoa2 = new Pessoa(1L,"azul", 1.75);
        pessoa2 = pessoa1;
        System.out.println(pessoa1.equals(pessoa2));
        System.out.println(pessoa1.hashCode());
        System.out.println(pessoa2.hashCode());
    }

    /*private static void imprimir(Pessoa pessoa ){
        System.out.println(pessoa);
    }*/



}

