package todolist;

import java.util.HashMap;
import java.util.Scanner;

public class atualizarAtiv{
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> atividades;
    HashMap<String, String> atividadesPendentes;
    HashMap<String, String> atividadesAndamento;
    HashMap<String, String> atividadesConcluidas;

public void atualizarAtiv(){
    if (atividades.isEmpty()) {
            System.out.println("Nenhuma atividade cadastrada.");
    } else if (atividades.size() > 0){
            System.out.println("      Atualize as informações de uma atividade existente: ");
            System.out.println("Título da atividade: ");
            String pesquisa = sc.nextLine();
            if (atividades.containsKey(pesquisa)) {
                    while (true) {
                            System.out.println("1) Atualizar o título.");
                            System.out.println("2) Atualizar a descrição.");
                            System.out.println("3) Atualizar o título e a descrição.");
                            System.out.println("4) Sair.");
                            System.out.println("Opcao para atualizar: ");
                            int atualiza = sc.nextInt();
                            sc.nextLine();
                            if (atualiza == 1) {
                                    System.out.println("Titulo: " + pesquisa);
                                    System.out.println("Descricao: " + atividades.get(pesquisa));
                                    System.out.println("Novo título: ");
                                    String novoTitulo = sc.nextLine();
                                    String valor = atividades.get(pesquisa);
                                    atividades.put(novoTitulo, valor);
                                    if (atividadesPendentes.containsKey(pesquisa)) {
                                            atividadesPendentes.put(novoTitulo, valor);
                                    } else if (atividadesAndamento.containsKey(pesquisa)) {
                                            atividadesAndamento.put(novoTitulo, valor);

                                    } else if (atividadesConcluidas.containsKey(pesquisa)) {
                                            atividadesConcluidas.put(novoTitulo, valor);
                                    }
                                    if (atividades.containsKey(novoTitulo) && (atividadesAndamento.containsKey(novoTitulo) || atividadesConcluidas.containsKey(novoTitulo) || atividadesPendentes.containsKey(novoTitulo))) {
                                            atividades.remove(pesquisa);
                                            System.out.println("Atividade atualizada com sucesso!");
                                            break;
                                    }
                                        } else if (atualiza == 2) {
                                                System.out.println("Titulo: " + pesquisa);
                                                System.out.println("Descrição : " + atividades.get(pesquisa));
                                                System.out.println("Nova descrição: ");
                                                String novaDescricao = sc.nextLine();
                                                String valor = atividades.get(pesquisa);
                                                atividades.replace(pesquisa, valor, novaDescricao);
                                                if (atividadesPendentes.containsKey(pesquisa)) {
                                                        atividadesPendentes.replace(pesquisa, valor, novaDescricao);
                                                } else if (atividadesAndamento.containsKey(pesquisa)) {
                                                        atividadesAndamento.replace(pesquisa, valor, novaDescricao);
                                                } else if (atividadesConcluidas.containsKey(pesquisa)) {
                                                        atividadesConcluidas.replace(pesquisa, valor, novaDescricao);
                                                }
                                                if (atividades.containsKey(pesquisa) && atividades.containsValue(novaDescricao) && ((atividadesPendentes.containsKey(pesquisa) && atividadesPendentes.containsValue(novaDescricao)) || (atividadesAndamento.containsKey(pesquisa) && atividadesAndamento.containsValue(novaDescricao)) || (atividadesConcluidas.containsKey(pesquisa) && atividadesConcluidas.containsValue(novaDescricao)))) {
                                                        System.out.println("Atividade atualizada com sucesso!");
                                                        break;
                                                }
                                        } else if (atualiza == 3) {
                                                System.out.println("Titulo: " + pesquisa);
                                                System.out.println("Descrição: " + atividades.get(pesquisa));                                                
                                                System.out.println("Novo título: ");
                                                String novoTitulo = sc.nextLine();
                                                System.out.println("Nova descrição: ");
                                                String novoValor = sc.nextLine();
                                                atividades.put(novoTitulo, novoValor);
                                                if (atividadesPendentes.containsKey(pesquisa)) {
                                                        atividadesPendentes.put(novoTitulo, novoValor);
                                                } else if (atividadesAndamento.containsKey(pesquisa)) {
                                                        atividadesAndamento.put(novoTitulo, novoValor);
                                                } else if (atividadesConcluidas.containsKey(pesquisa)) {
                                                        atividadesConcluidas.put(novoTitulo, novoValor);
                                                }
                                                if (atividades.containsKey(novoTitulo) && atividades.containsValue(novoValor) && ((atividadesPendentes.containsKey(novoTitulo) && atividadesPendentes.containsValue(novoValor)) || (atividadesAndamento.containsKey(novoTitulo) && atividadesAndamento.containsValue(novoValor)) || (atividadesConcluidas.containsKey(novoTitulo) && atividadesConcluidas.containsValue(novoValor)))) {
                                                        System.out.println("Atividade atualizada com sucesso!");
                                                        break;
                                                }
                                        } else if (atualiza == 4) {
                                                break;
                                        }
                                }
                        }
                }else {
                        System.out.println("Atividade não encontrada. Tente novamente!");
                }
        }
