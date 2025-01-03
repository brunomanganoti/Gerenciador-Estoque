/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciamentoestoque;

// import java.util.Scanner;
// import java.util.ArrayList;

public class GerenciamentoEstoque {

    public static void main(String[] args) {
        ControladorEstoque controlador = new ControladorEstoque();
        controlador.iniciar();
    }
}

// Menu da primeira parte do trabalho:

/* public class GerenciamentoEstoque {

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Alterar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Pesquisar Produto");
            System.out.println("5. Mostrar Catálogo");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                System.out.print("Nome do produto: ");
                
                String nome = scanner.nextLine();
                System.out.print("Descrição do produto: ");
                
                String descricao = scanner.nextLine();
                System.out.print("Preço do produto: ");
                double preco = scanner.nextDouble();
                
                System.out.print("Quantidade em estoque: ");
                int quantidade = scanner.nextInt();
                estoque.cadastrarProduto(new Produto(nome, descricao, preco, quantidade));
            
            } else if (opcao == 2) {
                System.out.print("\nÍndice do produto a ser alterado: ");
                int indiceAlteracao = scanner.nextInt();
                scanner.nextLine();  
                
                System.out.print("Nome do produto: ");
                String nome = scanner.nextLine();
                
                System.out.print("Descrição do produto: ");
                String descricao = scanner.nextLine();
                
                System.out.print("Preço do produto: ");
                double preco = scanner.nextDouble();
                
                System.out.print("Quantidade em estoque: ");
                int quantidade = scanner.nextInt();
                estoque.alterarProduto(indiceAlteracao, new Produto(nome, descricao, preco, quantidade));
                
                System.out.println("\nProduto alterado com sucesso!");
                System.out.println("\n===========================");
            
            } else if (opcao == 3) {
                System.out.print("\nÍndice do produto a ser removido: ");
                int indiceRemocao = scanner.nextInt();
                estoque.removerProduto(indiceRemocao);
                
                System.out.println("Produto removido com sucesso!");
            
            } else if (opcao == 4) {
                System.out.print("\nDigite o nome do produto a ser pesquisado: ");
                
                String termoPesquisa = scanner.next();
                ArrayList<Produto> resultados = estoque.pesquisarProduto(termoPesquisa);
                
                if (resultados.isEmpty()) {
                    System.out.println("Nenhum produto encontrado.");
                
                } else {
                    System.out.println("\n===========================");
                    System.out.println("Resultados da pesquisa:");
                    
                    for (Produto produto : resultados) {
                        System.out.println("Nome: " + produto.getNome());
                        System.out.println("Descrição: " + produto.getDescricao());
                        System.out.println("Preço: " + produto.getPreco());
                        System.out.println("Quantidade: " + produto.getQuantidade());
                        System.out.println("===========================");
                    }
                }
            
            } else if (opcao == 5) {
                System.out.println("\n===========================");
                System.out.println("Catálogo de Produtos:\n");
                estoque.mostrarCatalogo();
                System.out.println("===========================");
            
            } else if (opcao == 6) {
                System.out.println("Finalizando programa...");
            
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }           
} */