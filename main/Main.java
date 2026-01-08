
package main;
import todolist.Operacoes;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operacoes operacoes = new Operacoes();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        System.out.println("Bem-Vindo ao ToDoList, organize suas atividades.");

        do {
            opcao = operacoes.menu();
            switch (opcao){
                case 1:
                    operacoes.addNova();
                    break;
                case 2:
                    operacoes.pesquisarTitulo();
                    break;
                case 3:
                    operacoes.excluirAtiv();
                    break;
                case 4:
                    operacoes.atualizarAtiv();
                    break;
                case 5:
                    operacoes.iniciarAtiv();
                    break;
                case 6:
                    operacoes.finalAtiv();
                    break;
                case 7:
                    operacoes.listarAtuv();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente!");
                    break;
            }
        } while(opcao != 8);

        System.out.println("Atividades organizadas, saindo do ToDoList!");

    }
}
