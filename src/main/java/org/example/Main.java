package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Restaurante> restaurantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Cadastrar restaurante");
            System.out.println("2. Listar restaurantes");
            System.out.println("3. Cadastrar item no menu de um restaurante");
            System.out.println("4. Sair");

            System.out.println("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                System.out.println("\nDigite o nome do restaurante: ");
                String nomeRestaurante = scanner.nextLine();

                System.out.println("Digite a avaliação do restaurante: ");
                Integer avaliacao = scanner.nextInt();

                Restaurante restaurante = new Restaurante();
                restaurante.nome = nomeRestaurante;
                restaurante.avaliacao = avaliacao;

                restaurantes.add(restaurante);

                System.out.println("Restaurante" + nomeRestaurante + "cadastrado com sucesso!");
            } else if (opcao.equals("2")) {
                System.out.println("\nRestaurantes cadastrados:");

                for (Integer i = 0; i < restaurantes.size(); i++) {
                    Restaurante restaurante = restaurantes.get(i);
                    String indexInt = String.valueOf(i);
                    System.out.println(indexInt + ":" + " " + restaurante.nome);
                    restaurante.imprimirMenu();
                }
            } else if (opcao.equals("3")) {
                System.out.println("\nEscolha o número do restaurante para adicionar um item ao menu: ");
                Integer index = scanner.nextInt();
                Restaurante restauranteEscolhido = restaurantes.get(index);

                System.out.println("Digite o nome do item: ");
                String nomeItem = scanner.nextLine();
                scanner.nextLine();

                System.out.println("Digite o preço do item: ");
                Integer precoItem = scanner.nextInt();
                scanner.nextLine();

                Item item = new Item();
                item.nome = nomeItem;
                item.preco = precoItem;

                restauranteEscolhido.adicionarItem(item);

                System.out.println("Item " + nomeItem + " adicionado ao menu do restaurante " + restauranteEscolhido.nome + "!");
            } else if (opcao.equals("4")) {
                System.out.println("Obrigado por utilizar o sistema de cadastro de restaurantes!");
                break;
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}