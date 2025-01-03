/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentoestoque;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TelaEstoque {
    private ControladorEstoque controlador;

    public TelaEstoque(ControladorEstoque controlador) {
        this.controlador = controlador;
    }

     public void exibirMenu() {
        JFrame telaMenu = new JFrame("Gerenciamento de Estoque");
        telaMenu.setSize(750, 650);
        telaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaMenu.setLayout(new GridLayout(6, 1));
        telaMenu.setLocationRelativeTo(null);
        

        JButton cadastrarButton = new JButton("Cadastrar Produto");
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirCadastroProduto();
            }
        });
        telaMenu.add(cadastrarButton);

        JButton alterarButton = new JButton("Alterar Produto");
        alterarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirAlteracaoProduto();
            }
        });
        telaMenu.add(alterarButton);

        JButton removerButton = new JButton("Remover Produto");
        removerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirRemocaoProduto();
            }
        });
        telaMenu.add(removerButton);

        JButton pesquisarButton = new JButton("Pesquisar Produto");
        pesquisarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirPesquisaProduto();
            }
        });
        telaMenu.add(pesquisarButton);

        JButton catalogoButton = new JButton("Mostrar Catálogo");
        catalogoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarCatalogo();
            }
        });
        telaMenu.add(catalogoButton);

        JButton sairButton = new JButton("Sair");
        sairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirmacao = JOptionPane.showConfirmDialog(telaMenu, "Você tem certeza que deseja sair do programa?", "Sair", JOptionPane.YES_NO_OPTION);
                
                if (confirmacao == JOptionPane.YES_OPTION){
                    telaMenu.dispose();
                
                } else {
                   return;
                }
            }
        });
        telaMenu.add(sairButton);

        telaMenu.setVisible(true);
    }

    private void exibirCadastroProduto() {
        String nome = JOptionPane.showInputDialog("Nome do produto:");
        if (nome == null) {
            return;
        }
                
        String descricao = JOptionPane.showInputDialog("Descrição do produto:");
        if (descricao == null) {
            return;
        }
        
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do produto:"));
        if (preco <= 0){
            JOptionPane.showMessageDialog(null, "Preço inválido!!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque:"));
        if (quantidade < 0){
            JOptionPane.showMessageDialog(null, "Quantidade deve ser um número positivo.", "ERRO!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        controlador.cadastrarProduto(nome, descricao, preco, quantidade);
    }

    private void exibirAlteracaoProduto() {
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Índice do produto a ser alterado:"));
        
        if (indice < 0){
            JOptionPane.showMessageDialog(null, "Indice do produto deve ser um número positivo.", "ERRO!", JOptionPane.ERROR_MESSAGE);
        } 
        
        String nome = JOptionPane.showInputDialog("Nome do produto:");
        if (nome == null) {
            return;
        }
        
        String descricao = JOptionPane.showInputDialog("Descrição do produto:");
        if (descricao == null) {
            return;
        }
        
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do produto:"));
        if (preco <= 0){
            JOptionPane.showMessageDialog(null, "Preço inválido!!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque:"));
        if (quantidade < 0){
            JOptionPane.showMessageDialog(null, "Quantidade deve ser um número positivo.", "ERRO!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        controlador.alterarProduto(indice, nome, descricao, preco, quantidade);
    }

    private void exibirRemocaoProduto() {
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Índice do produto a ser removido:"));
        
        if (indice < 0){
            JOptionPane.showMessageDialog(null, "Indice do produto deve ser um número positivo.", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
        
        controlador.removerProduto(indice);
    }

    private void exibirPesquisaProduto() {
        String termoPesquisa = JOptionPane.showInputDialog("Digite o nome do produto a ser pesquisado:");
        
        if (termoPesquisa == null){
            return;
        }

        controlador.pesquisarProduto(termoPesquisa);
    }
}