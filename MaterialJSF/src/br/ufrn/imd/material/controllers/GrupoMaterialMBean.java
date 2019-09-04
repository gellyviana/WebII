package br.ufrn.imd.material.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufrn.imd.material.dominio.GrupoMaterial;
import br.ufrn.imd.material.repositorios.GrupoMaterialRepositorio;

@Named
@SessionScoped
public class GrupoMaterialMBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GrupoMaterial grupoMaterial;
	private DataModel<GrupoMaterial> grupoMaterialModel;
	@Inject
	private UsuarioMBean usuarioMBean;
	public GrupoMaterial getGrupoMaterial() {
		return grupoMaterial;
	}
	public void setGrupoMaterial(GrupoMaterial grupoMaterial) {
		this.grupoMaterial = grupoMaterial;
	}
	public DataModel<GrupoMaterial> getGrupoMaterialModel() {
		return grupoMaterialModel;
	}
	public void setGrupoMaterialModel(DataModel<GrupoMaterial> grupoMaterialModel) {
		this.grupoMaterialModel = grupoMaterialModel;
	}
	public UsuarioMBean getUsuarioMBean() {
		return usuarioMBean;
	}
	public void setUsuarioMBean(UsuarioMBean usuarioMBean) {
		this.usuarioMBean = usuarioMBean;
	}
	
	public GrupoMaterialMBean() {
		grupoMaterial = new GrupoMaterial();
	}
	
	public String novogrupoMaterial() {
		grupoMaterial = new GrupoMaterial();
		return "/pages/material/formgrupomaterial.jsf";
	}
	
	public String listargrupoMaterial() {
		grupoMaterialModel = new ListDataModel<GrupoMaterial>(GrupoMaterialRepositorio.listgrupoMaterial());
		return "/pages/material/listgrupomaterial.jsf";
	}
	
	public String cadastrargrupoMaterial() {
		grupoMaterial.setUsuarioCadastro(usuarioMBean.getUsuarioLogado());
		GrupoMaterialRepositorio.adicionar(grupoMaterial);
		grupoMaterial = new GrupoMaterial();
		return "/pages/material/formgrupomaterial.jsf";
	}
	
	public String removergrupoMaterial() {
		GrupoMaterial grupoMaterialRemovido = grupoMaterialModel.getRowData();
		GrupoMaterialRepositorio.remover(grupoMaterialRemovido);
		grupoMaterialModel = new ListDataModel<GrupoMaterial>(GrupoMaterialRepositorio.listgrupoMaterial());
		return "/pages/material/listgrupomaterial.jsf";
	}

}
