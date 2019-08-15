package br.ufrn.imd.almoxarifado;

public enum TipoSaida {
	
	SAIDA_GUIA_REMESSA(1),
	SAIDA_AVULSA(2),
	SAIDA_REQUISICAO_INTERNA(3);
	
	private int opcao;
	
	TipoSaida(int opcao){
		this.opcao = opcao;
	}
	
	public int getOpcao() {
		return this.opcao;
	}
}
