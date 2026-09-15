import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;


public class Venda {
    // atributos
    private List<Item> listaItens = new ArrayList<>();
    private Cliente cliente;
    private Loja loja;
    private LocalDateTime dataVenda;
    private double totalVenda;

    private static final int barra = 150;
    
    

    // costrutor
    public Venda(Cliente cliente, Loja lJ) {
        this.cliente = cliente;
        this.loja = lJ;
        this.dataVenda = LocalDateTime.now();

    }

    // métodos
    /**
     * Adiciona um nomo item a venda 
     *
     * @return não retorna nada
     */

    public void adicionarItem(Item item) {

        this.listaItens.add(item);
    }

    /**
     * Calcula a soma dos valores de todos os itens da venda.
     *
     * @return o valor total da venda.
     */
    public double calcularTotal() {

        this.totalVenda = 0;

        for (Item item : listaItens) {

            this.totalVenda = this.totalVenda + item.getValorTotal();

        }
        return this.totalVenda;

    }

    /**
     * Conta a quentidade de itens de uma venda.
     *
     * @return o total de itens da venda.
     */
    public int contarItens() {
        return listaItens.size();
    }

    /**
     * Cria um cupom fiscal contendo informações da venda realizada.
     *
     * @return cupom fiscal com dados sobre a venda.
     */
    public void gerarCupom() {


        

        // Cabeçalho
        // Dados da loja e do cliente;
        System.out.printf("%-150s", "########################### - CUPOM FISCAL - ##########################");
        System.out.printf("%n");
        System.out.println("-".repeat(barra));
        System.out.println("INFORMAÇÕES DA LOJA");
        System.out.println("-".repeat(barra));
        System.out.printf("%-25s| %-25s| %-25s| %-25s| %-25s%n%n", "NOME", "CNPJ", "CÓDIGO", "RAZÃO SOCIAL",
                "ENDEREÇO");
        System.out.printf("%-25s| %-25s| %-25s| %-25s| %-25s%n",
                this.loja.getNomeLoja(),
                this.loja.getCnpjLoja(),
                this.loja.getCodLoja(),
                this.loja.getRsocialLoja(),
                this.loja.getEndLoja());
        System.out.println("-".repeat(barra));
        System.out.println("INFORMAÇÕES DO CLIENTE ");
        System.out.println("-".repeat(barra));
        System.out.printf("%-25s| %-25s| %-25s| %-25s%n%n", "NOME", "CÓDIGO", "CADASTRO", "CPF");
        System.out.printf("%-25s| %-25s| %-25s| %-25s%n%n",
                this.cliente.getNomecliente(),
                this.cliente.getCodCliente(),
                this.cliente.getDataCdCliente(),
                this.cliente.getCpf());

        // Corpo
        // No corpo: itens, quantidade, valor e o subtotal;
        System.out.println("-".repeat(barra));
        System.out.println("INFORMAÇÕES DA COMPRA");
        System.out.println("-".repeat(barra));
        System.out.printf("%-25s| %-25s| %-25s| %-25s%n", "ITEM", "QUANTIDADE", "VALOR", "SUBTOTAL");

        for (Item item : this.listaItens) {

            System.out.printf("%-25s| %-25d| %-25.2f| %-25.2f%n%n",
                    item.getNomeProduto(),
                    item.getQtdProduto(),
                    item.getValorProduto(),
                    item.getValorTotal());

        }

        // No final da página(footer) a contagem dos itens e valor total;
        System.out.println("-".repeat(barra));
        System.out.printf("%-25s| %-25s%n", "TOTAL DE ITENS", "VALOR TOTAL");
        System.out.printf("%-25d| R$ %-22.2f%n",
                this.contarItens(),
                this.calcularTotal());

    }


}
