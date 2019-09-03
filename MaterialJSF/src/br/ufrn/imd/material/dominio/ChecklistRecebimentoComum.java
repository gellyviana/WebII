package br.ufrn.imd.material.dominio;

import java.util.Date;
import java.util.List;

public class ChecklistRecebimentoComum {
	private Date dataChegada;
	private LoteMaterial lote;
	private boolean materialConfereNF;
	private boolean etiqueadoIdentificacao;
	private boolean embalagemIntegra;
	private boolean embalagemSuja;
	private boolean embalagemUmida;
	private boolean embalagemDeformada;
	private boolean embalagemVazada;
	private boolean embalagemLacreViolado;
	private String placa;
	private float temperatura;
	private int numeroConhecimento;
	private String motorista;
	private String observacoes;
	private Funcionario conferente;
	private List<Documento> anexoFotos;
	private boolean aprovado;
	public Date getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}
	public LoteMaterial getLote() {
		return lote;
	}
	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}
	public boolean isMaterialConfereNF() {
		return materialConfereNF;
	}
	public void setMaterialConfereNF(boolean materialConfereNF) {
		this.materialConfereNF = materialConfereNF;
	}
	public boolean isEtiqueadoIdentificacao() {
		return etiqueadoIdentificacao;
	}
	public void setEtiqueadoIdentificacao(boolean etiqueadoIdentificacao) {
		this.etiqueadoIdentificacao = etiqueadoIdentificacao;
	}
	public boolean isEmbalagemIntegra() {
		return embalagemIntegra;
	}
	public void setEmbalagemIntegra(boolean embalagemIntegra) {
		this.embalagemIntegra = embalagemIntegra;
	}
	public boolean isEmbalagemSuja() {
		return embalagemSuja;
	}
	public void setEmbalagemSuja(boolean embalagemSuja) {
		this.embalagemSuja = embalagemSuja;
	}
	public boolean isEmbalagemUmida() {
		return embalagemUmida;
	}
	public void setEmbalagemUmida(boolean embalagemUmida) {
		this.embalagemUmida = embalagemUmida;
	}
	public boolean isEmbalagemDeformada() {
		return embalagemDeformada;
	}
	public void setEmbalagemDeformada(boolean embalagemDeformada) {
		this.embalagemDeformada = embalagemDeformada;
	}
	public boolean isEmbalagemVazada() {
		return embalagemVazada;
	}
	public void setEmbalagemVazada(boolean embalagemVazada) {
		this.embalagemVazada = embalagemVazada;
	}
	public boolean isEmbalagemLacreViolado() {
		return embalagemLacreViolado;
	}
	public void setEmbalagemLacreViolado(boolean embalagemLacreViolado) {
		this.embalagemLacreViolado = embalagemLacreViolado;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public int getNumeroConhecimento() {
		return numeroConhecimento;
	}
	public void setNumeroConhecimento(int numeroConhecimento) {
		this.numeroConhecimento = numeroConhecimento;
	}
	public String getMotorista() {
		return motorista;
	}
	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Funcionario getConferente() {
		return conferente;
	}
	public void setConferente(Funcionario conferente) {
		this.conferente = conferente;
	}
	public List<Documento> getAnexoFotos() {
		return anexoFotos;
	}
	public void setAnexoFotos(List<Documento> anexoFotos) {
		this.anexoFotos = anexoFotos;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

}

