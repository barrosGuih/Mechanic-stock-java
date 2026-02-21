import service.EstoqueService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EstoqueService estoqueService = new EstoqueService();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n== Mechanic Stock ==");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Saida de Produto");
            System.out.println("3. Listar Historico");
            System.out.println("4. Estoque");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("ID do produto: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Quantidade: ");
                    int qtd = sc.nextInt();

                    estoqueService.adicionarProduto(id, nome, qtd);
                }

                case 2 -> {
                    System.out.println("ID do produto: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Quantidade: ");
                    int qtd = sc.nextInt();
                    sc.nextLine();
                    estoqueService.saidaProduto(id,qtd);
                }

                case 3 -> {
                    estoqueService.listarHistorico();
                }

                case 4 -> {
                    estoqueService.listarProdutos();
                }

                case 0 -> System.out.println("Saindo...");

                default -> System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
