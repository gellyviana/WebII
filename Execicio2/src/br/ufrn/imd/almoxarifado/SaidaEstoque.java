package br.ufrn.imd.almoxarifado;

import java.util.ArrayList;
import java.util.Date;

import br.ufrn.imd.rh.PessoaJuridica;
import br.ufrn.imd.rh.Usuario;

public class SaidaEstoque {
	
	Usuario responsavel = new Usuario();
	private Date dataEnvio;
	private Date dataCriacao;
	private String observacoes;
	private String justificativa;
	ArrayList<MovimentacaoSaida> movimentacaoSaida = new ArrayList<MovimentacaoSaida>();
	StatusMovimentacao status;
	PessoaJuridica transportadora = new PessoaJuridica();
	ArrayList<Documento> documentos = new ArrayList<Documento>();
	GuiaRemessa guiaRemessa = new GuiaRemessa();
	PessoaJuridica pjDestinatario = new PessoaJuridica();
	
	public Usuario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}
	public ArrayList<MovimentacaoSaida> getMovimentacaoSaida() {
		return movimentacaoSaida;
	}
	public void setMovimentacaoSaida(ArrayList<MovimentacaoSaida> movimentacaoSaida) {
		this.movimentacaoSaida = movimentacaoSaida;
	}
	public StatusMovimentacao getStatus() {
		return status;
	}
	public void setStatus(StatusMovimentacao status) {
		this.status = status;
	}
	public PessoaJuridica getTransportadora() {
		return transportadora;
	}
	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}
	public ArrayList<Documento> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(ArrayList<Documento> documentos) {
		this.documentos = documentos;
	}
	public GuiaRemessa getGuiaRemessa() {
		return guiaRemessa;
	}
	public void setGuiaRemessa(GuiaRemessa guiaRemessa) {
		this.guiaRemessa = guiaRemessa;
	}
	public PessoaJuridica getPjDestinatario() {
		return pjDestinatario;
	}
	public void setPjDestinatario(PessoaJuridica pjDestinatario) {
		this.pjDestinatario = pjDestinatario;
	}
	

}
