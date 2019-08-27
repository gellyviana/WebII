package br.ufrn.imd.material.controllers;

import java.io.Serializable;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

import br.ufrn.imd.material.dominio.Material;
import br.ufrn.imd.material.repositorios.MaterialRepositorio;

public class MaterialMBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Material material;
	private DataModel<Material> materiaisModel;
	
	@Inject
	private UsuarioMBean usuarioMBean;
	
	public MaterialMBean() {
		material = new Material();
	}
	
	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public DataModel<Material> getMaterialModel() {
		return materiaisModel;
	}



	public void setMaterialModel(DataModel<Material> materialModel) {
		this.materiaisModel = materialModel;
	}



	public UsuarioMBean getUsuarioMBean() {
		return usuarioMBean;
	}



	public void setUsuarioMBean(UsuarioMBean usuarioMBean) {
		this.usuarioMBean = usuarioMBean;
	}



	public String novoMaterial() {
		material = new Material();
		return "/pages/material/form.jsf";
	}
	
	public String listaMaterial() {
		materiaisModel = new ListDataModel<Material>(MaterialRepositorio.listaMateriais());
		return "/pages/material/list.jsf";
	}
	
	public String cadastrarMaterial() {
		material.setUsuarioCadastro(usuarioMBean.getUsuarioLogado());
		material = new Material();
		return "/pages/material/form.jsf";
	}
	
	public String removerMaterial() {
		Material materialRemovido = materiaisModel.getRowData();
		MaterialRepositorio.remover(materialRemovido);
		materiaisModel = new ListDataModel<Material>(MaterialRepositorio.listaMateriais());
		return "/pages/material/list.jsf";
	}
}
