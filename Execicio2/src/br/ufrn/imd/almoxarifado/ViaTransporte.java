package br.ufrn.imd.almoxarifado;

public enum ViaTransporte {
	
	RODOVIARIO(1),
	FERROVIARIO(2),
	MARITIMO(3),
	AEREO(4);
	
	private int opcao;
	
	ViaTransporte(int opcao) {
		this.opcao = opcao;
	}
	public int getOpcao() {
		return this.opcao;
	}
}
