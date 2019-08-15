package br.ufrn.imd.almoxarifado;

public enum StatusRequisicao {
	CADASTRADA(1), 
	EM_ANALISE(2),
	REPROVADA_CHEFE_SETOR(3),
	ENVIADA(4),
	ATENDIDA(5),
	ATENDIDA_PARCIALMENTE(6),
	NEGADA(7);
	
	private int opcao;

	StatusRequisicao(int opcao){
		this.opcao = opcao;
	}
	
	public int getOpcao() {
		return this.opcao;
	}
}
