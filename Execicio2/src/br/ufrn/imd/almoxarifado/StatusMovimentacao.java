package br.ufrn.imd.almoxarifado;

public enum StatusMovimentacao {
	ABERTO(0),
	FECHADO(1);
	
	private int opcao;
	
	StatusMovimentacao(int opcao){
		this.opcao = opcao;
	}
	
	public int getOpcao() {
		return this.opcao;
	}
}
