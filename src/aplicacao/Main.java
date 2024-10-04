package aplicacao;

import entidade.Aluno;
import entidade.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja cadastrar um aluno(2) ou uma pessoa(1)? ");
        int escolha = sc.nextInt();

        if (escolha == 1) { //pessoa
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade da pessoa: ");
            int idade = sc.nextInt();
            System.out.println("Dados ---------------------------------------");
            Pessoa pessoa = new Pessoa(nome, idade);
            pessoa.mostrarDados();
        }

        if (escolha == 2) { //aluno
            sc.nextLine();
            System.out.println("Nome do aluno: ");
            String nome = sc.nextLine();
            System.out.println("Idade do aluno: ");
            int idade = sc.nextInt();
            System.out.println("Matrícula: ");
            int matricula = sc.nextInt();
            sc.nextLine();
            System.out.println("Curso: ");
            String curso = sc.nextLine();
            System.out.println("Dados ---------------------------------------");
            Aluno aluno = new Aluno(nome, idade, matricula, curso);
            aluno.mostrarDados();
        }
    }
}
