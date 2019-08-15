package br.ufrn.imd.almoxarifado.material;

import java.math.BigDecimal;

public class Material {
	
	private int codigo;
	private String nome;
	private String especificacao;
	private int estoqueMinimo;
	private int pontoPedido;
	private String dadosAdicionais;
	private int catmat;
	private String condicaoArmazenagem;
	private StatusMaterial statusMaterial;
	GrupoMaterial grupoMaterial = new GrupoMaterial();
	UnidadeMedida unidadeEstoque = new UnidadeMedida();
	UnidadeMedida unidadeEntrada = new UnidadeMedida();
	private BigDecimal fatorConversaoSaida;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
	public int getPontoPedido() {
		return pontoPedido;
	}
	public void setPontoPedido(int pontoPedido) {
		this.pontoPedido = pontoPedido;
	}
	public String getDadosAdicionais() {
		return dadosAdicionais;
	}
	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}
	public int getCatmat() {
		return catmat;
	}
	public void setCatmat(int catmat) {
		this.catmat = catmat;
	}
	public String getCondicaoArmazenagem() {
		return condicaoArmazenagem;
	}
	public void setCondicaoArmazenagem(String condicaoArmazenagem) {
		this.condicaoArmazenagem = condicaoArmazenagem;
	}
	public BigDecimal getFatorConversaoSaida() {
		return fatorConversaoSaida;
	}
	public void setFatorConversaoSaida(BigDecimal fatorConversaoSaida) {
		this.fatorConversaoSaida = fatorConversaoSaida;
	}

}
