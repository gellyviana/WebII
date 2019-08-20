package br.ufrn.imd.dominio;

import java.util.ArrayList;

public class ListaUsuarios {
	
	private final static ArrayList<Usuario> usuarios = new ArrayList<>();
	
	public ListaUsuarios() { }
	
	public static ArrayList<Usuario> getListaUsuarios(){
		return usuarios;
	}

}
