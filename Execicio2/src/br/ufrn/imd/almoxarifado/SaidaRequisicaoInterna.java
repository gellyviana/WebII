package br.ufrn.imd.almoxarifado;

import java.util.ArrayList;

import br.ufrn.imd.rh.Setor;
import br.ufrn.imd.rh.Usuario;

public class SaidaRequisicaoInterna {
	
	private String codigo;
	Usuario requisitante = new Usuario();
	Setor setorRequisitante = new Setor();
	Usuario responsavelSetor = new Usuario();
	StatusRequisicao statusRequisicao;
	ArrayList<ItemRequisicao> itemRequisicoes = new ArrayList<ItemRequisicao>();
	ArrayList<HistoricoRequisicao> historicoRequisicoes = new ArrayList<HistoricoRequisicao>();
	SaidaEstoque saidaEstoque = new SaidaEstoque();
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	

}
