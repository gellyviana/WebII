package br.ufrn.imd.almoxarifado.material;

import java.math.BigDecimal;

public class ReservaMaterial {
	
	private BigDecimal qtd;
	Material material = new Material();
	//Usuario solicitante = new Usuario();
	public BigDecimal getQtd() {
		return qtd;
	}
	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}

}
