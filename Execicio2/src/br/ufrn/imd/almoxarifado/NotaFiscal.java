package br.ufrn.imd.almoxarifado;

import java.math.BigDecimal;
import java.util.Date;

import br.ufrn.imd.rh.PessoaJuridica;

public class NotaFiscal {
	
	private int serieNF;
	private int numeroNF;
	PessoaJuridica transportadora = new PessoaJuridica();
	private String motorista;
	private String placaVeiculo;
	private Date dataEmissao;
	PessoaJuridica emitente = new PessoaJuridica();
	PessoaJuridica destinatario = new PessoaJuridica();
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
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

}
