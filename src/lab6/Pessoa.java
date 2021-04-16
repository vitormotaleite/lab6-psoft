package lab6;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	private EstadoVacinacao estadoVacinacao;
	private String nome;
	private String cpf;
	private String endereco;
	private String cartaoSus;
	private String telefone;
	private String email;
	private String profissao;
	private List<String> comorbidades;
	private int idade;
	private int diasPrimeiraDose;
	
	public Pessoa() {
		super();
	}

	public Pessoa(EstadoVacinacao estadoVacinacao, String nome, String cpf, String endereco, String cartaoSus,
			String telefone, String email, String profissao, int idade) {
		super();
		this.estadoVacinacao = estadoVacinacao;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cartaoSus = cartaoSus;
		this.telefone = telefone;
		this.email = email;
		this.profissao = profissao;
		this.comorbidades = new ArrayList<>();
		this.idade = idade;
	}

	public EstadoVacinacao getEstadoVacinacao() {
		return estadoVacinacao;
	}

	public void setEstadoVacinacao(EstadoVacinacao estadoVacinacao) {
		this.estadoVacinacao = estadoVacinacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCartaoSus() {
		return cartaoSus;
	}

	public void setCartaoSus(String cartaoSus) {
		this.cartaoSus = cartaoSus;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public List<String> getComorbidades() {
		return comorbidades;
	}

	public void setComorbidades(List<String> comorbidades) {
		this.comorbidades = comorbidades;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void addComobirdade(String comobirdade) {
		this.comorbidades.add(comobirdade);
	}

	public int getDiasPrimeiraDose() {
		return diasPrimeiraDose;
	}

	public void setDiasPrimeiraDose(int diasPrimeiraDose) {
		this.diasPrimeiraDose = diasPrimeiraDose;
	}
}
