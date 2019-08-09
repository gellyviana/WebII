package br.ufrn.imd.almoxarifado.material;

public enum TipoMaterial {
		
	MEDICAMENTO(1), 
	MATERIA_PRIMA(2), 
	EMBALAGEM(3), 
	REAGENTE(4), 
	EQUIPAMENTO(5), 
	EXPEDIENTE(6), 
	OUTROS(7);
	
	private int opcao;
	
	TipoMaterial(int valorOpcao){
		this.opcao = valorOpcao;
	}
	public int getOpcao() {
		return opcao;
	}

}
