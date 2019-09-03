package br.ufrn.imd.material.dominio;

import java.util.List;

public class SaidaRequisicaoInterna {
	private String codigo;
	private Usuario requsitante;
	private Setor setorRequisitante;
	private Usuario responsavelSetor;
	private StatusRequisicao statusRequisicao;
	private List<ItemRequisicao> itensRequisicao;
	private List<HistoricoRequisicao> historicoRequisicao;
	private SaidaEstoque saidaEstoque;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Usuario getRequsitante() {
		return requsitante;
	}
	public void setRequsitante(Usuario requsitante) {
		this.requsitante = requsitante;
	}
	public Setor getSetorRequisitante() {
		return setorRequisitante;
	}
	public void setSetorRequisitante(Setor setorRequisitante) {
		this.setorRequisitante = setorRequisitante;
	}
	public Usuario getResponsavelSetor() {
		return responsavelSetor;
	}
	public void setResponsavelSetor(Usuario responsavelSetor) {
		this.responsavelSetor = responsavelSetor;
	}
	public StatusRequisicao getStatusRequisicao() {
		return statusRequisicao;
	}
	public void setStatusRequisicao(StatusRequisicao statusRequisicao) {
		this.statusRequisicao = statusRequisicao;
	}
	public List<ItemRequisicao> getItensRequisicao() {
		return itensRequisicao;
	}
	public void setItensRequisicao(List<ItemRequisicao> itensRequisicao) {
		this.itensRequisicao = itensRequisicao;
	}
	public List<HistoricoRequisicao> getHistoricoRequisicao() {
		return historicoRequisicao;
	}
	public void setHistoricoRequisicao(List<HistoricoRequisicao> historicoRequisicao) {
		this.historicoRequisicao = historicoRequisicao;
	}
	public SaidaEstoque getSaidaEstoque() {
		return saidaEstoque;
	}
	public void setSaidaEstoque(SaidaEstoque saidaEstoque) {
		this.saidaEstoque = saidaEstoque;
	}
	
	
}
