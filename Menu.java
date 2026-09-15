import java.util.ArrayList;
import java.util.List;

public class Menu {
    // ATRIBUTOS
    String titulo = "######### - SUPERMERCADO TABAJARA - #########";
    private List<Produto> listaProdutos = new ArrayList<>();

    // costrutor
    public Menu(List<Produto> listaProdutos) {
        this.listaProdutos = new ArrayList<>(listaProdutos);
    }

    // Métodos

    public void exibeMenu() {

        System.out.println(titulo);
        System.out.printf("%-45s%n%n", "------------------ PRODUTOS ------------------");
        System.out.printf("%-8s| %-25s|%8s%n%n", "CÓDIGO", "PRODUTO", "PREÇO");

        for (Produto p : listaProdutos ) 
        {

            System.out.printf("%-7s | %-24s | R$ %6.2f%n", p.getCodProduto(), p.getNomeProduto(), p.getPrecoProduto());

        }

    }

}
