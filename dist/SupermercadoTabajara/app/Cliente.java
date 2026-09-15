import java.time.LocalDate;

public class Cliente {
	// Atributos
	private String codigoCliente;
	private String nomeCliente;
	private LocalDate dataCadastroCliente;
	private String cpfCnpjCliente;

	// Construtor
	public Cliente(String codCliente, String nCliente, LocalDate data, String cpf) {
		this.codigoCliente = codCliente;
		this.nomeCliente = nCliente;
		this.dataCadastroCliente = data;
		this.cpfCnpjCliente = cpf;

	}

	// Métodos
	public String getCodCliente() {
		return this.codigoCliente;
	}

	public String getNomecliente() {
		return this.nomeCliente;
	}

	public LocalDate getDataCdCliente() {
		return this.dataCadastroCliente;
	}

	public String getCpf() {
		return this.cpfCnpjCliente;
	}

}
