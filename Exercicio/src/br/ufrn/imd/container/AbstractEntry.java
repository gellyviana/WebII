package br.ufrn.imd.container;

import java.io.Serializable;

/**
 * @author gelly
 * 
 */

public abstract class AbstractEntry implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Id de cada usuário
	 */
	 private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	 

}
