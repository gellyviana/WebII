package br.ufrn.imd.material.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufrn.imd.material.dominio.ClassificacaoMaterial;
import br.ufrn.imd.material.dominio.Material;
import br.ufrn.imd.material.repositorios.ClassificacaoMaterialRepositorio;
import br.ufrn.imd.material.repositorios.MaterialRepositorio;

@Named
@SessionScoped
public class ClassificacaoMaterialMBean implements Serializable{
	private ClassificacaoMaterial classificacaoMaterial;
	private DataModel<ClassificacaoMaterial> classificacaoMaterialModel;
	@Inject
	private UsuarioMBean usuarioMBean;
	
	public ClassificacaoMaterial getClassificacaoMaterial() {
		return classificacaoMaterial;
	}

	public void setClassificacaoMaterial(ClassificacaoMaterial classificacaoMaterial) {
		this.classificacaoMaterial = classificacaoMaterial;
	}

	public DataModel<ClassificacaoMaterial> getClassificacaoMaterialModel() {
		return classificacaoMaterialModel;
	}

	public void setClassificacaoMaterialModel(DataModel<ClassificacaoMaterial> classificacaoMaterialModel) {
		this.classificacaoMaterialModel = classificacaoMaterialModel;
	}

	public UsuarioMBean getUsuarioMBean() {
		return usuarioMBean;
	}

	public void setUsuarioMBean(UsuarioMBean usuarioMBean) {
		this.usuarioMBean = usuarioMBean;
	}

	public ClassificacaoMaterialMBean() {
		classificacaoMaterial = new ClassificacaoMaterial();
	}
	
	public String novaclassificacaoMaterial() {
		classificacaoMaterial = new ClassificacaoMaterial();
		return "/pages/material/formclassificacaomaterial.jsf";
	}
	
	public String listarclassificacaoMateriais() {
		classificacaoMaterialModel = new ListDataModel<ClassificacaoMaterial>(ClassificacaoMaterialRepositorio.listclassificacaoMaterial());
		return "/pages/classificacaomaterial.list.jsf";
	}
	
	public String cadastrarclassificacaoMaterial() {
		classificacaoMaterial.setUsuarioCadastro(usuarioMBean.getUsuarioLogado());
		ClassificacaoMaterialRepositorio.adicionar(classificacaoMaterial);
		classificacaoMaterial = new ClassificacaoMaterial();
		return "/pages/material/formclassificacaomaterial.jsf";
	}
	
	public String removerclassificacaoMaterial() {
		ClassificacaoMaterial classificacaoMaterialRemovido = classificacaoMaterialModel.getRowData();
		ClassificacaoMaterialRepositorio.remover(classificacaoMaterialRemovido);
		classificacaoMaterialModel = new ListDataModel<ClassificacaoMaterial>(ClassificacaoMaterialRepositorio.listclassificacaoMaterial());
		return "/pages/material/listclassificacaomaterial.jsf";
	}

}
