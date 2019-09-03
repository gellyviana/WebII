package br.ufrn.imd.material.dominio;

import java.math.BigDecimal;
import java.util.Date;

public class NotaFiscal {
	private int serieNF;
	private int numeroNF;
	private PessoaJuridica transportadora;
	private String motorista;
	private String placaVeiculo;
	private Date dataEmissao;
	private PessoaJuridica emitente;
	private PessoaJuridica destinatario;
	private BigDecimal valorTotal;
	public int getSerieNF() {
		return serieNF;
	}
	public void setSerieNF(int serieNF) {
		this.serieNF = serieNF;
	}
	public int getNumeroNF() {
		return numeroNF;
	}
	public void setNumeroNF(int numeroNF) {
		this.numeroNF = numeroNF;
	}
	public PessoaJuridica getTransportadora() {
		return transportadora;
	}
	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}
	public String getMotorista() {
		return motorista;
	}
	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public PessoaJuridica getEmitente() {
		return emitente;
	}
	public void setEmitente(PessoaJuridica emitente) {
		this.emitente = emitente;
	}
	public PessoaJuridica getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(PessoaJuridica destinatario) {
		this.destinatario = destinatario;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
