package br.ufrn.imd.almoxarifado.material;

public enum TipoMaterial {
	MEDICAMENTO, MATERIA_PRIMA, EMBALAGEM, REAGENTE, EQUIPAMENTO, EXPEDIENTE, OUTROS;
	
	private final int opcao;
	
	TipoMaterial(int valorOpcao){
		opcao = valorOpcao;
	}
	public int getOpcao() {
		return opcao;
	}

}
