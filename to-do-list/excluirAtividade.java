package todolist;

import java.util.HashMap;
import java.util.Scanner;

public class exluirAtiv {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        HashMap<String, String> atividades = new HashMap<>();
        HashMap<String, String> atividadesPendentes = new HashMap<>();
        HashMap<String, String> atividadesAndamento = new HashMap<>();
        HashMap<String, String> atividadesConcluidas = new HashMap<>();

public void excluirAtiv(){
      System.out.println("Título para excluir: ");
      String titulo = sc.nextLine();
      if (atividades.containsKey(titulo)) {
              atividades.remove(titulo);
              atividadesPendentes.remove(titulo);
              atividadesAndamento.remove(titulo);
              atividadesConcluidas.remove(titulo);
              System.out.println("Atividade excluída com sucesso!");
      } else {
              while (true) {
                      System.out.println("Atividade não encontrada. Tente novamente!");
                      System.out.println("Título para excluir: ");
                      titulo = sc.nextLine();
                      if (atividades.containsKey(titulo)) {
                              atividades.remove(titulo);
                              atividadesPendentes.remove(titulo);
                              atividadesAndamento.remove(titulo);
                              atividadesConcluidas.remove(titulo);
                              System.out.println("Atividade excluída com sucesso!");
                              break;
                      } else {
                              break;
                      }
              }
      }
}
