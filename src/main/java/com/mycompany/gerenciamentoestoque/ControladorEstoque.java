/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentoestoque;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ControladorEstoque {
    private Estoque estoque;
    private TelaEstoque telaEstoque;

    public ControladorEstoque() {
        estoque = new Estoque();
        telaEstoque = new TelaEstoque(this);
    }

    public void cadastrarProduto(String nome, String descricao, double preco, int quantidade) {
        estoque.cadastrarProduto(new Produto(nome, descricao, preco, quantidade));
    }

    public void alterarProduto(int indice, String nome, String descricao, double preco, int quantidade) {
        ArrayList<Produto> produtos = estoque.getProdutos();
        
        if (produtos.isEmpty() || indice < 0 || indice >= produtos.size()) {
        JOptionPane.showMessageDialog(null, "Índice inválido. Produto não alterado.");
        return;
    }

    estoque.alterarProduto(indice, new Produto(nome, descricao, preco, quantidade));
    }

    public void removerProduto(int indice) {
    ArrayList<Produto> produtos = estoque.getProdutos();
    
    if (indice >= 0 && indice < produtos.size()) {
        produtos.remove(indice);
        JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");
    
    } else {
        JOptionPane.showMessageDialog(null, "Índice inválido. Produto não encontrado.");
    }
}

    public void pesquisarProduto(String nomePesquisa) {
    ArrayList<Produto> resultados = estoque.pesquisarProduto(nomePesquisa);
    
    if (resultados.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nenhum produto encontrado.");
    
    } else {
        StringBuilder mensagem = new StringBuilder("Resultados da pesquisa:\n");
        for (Produto produto : resultados) {
            mensagem.append("Nome: ").append(produto.getNome()).append("\n")
                    .append("Descrição: ").append(produto.getDescricao()).append("\n")
                    .append("Preço: ").append(produto.getPreco()).append("\n")
                    .append("Quantidade: ").append(produto.getQuantidade()).append("\n\n");
        }
        
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}

    public void mostrarCatalogo() {
        ArrayList<Produto> produtos = estoque.getProdutos();
        
        if (produtos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Catálogo vazio.");
        
        } else {
            StringBuilder catalogo = new StringBuilder("Catálogo de Produtos:\n\n");
        
          for (Produto produto : produtos) {
            catalogo.append("Indice do produto: ").append(produtos.indexOf(produto)).append("\n")
                    .append("Nome: ").append(produto.getNome()).append("\n")
                    .append("Descrição: ").append(produto.getDescricao()).append("\n")
                    .append("Preço: ").append(produto.getPreco()).append("\n")
                    .append("Quantidade: ").append(produto.getQuantidade()).append("\n\n");
        }
            
            JOptionPane.showMessageDialog(null, catalogo.toString());
        }
    }

    public void iniciar() {
        telaEstoque.exibirMenu();
    }
}
