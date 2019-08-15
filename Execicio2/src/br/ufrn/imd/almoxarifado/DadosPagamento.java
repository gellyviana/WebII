package br.ufrn.imd.almoxarifado;

public class DadosPagamento {
	
	private String banco;
	private String agencia;
	private String conta;
	private String condigoIdentificacaoDV;
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getCondigoIdentificacaoDV() {
		return condigoIdentificacaoDV;
	}
	public void setCondigoIdentificacaoDV(String condigoIdentificacaoDV) {
		this.condigoIdentificacaoDV = condigoIdentificacaoDV;
	}
	
}
