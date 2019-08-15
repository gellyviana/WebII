package br.ufrn.imd.almoxarifado;

import br.ufrn.imd.rh.Contato;
import br.ufrn.imd.rh.Endereco;

public class DadosEntrega {
	
	Endereco endereco = new Endereco();
	Contato contato = new Contato();
	private String local;
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
}
