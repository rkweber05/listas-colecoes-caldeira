import entities.Pessoa;
import entities.Produto;
import entities.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Pessoa> pessoas = new ArrayList<>();
//
//        Pessoa pessoa1 = new Pessoa("Rodrigo", 19);
//        Pessoa pessoa2 = new Pessoa("Amanda", 18);
//        Pessoa pessoa3 = new Pessoa("Aline", 25);
//
//        pessoas.add(pessoa1);
//        pessoas.add(pessoa2);
//        pessoas.add(pessoa3);
//
//        System.out.println("Tamanho da lista de pessoas = " + pessoas.size());
//        System.out.println("Primeiro da lista = " + pessoas.get(0).toString());
//        System.out.println("Lista Completa: ");
//        System.out.println(pessoas);

        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("Couro", 219.23, 12);
        Produto produto2 = new Produto("Cabedal", 154.56, 14);
        Produto produto3 = new Produto("Espuma", 258.69, 3);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println("Tamanho lista = " + produtos.size());
        System.out.println("P1 = " + produtos.get(0).toString());
        System.out.println("P2 = " + produtos.get(1).toString());
        System.out.println("P3 = " + produtos.get(2).toString());

        ProdutoPerecivel perecivel = new ProdutoPerecivel("Monitor", 810.90, 1, "08/07/2024");
        System.out.println(perecivel);

        for (Produto item : produtos) {
            System.out.println(item);
        }
    }
}