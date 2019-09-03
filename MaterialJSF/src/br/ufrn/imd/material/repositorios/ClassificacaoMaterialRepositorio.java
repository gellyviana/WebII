package br.ufrn.imd.material.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.material.dominio.ClassificacaoMaterial;

public class ClassificacaoMaterialRepositorio {
	public static List<ClassificacaoMaterial> classificacaoMateriais;

	public static void adicionar(ClassificacaoMaterial classificacaoMaterial) {
		if(classificacaoMateriais == null) {
			classificacaoMateriais = new ArrayList<ClassificacaoMaterial>();
		}
		classificacaoMateriais.add(classificacaoMaterial);
	}
	
	public static void remover(ClassificacaoMaterial classificacaoMaterial) {
		classificacaoMateriais.remove(classificacaoMaterial);
	}
	
	public static List<ClassificacaoMaterial> listclassificacaoMaterial(){
		return classificacaoMateriais;
	}

}
