package br.ufrn.imd.almoxarifado;

import java.math.BigDecimal;

import br.ufrn.imd.almoxarifado.material.Material;
import br.ufrn.imd.almoxarifado.material.UnidadeMedida;

public class ItemRequisicao {
	
	private BigDecimal qtdRequisitada;
	private BigDecimal qtdAtendida;
	Material material = new Material();
	UnidadeMedida unidadeMedida = new UnidadeMedida();
	
	public BigDecimal getQtdRequisitada() {
		return qtdRequisitada;
	}
	public void setQtdRequisitada(BigDecimal qtdRequisitada) {
		this.qtdRequisitada = qtdRequisitada;
	}
	public BigDecimal getQtdAtendida() {
		return qtdAtendida;
	}
	public void setQtdAtendida(BigDecimal qtdAtendida) {
		this.qtdAtendida = qtdAtendida;
	}
	
}
