package br.ufrn.imd.almoxarifado;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import br.ufrn.imd.almoxarifado.material.Material;
import br.ufrn.imd.rh.Endereco;

public class ChecklistTransferencia {
	
	Material material = new Material();
	private BigDecimal qtd;
	Endereco local = new Endereco();
	private Date dataConferencia;
	private String observacoes;
	ArrayList<Documento>anexoFotos = new ArrayList<Documento>();
	private boolean aprovado;
	
	public BigDecimal getQtd() {
		return qtd;
	}
	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}
	public Date getDataConferencia() {
		return dataConferencia;
	}
	public void setDataConferencia(Date dataConferencia) {
		this.dataConferencia = dataConferencia;
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
