package control;

import model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaControler extends Object{
    public static void main(String[] args) {
//sout
        //cria uma instancia da classegit
        Pessoa pessoa1 = new Pessoa(1L,"azul", 1.75);
        Pessoa pessoa2 = new Pessoa(2L,"castanho", 1.85);
        Pessoa pessoa3 = new Pessoa(3L,"azul", 1.75);
        //pessoa2 = pessoa1;
        System.out.println(pessoa1.equals(pessoa3));
        System.out.println(pessoa1.hashCode());
        System.out.println(pessoa2.hashCode());

        List<Pessoa>  pessoas = new ArrayList<>();

        //Popular a coleçao
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        System.out.println(pessoas);
        System.out.println(pessoas.contains(pessoa3));
    }

    /*private static void imprimir(Pessoa pessoa ){
        System.out.println(pessoa);
    }*/



}

