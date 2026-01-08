package todolist;

import java.util.HashMap;
import java.util.Scanner;

public class listarAtiv {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> atividades;
    HashMap<String, String> atividadesPendentes;
    HashMap<String, String> atividadesAndamento;
    HashMap<String, String> atividadesConcluidas;

public void listarAtiv(){
        int subMenu = -1;
        while (subMenu != 5) {
                System.out.println("\nMenu de Listagem: ");
                System.out.println("1) Listar todas as atividades");
                System.out.println("2) Listar todas as atividades pendentes");
                System.out.println("3) Listar todas as atividades em andamento");
                System.out.println("4) Listar todas as atividades concluídas");
                System.out.println("5) Voltar ao menu principal");
                System.out.print("Escolha uma opção: ");
                subMenu = sc.nextInt();
                sc.nextLine();
                switch (subMenu) {
                        case 1:
                                if (atividades.isEmpty()) {
                                        System.out.println("Nenhuma atividade cadastrada.");
                                } else {
                                        int i = 1;
                                        for (String tituloList : atividades.keySet()) {
                                                String desc = atividades.get(tituloList);
                                                String stat = "Desconhecido";
                                                if (atividadesPendentes.containsKey(tituloList)) {
                                                        stat = "Pendente";
                                                } else if (atividadesAndamento.containsKey(tituloList)) {
                                                        stat = "Em andamento";
                                                } else if (atividadesConcluidas.containsKey(tituloList)) {
                                                        stat = "Concluída";
                                                }
                                                System.out.println(i++ + ") Atividade: " + tituloList + " | Descrição: " + desc + " | Status: " + stat);
                                        }
                                }
                                break;
                        case 2:
                                if (atividadesPendentes.isEmpty()) {
                                        System.out.println("Nenhuma atividade pendente cadastrada.");
                                } else {
                                        int i = 1;
                                        for (String tituloPend : atividadesPendentes.keySet()) {
                                                String desc = atividadesPendentes.get(tituloPend);
                                                System.out.println(i++ + ") Atividade: " + tituloPend + " | Descrição: " + desc + " | Status: Pendente");
                                        }
                                }
                                break;
                        case 3:
                                if (atividadesAndamento.isEmpty()) {
                                        System.out.println("Nenhuma atividade em andamento cadastrada.");
                                } else {
                                        int i = 1;
                                        for (String tituloAnd : atividadesAndamento.keySet()) {
                                                String desc = atividadesAndamento.get(tituloAnd);
                                                System.out.println(i++ + ") Atividade: " + tituloAnd + " | Descrição: " + desc + " | Status: Em andamento");
                                        }
                                }
                                break;

                        case 4:
                                if (atividadesConcluidas.isEmpty()) {
                                        System.out.println("Nenhuma atividade concluída cadastrada.");
                                } else {
                                        int i = 1;
                                        for (String tituloConcluida : atividadesConcluidas.keySet()) {
                                                String desc = atividadesConcluidas.get(tituloConcluida);
                                                System.out.println(i++ + ") Atividade: " + tituloConcluida + " | Descrição: " + desc + " | Status: Concluída");
                                        }
                                }
                                break;

                        case 5:
                                System.out.println("Voltando ao menu principal...");
                                break;

                        default:
                                System.out.println("Opção inválida.");
                }
        }
}
}
