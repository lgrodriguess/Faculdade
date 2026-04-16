package com.github.lgrodriguess.ex09;

public class Main {
    public static void main(String[] args) {
        Departamento ti = new Departamento("Tecnologia da Informação");
        Gerente gerenteTI = new Gerente("João", 1230, 7000.0, "Tecnologia da Informação");
        ti.setGerente(gerenteTI);

        Funcionario funcionario1 = new Funcionario("Mariana", 1231, 4500.0);
        Funcionario funcionario2 = new Funcionario("Lucas", 1232, 4200.0);
        ti.adicionarFuncionario(funcionario1);
        ti.adicionarFuncionario(funcionario2);

        System.out.println("Gerente do Departamento de TI: " + ti.getGerente().getNome());
        System.out.println("Funcionários no Departamento de TI:");
        for (Funcionario funcionario : ti.getFuncionarioList()) { 
            System.out.println(funcionario.getNome() + " - ID: " + funcionario.getId());
        }

        ti.removerFuncionario(funcionario1);
        System.out.println("Após a remoção, funcionários no Departamento de TI:");
        for (Funcionario funcionario : ti.getFuncionarioList()) {  // ← corrigido
            System.out.println(funcionario.getNome() + " - ID: " + funcionario.getId());
        }
    }
}
