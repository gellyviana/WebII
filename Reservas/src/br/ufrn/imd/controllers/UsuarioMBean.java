package br.ufrn.imd.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufrn.imd.dominio.Usuario;
import br.ufrn.imd.repositorio.UsuarioRepositorio;


@Named("usuarioMBean")
@SessionScoped
public class UsuarioMBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioRepositorio usuarioRepositorio;
	
	private Usuario usuario;
	private Usuario usuarioLogado;
	
	public UsuarioMBean() {
		usuario = new Usuario();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}
	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	public String logar() {
		Usuario usuarioBd = usuarioRepositorio.getUsuario(usuario.getLogin(), usuario.getSenha());
		
		if(usuarioBd != null) {
			usuarioLogado = usuarioBd;
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioLogado", usuarioLogado);
			return "/pages/index.jsf";
		}else {
			FacesMessage msg = new FacesMessage("Usuario não encontrado");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage("", msg);
			return null;
		}
	}
}
