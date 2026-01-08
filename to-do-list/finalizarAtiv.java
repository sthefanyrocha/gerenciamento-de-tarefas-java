package todolist;

import java.util.HashMap;
import java.util.Scanner;

public class finalAtiv {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> atividades;
    HashMap<String, String> atividadesPendentes;
    HashMap<String, String> atividadesAndamento;
    HashMap<String, String> atividadesConcluidas;

public void finalAtiv(){
        if (atividades.isEmpty()) {
                System.out.println("Nenhuma atividade cadastrada.");
        } else {
                System.out.println("    Finalizar uma Atividade");
                System.out.println("Título da atividade: ");
                String pesquisa = sc.nextLine();
                if (atividades.containsKey(pesquisa)) {
                        System.out.println("Descrição: " + atividades.get(pesquisa));
                        if (atividadesAndamento.containsKey(pesquisa)) {
                                System.out.println("Status: Iniciada");
                                String valor = atividades.get(pesquisa);
                                atividadesConcluidas.put(pesquisa, valor);
                                if (atividadesConcluidas.containsKey(pesquisa)) {
                                        atividadesAndamento.remove(pesquisa);
                                        System.out.println("Atividade finalizada!");
                                        return;
                                }
                        } else if (atividadesPendentes.containsKey(pesquisa)) {
                                System.out.println("Status: Pendente");
                                System.out.println("Gostaria de concluir mesmo assim? ");
                                System.out.println("    1) Sim");
                                System.out.println("    2) Não");
                                System.out.println("Opção: ");
                                int concluir = sc.nextInt();
                                if (concluir == 1) {
                                        String valor = atividades.get(pesquisa);
                                        atividadesConcluidas.put(pesquisa, valor);
                                        if (atividadesConcluidas.containsKey(pesquisa)) {
                                                atividadesPendentes.remove(pesquisa);
                                                System.out.println("Atividade finalizada!");
                                                return;
                                        }
                                } else if (concluir == 2) {
                                        System.out.println("Atividade pendente.");
                                } else {
                                        System.out.println("Opcao invalida. Tente novamente! ");
                                        return;
                                }
                        } else if (atividadesConcluidas.containsKey(pesquisa)) {
                                System.out.println("Status: Concluida");
                        } else {
                                System.out.println("Atividade não encontrada.");
                        }
                }
        }
}
