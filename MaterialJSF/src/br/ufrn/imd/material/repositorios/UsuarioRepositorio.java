package br.ufrn.imd.material.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.material.dominio.Usuario;

public class UsuarioRepositorio {
	
	public static List<Usuario> usuarios;
		
	public static Usuario getUsuario(String login, String senha) {
		if(usuarios == null) {
			usuarios = new ArrayList<Usuario>();
			Usuario user = new Usuario();
			user.setNome("gvm");
			user.setLogin("gvm");
			user.setSenha("gvm");
			usuarios.add(user);
		}
		for(Usuario u: usuarios) {
			if(u.getLogin().equals(login) && u.getSenha().equals(senha)) {
				return u;
			}
		}
		return null;
	}

}
