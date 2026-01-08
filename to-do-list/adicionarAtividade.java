package todolist;

import java.util.HashMap;
import java.util.Scanner;

public class addNova {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> atividades = new HashMap<>();
    HashMap<String, String> atividadesPendentes = new HashMap<>();
    HashMap<String, String> atividadesAndamento = new HashMap<>();
    HashMap<String, String> atividadesConcluidas = new HashMap<>();

public void addNova(){
    System.out.println("Insira o titulo da nova atividade: ");
    String novaAtiv = sc.nextLine();
    System.out.println("Descrição da nova atividade: ");
    String novaDesc = sc.nextLine();
    if (novaAtiv.isEmpty() && novaDesc.isEmpty()) {
            System.out.println("Erro ao adicionar. Tente novamente!");
    } else {
            atividades.put(novaAtiv, novaDesc);
            atividadesPendentes.put(novaAtiv, novaDesc);
            if (atividades.containsKey(novaAtiv) && atividadesPendentes.containsKey(novaAtiv)) {
                    System.out.println("Nova atividade cadastrada com sucesso!");
            } else {
                    System.out.println("Erro ao adicionar. Tente novamente!");
            }
    }

}
