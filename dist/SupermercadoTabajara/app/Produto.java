public class Produto {
    private int codigo;
    private String nome;
    private double preco;

    

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    //métodos
    public int getCodProduto(){
        return this.codigo;
    }
    public String getNomeProduto(){
        return this.nome;
    }
    public double getPrecoProduto(){
        return this.preco;
    }

}
