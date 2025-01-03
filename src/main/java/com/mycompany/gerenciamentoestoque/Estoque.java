/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentoestoque;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void alterarProduto(int indice, Produto produto) {
        produtos.set(indice, produto);
    }

    public void removerProduto(int indice) {
        produtos.remove(indice);
    }
    
    public ArrayList<Produto> pesquisarProduto(String nomePesquisa) { // método de pesquisa pelo nome do produto
        ArrayList<Produto> resultados = new ArrayList<>();
        String nomePesquisaLower = nomePesquisa.toLowerCase();
        
        for (Produto produto : produtos) {
            if (produto.getNome().toLowerCase().equals(nomePesquisaLower)) {
                resultados.add(produto);
            }
        }
        
        return resultados;
    }
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void mostrarCatalogo() {
        for (Produto produto : produtos) {
            System.out.println("Indice do produto: " + produtos.indexOf(produto));
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQuantidade() + "\n");
        }
    }
}