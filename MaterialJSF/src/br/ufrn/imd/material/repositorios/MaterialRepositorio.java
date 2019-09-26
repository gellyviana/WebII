package br.ufrn.imd.material.repositorios;

import java.util.ArrayList;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.ufrn.imd.material.dominio.Material;

@Stateless

public class MaterialRepositorio {
	@PersistenceContext
	private EntityManager em;
	
	//public static List<Material> materiais;
	
	public Material adicionar(Material material) {
		if(material.getId() == 0)
			em.persist(material);
		else
			em.merge(material);
		return material;
	}
	public void remover(Material material) {
		material = em.find(Material.class, material.getId());
		em.remove(material);
	}
	@SuppressWarnings("unchecked")
	public List<Material>listaMateriais(){
		return (List<Material>) em.createQuery(
				"select m from Material m").getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Material> buscarMaterialPorUsuario(String login){
		String jpaql = "select m from Material m where" + 
				"m.usuarioCadastrado.login = :login";
		Query q = em.createQuery(jpaql);
		q.setParameter("login", login);
		return q.getResultList();
	}
	public Material buscarMaterial(String codigo) {
		String jpaql = "select m from Material m" +
				"where m.codigo = :codigo";
		Query q = em.createQuery(jpaql);
		q.setParameter("codigo", codigo);
		
		try {
			return(Material) q.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}
}
