package todolist;

import java.util.HashMap;
import java.util.Scanner;

public class iniciarAtiv {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> atividades;
    HashMap<String, String> atividadesPendentes;
    HashMap<String, String> atividadesAndamento;
    HashMap<String, String> atividadesConcluidas;

public void iniciarAtiv(){
    if (atividades.isEmpty()) {
            System.out.println("Nenhuma atividade cadastrada.");
    } else {
            System.out.println("    Iniciar uma Atividade");
            System.out.println("Título da atividade: ");
            String pesquisa = sc.nextLine();
            if (atividades.containsKey(pesquisa)) {
                    System.out.println("Descrição: " + atividades.get(pesquisa));
                    if (atividadesPendentes.containsKey(pesquisa)) {
                            System.out.println("Status: Pendente");
                            String valor = atividades.get(pesquisa);
                            atividadesAndamento.put(pesquisa, valor);
                            if (atividadesAndamento.containsKey(pesquisa)) {
                                    atividadesPendentes.remove(pesquisa);
                                    System.out.println("Atividade iniciada com sucesso!");
                            }
                    } else if (atividadesAndamento.containsKey(pesquisa)) {
                            System.out.println("Atividade ja iniciada.");
                    } else if (atividadesConcluidas.containsKey(pesquisa)) {
                            System.out.println("Status: Concluida");
                    }
            } else {
                    System.out.println("Atividade não encontrada.");
            }
    }
}
