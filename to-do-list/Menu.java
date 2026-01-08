package todolist;

import java.util.Scanner;

public class menu {
    Scanner sc = new Scanner(System.in);
    int opcao = -1;

    public int menu(){
        System.out.println("");
        System.out.println("        Menu de Opções:        ");
        System.out.println("1) Adicionar Nova Atividade");
        System.out.println("2) Pesquisar Atividade por Título");
        System.out.println("3) Excluir Atividade pelo Título");
        System.out.println("4) Atualizar Atividade pelo Título");
        System.out.println("5) Iniciar Atividade");
        System.out.println("6) Finalizar Atividade");
        System.out.println("7) Listar Atividades (com Submenu)");
        System.out.println("8) Sair do Sistema");
        System.out.println("Escolha uma opção: ");
        opcao = sc.nextInt();
        sc.nextLine();
        return opcao;
    }
}
