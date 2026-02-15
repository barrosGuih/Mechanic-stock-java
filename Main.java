import model.Produto;
import service.EstoqueService;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        EstoqueService estoque = new EstoqueService();
        Scanner sc = new Scanner(System.in);
        Integer opcao;

        do {
            System.out.println("\n== Mechanic Stock ==");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Entrada de Produto");
            System.out.println("3. Saída de Produto");
            System.out.println("4. Listar Produtos");
            System.out.println("5. Histórico de Movimentações");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir enter

            switch(opcao) {
                case 1:
                    System.out.print("ID: "); int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: "); String nome = sc.nextLine();
                    System.out.print("Quantidade: "); int qtd = sc.nextInt();
                    estoque.adicionarProduto(new Produto(id, nome, qtd));
                    break;
                case 2:
                    System.out.print("ID do Produto: "); int idEntrada = sc.nextInt();
                    System.out.print("Quantidade: "); int qtdEntrada = sc.nextInt();
                    estoque.entradaProduto(idEntrada, qtdEntrada);
                    break;
                case 3:
                    System.out.print("ID do Produto: "); int idSaida = sc.nextInt();
                    System.out.print("Quantidade: "); int qtdSaida = sc.nextInt();
                    estoque.saidaProduto(idSaida, qtdSaida);
                    break;
                case 4:
                    estoque.listarProdutos();
                    break;
                case 5:
                    estoque.listarHistorico();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao != 0);

        sc.close();
    }
}