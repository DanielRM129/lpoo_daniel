package controller;

import model.Funcionario;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        System.out.println(funcionario);
        funcionario.setNome("Daniel");
        System.out.println(funcionario.getNome());
        funcionario.setSalario(1000.00);
        System.out.println(funcionario.getSalario());
    }
}
