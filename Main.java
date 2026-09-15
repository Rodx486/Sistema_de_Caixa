import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // List de produtos disponíveis para venda
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Arroz Branco Tipo 1", 22.90));
        produtos.add(new Produto(2, "Feijão Carioca", 8.75));
        produtos.add(new Produto(3, "Açúcar Refinado", 5.49));
        produtos.add(new Produto(4, "Óleo de Soja", 9.99));
        produtos.add(new Produto(5, "Macarrão Espaguete", 4.79));
        produtos.add(new Produto(6, "Leite Integral", 4.50));
        produtos.add(new Produto(7, "Café Torrado Moído", 12.35));
        produtos.add(new Produto(8, "Sabão em Pó", 18.90));
        produtos.add(new Produto(9, "Detergente Líquido", 2.29));
        produtos.add(new Produto(10, "Biscoito Recheado", 6.15));

        // Cliente cadastrado
        Cliente cliente01 = new Cliente("C001", "Rodrigo Silva", LocalDate.of(2026, 8, 24), "123.456.789-00");

        // Dados da loja
        Loja loja01 = new Loja("L001", "Supermercado Tabajara", "12.345.678/0001-99", "Tabajara Central LTDA",
                "Rua Principal, 100 - Centro");

        // Venda
        Venda venda01 = new Venda(cliente01, loja01);

        // Exibe o menu de compras e permite adiciona itens ao carrinho de compras.
        Scanner scanner = new Scanner(System.in);
        int continuar;
        do {

            // Exibe o menu de seleção dos produtos para realizar uma compra.
            Menu menuCompras = new Menu(produtos);
            menuCompras.exibeMenu();
            // Entrada de dados
            System.out.printf("%nINFORME O CÓDIGO E QUANTIDADE PARA ADICIONAR AO CARRINHO%n");
            System.out.printf("%27s" + venda01.contarItens() + " ITENS" + "%n", "CARRINHO: ");

            System.out.println(cliente01.toString());

            System.out.print("Código: ");
            int codigo = scanner.nextInt();

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();

            Produto produtoEscolhido = produtos.get(codigo - 1);
            Item itemEscolhido = new Item(produtoEscolhido, quantidade);
            venda01.adicionarItem(itemEscolhido);

            System.out.print("Deseja adicionar outro produto? (1-Sim / 0-Não): ");
            continuar = scanner.nextInt();

        } while (continuar == 1);

        System.out.println("Compra terminada!!");
        System.out.println("Precione ENTER para ver cupom fiscal...");
        scanner.nextLine();
        scanner.nextLine();

        venda01.gerarCupom();

        System.out.println("Pressione ENTER para encerrar...");
        scanner.nextLine();
        scanner.close();

    }
}
