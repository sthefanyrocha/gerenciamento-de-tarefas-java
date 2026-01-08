package todolist;

import java.util.HashMap;
import java.util.Scanner;

public class pesquisarTitulo {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> atividades;
    HashMap<String, String> atividadesPendentes;
    HashMap<String, String> atividadesAndamento;
    HashMap<String, String> atividadesConcluidas;
  
public void pesquisarTitulo(){
    if (atividades.isEmpty()) {
            System.out.println("Nenhuma atividade cadastrada.");
    } else {
    System.out.println("      Pesquisar atividade por Título       ");
    System.out.println("Título da atividade: ");
    String pesquisa = sc.nextLine();
            if (atividades.containsKey(pesquisa)) {
                    System.out.println("Titulo: " + pesquisa);
                    System.out.println("Descrição: " + atividades.get(pesquisa));
                    if (atividadesPendentes.containsKey(pesquisa)) {
                            System.out.println("Status: Pendente");
                    } else if (atividadesAndamento.containsKey(pesquisa)) {
                            System.out.println("Status: Em andamento");
                    } else if (atividadesConcluidas.containsKey(pesquisa)) {
                            System.out.println("Status: Concluida");
                    }

            } else {
                    System.out.println("Atividade não encontrada. Tente novamente!");
            }
    }
}
