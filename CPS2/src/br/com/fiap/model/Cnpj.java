package br.com.fiap.model;

public class Cnpj {
	/*
	 * "nome_fantasia": "PETROBRAS", "cnpj": "33000167100246", "razao_social":
	 * "PETROLEO BRASILEIRO S A PETROBRAS", "natureza_juridica":
	 * "Sociedade de Economia Mista", "qualificacao_responsavel": "Diretor",
	 * "capital_social": 205431960000.0,
	 */
	private String nome_fantasia;
	private String cnpj;
	private String razao_social;
	private String natureza_juridica;
	private String qualificacao_responsavel;
	private String capital_social;

	public Cnpj() {
		super();
	}

	public Cnpj(String nome_fantasia, String cnpj, String razao_social, String natureza_juridica,
			String qualificacao_responsavel, String capital_social) {
		super();
		this.nome_fantasia = nome_fantasia;
		this.cnpj = cnpj;
		this.razao_social = razao_social;
		this.natureza_juridica = natureza_juridica;
		this.qualificacao_responsavel = qualificacao_responsavel;
		this.capital_social = capital_social;
	}

	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getNatureza_juridica() {
		return natureza_juridica;
	}

	public void setNatureza_juridica(String natureza_juridica) {
		this.natureza_juridica = natureza_juridica;
	}

	public String getQualificacao_responsavel() {
		return qualificacao_responsavel;
	}

	public void setQualificacao_responsavel(String qualificacao_responsavel) {
		this.qualificacao_responsavel = qualificacao_responsavel;
	}

	public String getCapital_social() {
		return capital_social;
	}

	public void setCapital_social(String capital_social) {
		this.capital_social = capital_social;
	}

	@Override
	public String toString() {
		return "Dados do Cnpj: \nnome fantasia: " + nome_fantasia + ", \ncnpj: " + cnpj + ", \nrazao social: " + razao_social
				+ ", \nnatureza juridica: " + natureza_juridica + ", \nqualificacao responsavel: " + qualificacao_responsavel
				+ ", \ncapital social: " + capital_social  ;
	}

}
