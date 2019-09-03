package br.ufrn.imd.material.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.material.dominio.ReservaMaterial;

public class ReservaMaterialRepositorio {
	public static List<ReservaMaterial> reservaMateriais;

	public static void adicionar(ReservaMaterial reservaMaterial) {
		if(reservaMateriais == null) {
			reservaMateriais = new ArrayList<ReservaMaterial>();
		}
		reservaMateriais.add(reservaMaterial);
	}
	
	public static void remover(ReservaMaterial reservaMaterial) {
		reservaMateriais.remove(reservaMaterial);
	}
	
	public static List<ReservaMaterial> listreservaMaterial(){
		return reservaMateriais;
	}

}
