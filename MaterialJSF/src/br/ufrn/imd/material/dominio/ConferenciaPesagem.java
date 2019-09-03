package br.ufrn.imd.material.dominio;

import java.util.Date;
import java.util.List;

public class ConferenciaPesagem {
	private Date data;
	private LoteMaterial lote;
	private int numeroVolumes;
	private double taraKg;
	private int pesoVolumes;
	private boolean executado;
	private boolean conferido;
	
	private List<PesagemVolume> pesagemVolume;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public int getNumeroVolumes() {
		return numeroVolumes;
	}

	public void setNumeroVolumes(int numeroVolumes) {
		this.numeroVolumes = numeroVolumes;
	}

	public double getTaraKg() {
		return taraKg;
	}

	public void setTaraKg(double taraKg) {
		this.taraKg = taraKg;
	}

	public int getPesoVolumes() {
		return pesoVolumes;
	}

	public void setPesoVolumes(int pesoVolumes) {
		this.pesoVolumes = pesoVolumes;
	}

	public boolean isExecutado() {
		return executado;
	}

	public void setExecutado(boolean executado) {
		this.executado = executado;
	}

	public boolean isConferido() {
		return conferido;
	}

	public void setConferido(boolean conferido) {
		this.conferido = conferido;
	}

	public List<PesagemVolume> getPesagemVolume() {
		return pesagemVolume;
	}

	public void setPesagemVolume(List<PesagemVolume> pesagemVolume) {
		this.pesagemVolume = pesagemVolume;
	} 
	
	

}
