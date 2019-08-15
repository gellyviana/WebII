package br.ufrn.imd.almoxarifado.material;

public enum StatusMaterial {
	ATIVO(1),
	INATIVO(2);
	
	private int opcao;
	
	StatusMaterial(int valorOpcao){
		this.opcao = valorOpcao;
	}
	public int getOpcao() {
		return opcao;
	}

}
