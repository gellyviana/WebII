package br.ufrn.imd.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufrn.imd.dominio.Usuario;
import br.ufrn.imd.repositorio.UsuarioRepositorio;


@Named
@SessionScoped
public class UsuarioMBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario usuario;
	private Usuario usuarioLogado;
	private Usuario usuarioTmp;
	private DataModel<Usuario> usuarioModel;

	@Inject
	private UsuarioRepositorio usuarioRepositorio;
	
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
	
	public String newUsuario() {
		usuario = new Usuario();
		return "/pages/usuario/novousuario.jsf";
	}	
	public String novousuario() {	
		usuarioRepositorio.novoUsuario(usuario);
		usuario = new Usuario();
		return "/pages/usuario/novousuario.jsf";
	}
	
	public String listUsuario() {
		usuarioModel = new ListDataModel<Usuario>(usuarioRepositorio.listaUsuario());
		return "/pages/usuario/listusuario.jsf";
	}
	
	
	public String removerUsuario() {
		Usuario usuarioRemovido = usuarioModel.getRowData();
		usuarioRepositorio.remover(usuarioRemovido);
		usuarioModel = new ListDataModel<Usuario>(usuarioRepositorio.listaUsuario());
		return listUsuario();
	}
	
	public String searchUser() {
		usuarioTmp = usuarioRepositorio.findByID(usuario.getCpf());
		return "/pages/usuario/editarusuario.jsf";
	}
	
	public DataModel<Usuario> getUsuarioModel() {
		return usuarioModel;
	}

	public void setUsuarioModel(DataModel<Usuario> usuarioModel) {
		this.usuarioModel = usuarioModel;
	}

	public Usuario getUsuarioTmp() {
		return usuarioTmp;
	}

	public void setUsuarioTmp(Usuario usuarioTmp) {
		this.usuarioTmp = usuarioTmp;
	}

}
