import model.Produto;
import dao.ProdutoDAO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProdutoDAO dao = new ProdutoDAO(); 
        int opcao;

        do {
            System.out.println("\n== Mechanic Stock ==");
            System.out.println("1. Adicionar Produto");
            System.out.println("4. Listar Produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Quantidade: ");
                    int qtd = sc.nextInt();

                    dao.inserir(new Produto(id, nome, qtd)); // ✅ USA DAO
                    break;

                case 4:
                    dao.listar(); // ✅ USA DAO
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
