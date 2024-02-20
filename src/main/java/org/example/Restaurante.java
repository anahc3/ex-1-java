package org.example;

import java.util.ArrayList;

public class Restaurante {
    String nome;
    Integer avaliacao ;
    ArrayList<Item> cardapio = new ArrayList<>();

    void getNome() {
        System.out.println("Nome:" + nome);
    }

    void adicionarItem(Item item) {
        cardapio.add(item);
    }

    void imprimirMenu() {
        for (Item item : cardapio) {
            System.out.println(item.nome + " : " + item.preco);
        }
    }
}
