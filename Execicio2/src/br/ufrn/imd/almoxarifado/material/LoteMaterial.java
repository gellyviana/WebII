package br.ufrn.imd.almoxarifado.material;

import java.math.BigDecimal;
import java.util.Date;

import br.ufrn.imd.producao.OrdemProducao;
import br.ufrn.imd.rh.PessoaJuridica;

public class LoteMaterial {
	Material material = new Material();
	Date dataValidade = new Date();
	Date dataFabricacao = new Date();
	private EstadoLote estado;
	private String numeroLoteFabricante;
	private String numeroLoteInterno;
	private String numeroLoteFornecedor;
	private int volume;
	OrdemProducao ordemProducao = new OrdemProducao();
	PessoaJuridica fabricante = new PessoaJuridica();
	PessoaJuridica fornecedor = new PessoaJuridica();
	private int qtdCaixaEmbarque;
	private BigDecimal pesoBrutoTotal;
	private BigDecimal pesoLiquidoTotal;
	private BigDecimal tara;
	private double valorUnitario;
	public EstadoLote getEstado() {
		return estado;
	}
	public void setEstado(EstadoLote estado) {
		this.estado = estado;
	}
	public String getNumeroLoteFabricante() {
		return numeroLoteFabricante;
	}
	public void setNumeroLoteFabricante(String numeroLoteFabricante) {
		this.numeroLoteFabricante = numeroLoteFabricante;
	}
	public String getNumeroLoteInterno() {
		return numeroLoteInterno;
	}
	public void setNumeroLoteInterno(String numeroLoteInterno) {
		this.numeroLoteInterno = numeroLoteInterno;
	}
	public String getNumeroLoteFornecedor() {
		return numeroLoteFornecedor;
	}
	public void setNumeroLoteFornecedor(String numeroLoteFornecedor) {
		this.numeroLoteFornecedor = numeroLoteFornecedor;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getQtdCaixaEmbarque() {
		return qtdCaixaEmbarque;
	}
	public void setQtdCaixaEmbarque(int qtdCaixaEmbarque) {
		this.qtdCaixaEmbarque = qtdCaixaEmbarque;
	}
	public BigDecimal getPesoBrutoTotal() {
		return pesoBrutoTotal;
	}
	public void setPesoBrutoTotal(BigDecimal pesoBrutoTotal) {
		this.pesoBrutoTotal = pesoBrutoTotal;
	}
	public BigDecimal getPesoLiquidoTotal() {
		return pesoLiquidoTotal;
	}
	public void setPesoLiquidoTotal(BigDecimal pesoLiquidoTotal) {
		this.pesoLiquidoTotal = pesoLiquidoTotal;
	}
	public BigDecimal getTara() {
		return tara;
	}
	public void setTara(BigDecimal tara) {
		this.tara = tara;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
}
