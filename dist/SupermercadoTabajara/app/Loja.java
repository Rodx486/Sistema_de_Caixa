public class Loja {
	// Atributos
	public String codigoLoja;
	public String nomeLoja;
	public String cnpjLoja;
	public String razaoSocialLoja;
	public String enderecoLoja;

	// Costrutor
	public Loja(String codLoja, String nLoja, String cnpj, String rSocial, String endLoja) {

		this.codigoLoja = codLoja;
		this.nomeLoja = nLoja;
		this.cnpjLoja = cnpj;
		this.razaoSocialLoja = rSocial;
		this.enderecoLoja = endLoja;
	}

	// Métodos
	public String getCodLoja() {
		return this.codigoLoja;
	}

	public String getNomeLoja() {
		return this.nomeLoja;
	}

	public String getCnpjLoja() {
		return this.cnpjLoja;
	}

	public String getRsocialLoja() {
		return this.razaoSocialLoja;
	}

	public String getEndLoja() {
		return this.enderecoLoja;
	}
}
