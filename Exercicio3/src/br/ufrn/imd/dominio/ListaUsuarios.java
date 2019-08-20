package br.ufrn.imd.dominio;

import java.util.ArrayList;
/*
 * @author Gelly Viana Mota
 * Classe responsavel em capturar todos os usuarios cadastrados
 */

public class ListaUsuarios {
	/* 
	 * Lista estatica para poder ser usada em qualquer lugar do codigo
	 */
	private final static ArrayList<Usuario> usuarios = new ArrayList<>();
	
	public ListaUsuarios() {}
	
	public static ArrayList<Usuario> getListaUsuarios(){
		return usuarios;
	}

}
