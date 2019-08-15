package br.ufrn.imd.almoxarifado;

public enum TipoEntrada {
	
	ENTRADA_NOTA_FISCAL(1),
	ENTRADA_TRANSFERENCIA(2),
	ENTRADA_AVULSA(3);
	
	private int opcao;
	
	TipoEntrada(int opcao){
		this.opcao = opcao;
	}
	public int getOpcao() {
		return this.opcao;
	}
}
