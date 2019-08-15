package br.ufrn.imd.almoxarifado;

import java.util.ArrayList;
import java.util.Date;

import br.ufrn.imd.rh.Funcionario;
import br.ufrn.imd.rh.Usuario;

public class EntradaEstoque {
	
	private String codigo;
	private ArrayList<MovimentacaoEntrada> Movimentacao = new ArrayList<MovimentacaoEntrada>();
	StatusMovimentacao status;
	private String observacoes;
	Usuario responsavel = new Usuario();
	private Date dataCcriacao;
	private Date dataEntrada;
	private ArrayList<Documento> documentos = new ArrayList();
	private boolean precisaConfenciaEstado;
	private boolean precisaPesagem;
	private boolean precisaAnalise;
	private String justificativa;
	NotaFiscal notaFiscal = new NotaFiscal();
	ChecklistRecebimentoComum checklistRecebimento = new ChecklistRecebimentoComum();
	ConferenciaPesagem conferenciaPesagem = new ConferenciaPesagem();
	ChecklistTransferencia checklistTransferencia = new ChecklistTransferencia();
	TipoEntrada tipoEntrada;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public ArrayList<MovimentacaoEntrada> getMovimentacao() {
		return Movimentacao;
	}
	public void setMovimentacao(ArrayList<MovimentacaoEntrada> movimentacao) {
		Movimentacao = movimentacao;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Date getDataCcriacao() {
		return dataCcriacao;
	}
	public void setDataCcriacao(Date dataCcriacao) {
		this.dataCcriacao = dataCcriacao;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public boolean isPrecisaConfenciaEstado() {
		return precisaConfenciaEstado;
	}
	public void setPrecisaConfenciaEstado(boolean precisaConfenciaEstado) {
		this.precisaConfenciaEstado = precisaConfenciaEstado;
	}
	public boolean isPrecisaPesagem() {
		return precisaPesagem;
	}
	public void setPrecisaPesagem(boolean precisaPesagem) {
		this.precisaPesagem = precisaPesagem;
	}
	public boolean isPrecisaAnalise() {
		return precisaAnalise;
	}
	public void setPrecisaAnalise(boolean precisaAnalise) {
		this.precisaAnalise = precisaAnalise;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	
}
