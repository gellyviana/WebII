package br.ufrn.imd.material.dominio;

import java.util.Date;

public class GuiaRemessa {
	private int numeroGuiaRemessa;
	private Date dataEmissao;
	private ViaTransporte viaTransporte;
	private String especieEmbalagem;
	private NaturezaOperacao naturezaOperacao;
	private int remessa;
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
	public ViaTransporte getViaTransporte() {
		return viaTransporte;
	}
	public void setViaTransporte(ViaTransporte viaTransporte) {
		this.viaTransporte = viaTransporte;
	}
	public String getEspecieEmbalagem() {
		return especieEmbalagem;
	}
	public void setEspecieEmbalagem(String especieEmbalagem) {
		this.especieEmbalagem = especieEmbalagem;
	}
	public NaturezaOperacao getNaturezaOperacao() {
		return naturezaOperacao;
	}
	public void setNaturezaOperacao(NaturezaOperacao naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}
	public int getRemessa() {
		return remessa;
	}
	public void setRemessa(int remessa) {
		this.remessa = remessa;
	}
	
	
}
