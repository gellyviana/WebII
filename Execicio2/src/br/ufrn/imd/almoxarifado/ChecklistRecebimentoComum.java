package br.ufrn.imd.almoxarifado;

import java.util.ArrayList;
import java.util.Date;

import br.ufrn.imd.almoxarifado.material.LoteMaterial;
import br.ufrn.imd.rh.Funcionario;

public class ChecklistRecebimentoComum {
	
	private Date dataChegada;
	LoteMaterial lote = new LoteMaterial();
	private boolean materialConfereNF;
	private boolean etiquetadoIdentificacao;
	private boolean embalagemIntegra;
	private boolean embalagemSuja;
	private boolean embalagemUmida;
	private boolean embalagemDeformada;
	private boolean embalagemVazada;
	private boolean emabalagemLacreViolado;
	private String placa;
	private float temperatura;
	private int numeroConhecimento;
	private String motorista;
	private String observacoes;
	Funcionario conferente = new Funcionario();
	ArrayList<Documento> anexoFotos = new ArrayList<Documento>();
	private boolean aprovado;
	
	public Date getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}
	public boolean isMaterialConfereNF() {
		return materialConfereNF;
	}
	public void setMaterialConfereNF(boolean materialConfereNF) {
		this.materialConfereNF = materialConfereNF;
	}
	public boolean isEtiquetadoIdentificacao() {
		return etiquetadoIdentificacao;
	}
	public void setEtiquetadoIdentificacao(boolean etiquetadoIdentificacao) {
		this.etiquetadoIdentificacao = etiquetadoIdentificacao;
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
	public boolean isEmabalagemLacreViolado() {
		return emabalagemLacreViolado;
	}
	public void setEmabalagemLacreViolado(boolean emabalagemLacreViolado) {
		this.emabalagemLacreViolado = emabalagemLacreViolado;
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
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
}
