package br.ufrn.imd.almoxarifado.material;

public enum EstadoLote {
	QUARENTENA("quarentena"),
	APROVADO("aprovado"),
	REPROVADO("reprovado"),
	PENDENTE("pendente");
	
	private String opcao;
	
	EstadoLote(String valorOpcao){
		this.opcao = valorOpcao;
	}
	public String getOpcao() {
		return opcao;
	}
	

}
