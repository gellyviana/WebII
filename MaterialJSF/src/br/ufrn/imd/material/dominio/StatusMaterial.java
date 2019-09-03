package br.ufrn.imd.material.dominio;

public enum StatusMaterial {
	ATIVO(0),
	INTATIVO(1);
	
	private int opcao;
	
	StatusMaterial(int valor){
		this.opcao = valor;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	
	

}
