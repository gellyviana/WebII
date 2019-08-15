package br.ufrn.imd.almoxarifado;

import java.util.Date;

public class GuiaRemessa {
	
	private int numeroGuiaRemessa;
	private Date dataEmissao;
	private int remessa;
	private String especieEmbalagem;
	ViaTransporte viaTransporte;
	NaturezaOperacao naturezaOperacao = new NaturezaOperacao();
	
	public int getNumeroGuiaRemessa() {
		return numeroGuiaRemessa;
	}
	public void setNumeroGuiaRemessa(int numeroGuiaRemessa) {
		this.numeroGuiaRemessa = numeroGuiaRemessa;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public int getRemessa() {
		return remessa;
	}
	public void setRemessa(int remessa) {
		this.remessa = remessa;
	}
	public String getEspecieEmbalagem() {
		return especieEmbalagem;
	}
	public void setEspecieEmbalagem(String especieEmbalagem) {
		this.especieEmbalagem = especieEmbalagem;
	}
	
}
