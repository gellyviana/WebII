package br.ufrn.imd.almoxarifado.material;

import java.math.BigDecimal;

public class MaterialAnalisavel {
	
	private BigDecimal teorConcentracao;
	private int prazoEntrega;
	private String apresentacaoFarmaceutica;
	private BigDecimal volumeMinimo;
	//Documento fichaSeguranca = new Documento();
	private long registroAnvisa;
	private BigDecimal qtdAmostraAnalise;
	private int tempoLimiteAnalise;
	private int testeMaquina;
	Material material = new Material();
	DenominacaoComumBrasileira dcb = new DenominacaoComumBrasileira();
	
	public int getPrazoEntrega() {
		return prazoEntrega;
	}
	public void setPrazoEntrega(int prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}
	public DenominacaoComumBrasileira getDcb() {
		return dcb;
	}
	public void setDcb(DenominacaoComumBrasileira dcb) {
		this.dcb = dcb;
	}
	public String getApresentacaoFarmaceutica() {
		return apresentacaoFarmaceutica;
	}
	public void setApresentacaoFarmaceutica(String apresentacaoFarmaceutica) {
		this.apresentacaoFarmaceutica = apresentacaoFarmaceutica;
	}
	public BigDecimal getVolumeMinimo() {
		return volumeMinimo;
	}
	public void setVolumeMinimo(BigDecimal volumeMinimo) {
		this.volumeMinimo = volumeMinimo;
	}
	public long getRegistroAnvisa() {
		return registroAnvisa;
	}
	public void setRegistroAnvisa(long registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}
	public BigDecimal getQtdAmostraAnalise() {
		return qtdAmostraAnalise;
	}
	public void setQtdAmostraAnalise(BigDecimal qtdAmostraAnalise) {
		this.qtdAmostraAnalise = qtdAmostraAnalise;
	}
	public int getTempoLimiteAnalise() {
		return tempoLimiteAnalise;
	}
	public void setTempoLimiteAnalise(int tempoLimiteAnalise) {
		this.tempoLimiteAnalise = tempoLimiteAnalise;
	}
	public int getTesteMaquina() {
		return testeMaquina;
	}
	public void setTesteMaquina(int testeMaquina) {
		this.testeMaquina = testeMaquina;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	
}
