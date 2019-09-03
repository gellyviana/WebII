package br.ufrn.imd.material.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.material.dominio.GrupoMaterial;

public class GrupoMaterialRepositorio {
	public static List<GrupoMaterial> grupoMateriais;

	public static void adicionar(GrupoMaterial grupoMaterial) {
		if(grupoMateriais == null) {
			grupoMateriais = new ArrayList<GrupoMaterial>();
		}
		grupoMateriais.add(grupoMaterial);
	}
	
	public static void remover(GrupoMaterial grupoMaterial) {
		grupoMateriais.remove(grupoMaterial);
	}
	
	public static List<GrupoMaterial> listgrupoMaterial(){
		return grupoMateriais;
	}

}
