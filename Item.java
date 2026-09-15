public class Item {
	// atributos
	private int codigoProduto;
	private String nomeProduto;
	private int quantidadeProduto;
	private double valorProduto;
	private double valorTotalItem;

	// construtor
	public Item(Produto pDados, int qtdProduto) {
		this.codigoProduto = pDados.getCodProduto();
		this.nomeProduto = pDados.getNomeProduto();
		this.quantidadeProduto = qtdProduto;
		this.valorProduto = pDados.getPrecoProduto();
		this.valorTotalItem = this.valorProduto * this.quantidadeProduto;
	}

	// métodos
	public int getCodProduto() {

		return this.codigoProduto;

	}

	public String getNomeProduto() {

		return this.nomeProduto;

	}

	public int getQtdProduto() {

		return this.quantidadeProduto;

	}

	public double getValorProduto() {

		return this.valorProduto;

	}

	public double getValorTotal() {

		return this.valorTotalItem;

	}

}
