package br.ufrn.imd.almoxarifado;

import java.util.Date;

import br.ufrn.imd.rh.Usuario;

public class HistoricoRequisicao {
	
	private Date dataRegistro;
	private String observacoes;
	StatusRequisicao status;
	Usuario usuario = new Usuario();
	
	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	

}
