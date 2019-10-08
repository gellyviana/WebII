package br.ufrn.imd.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufrn.imd.repositorio.SalaRepositorio;
import br.ufrn.imd.repositorio.UsuarioRepositorio;

@Named("reservaMBean")
@SessionScoped
public class ReservaMBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioRepositorio usuarioRepositorio;
	@Inject
	private SalaRepositorio salaRepositorio;
	
	

}
