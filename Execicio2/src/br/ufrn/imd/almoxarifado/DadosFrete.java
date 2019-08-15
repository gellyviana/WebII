package br.ufrn.imd.almoxarifado;

import java.util.Date;

public class DadosFrete {

	private Date dataSaida;
	private String nomeTransportador;
	private String placaVeiculo;
	private String municipio;
	private String uf;
	private boolean fretePagoPorEmitente;
	
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public String getNomeTransportador() {
		return nomeTransportador;
	}
	public void setNomeTransportador(String nomeTransportador) {
		this.nomeTransportador = nomeTransportador;
	}
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public boolean isFretePagoPorEmitente() {
		return fretePagoPorEmitente;
	}
	public void setFretePagoPorEmitente(boolean fretePagoPorEmitente) {
		this.fretePagoPorEmitente = fretePagoPorEmitente;
	}
	
}
