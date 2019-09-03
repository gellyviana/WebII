package br.ufrn.imd.material.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufrn.imd.material.dominio.ReservaMaterial;
import br.ufrn.imd.material.repositorios.ReservaMaterialRepositorio;

@Named
@SessionScoped
public class ReservaMaterialMBean implements Serializable{
	private ReservaMaterial reservaMaterial;
	private DataModel<ReservaMaterial> reservaMaterialModel;
	@Inject
	private UsuarioMBean usuarioMBean;
	public ReservaMaterial getReservaMaterial() {
		return reservaMaterial;
	}
	public void setReservaMaterial(ReservaMaterial reservaMaterial) {
		this.reservaMaterial = reservaMaterial;
	}
	public DataModel<ReservaMaterial> getReservaMaterialModel() {
		return reservaMaterialModel;
	}
	public void setReservaMaterialModel(DataModel<ReservaMaterial> reservaMaterialModel) {
		this.reservaMaterialModel = reservaMaterialModel;
	}
	public UsuarioMBean getUsuarioMBean() {
		return usuarioMBean;
	}
	public void setUsuarioMBean(UsuarioMBean usuarioMBean) {
		this.usuarioMBean = usuarioMBean;
	}

	
	public ReservaMaterialMBean() {
		reservaMaterial = new ReservaMaterial();
	}
	
	public String novareservaMaterial() {
		reservaMaterial = new ReservaMaterial();
		return "/pages/material/formreservamaterial.jsf";
	}
	
	public String listarreservaMateriais() {
		reservaMaterialModel = new ListDataModel<ReservaMaterial>(ReservaMaterialRepositorio.listreservaMaterial());
		return "/pages/reservamaterial.list.jsf";
	}
	
	public String cadastrarreservaMaterial() {
		reservaMaterial.setUsuarioCadastro(usuarioMBean.getUsuarioLogado());
		ReservaMaterialRepositorio.adicionar(reservaMaterial);
		reservaMaterial = new ReservaMaterial();
		return "/pages/material/formreservamaterial.jsf";
	}
	
	public String removerreservaMaterial() {
		ReservaMaterial reservaMaterialRemovido = reservaMaterialModel.getRowData();
		ReservaMaterialRepositorio.remover(reservaMaterialRemovido);
		reservaMaterialModel = new ListDataModel<ReservaMaterial>(ReservaMaterialRepositorio.listreservaMaterial());
		return "/pages/material/listreservamaterial.jsf";
	}
}
