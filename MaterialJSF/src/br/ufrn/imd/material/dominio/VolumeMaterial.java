package br.ufrn.imd.material.dominio;

import java.math.BigDecimal;

public class VolumeMaterial {
	private String codigo;
	private Material material;
	private BigDecimal qtdInicial;
	private BigDecimal qtdAtual;
	private DimensaoUnidade dimensao;
	//private Localizacao localizacao;
	//private Localizacao lote;
	private VolumeMaterial volumeOrigem;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public BigDecimal getQtdInicial() {
		return qtdInicial;
	}
	public void setQtdInicial(BigDecimal qtdInicial) {
		this.qtdInicial = qtdInicial;
	}
	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}
	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}
	public DimensaoUnidade getDimensao() {
		return dimensao;
	}
	public void setDimensao(DimensaoUnidade dimensao) {
		this.dimensao = dimensao;
	}

	public VolumeMaterial getVolumeOrigem() {
		return volumeOrigem;
	}
	public void setVolumeOrigem(VolumeMaterial volumeOrigem) {
		this.volumeOrigem = volumeOrigem;
	}
	
	
}
