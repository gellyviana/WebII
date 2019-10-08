package br.ufrn.imd.repositorio;


import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.ufrn.imd.dominio.Usuario;


@Named
@Stateless
public class UsuarioRepositorio {
	
	@PersistenceContext
	private EntityManager em;
		
	public Usuario getUsuario(String login, String senha) {
		
		try {
			Query q = em.createQuery("select u from Usuario u where login = :login and senha =:senha");
			q.setParameter("login", login);
			q.setParameter("senha", senha);
			return (Usuario) q.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}
	
	@Transactional
	public Usuario novoUsuario(Usuario usuario) {
		em.persist(usuario);
		return usuario;
	}
	
	@Transactional
	public void remover(Usuario usuarioRemovido) {
		usuarioRemovido = em.find(Usuario.class, usuarioRemovido.getId());
		em.remove(usuarioRemovido);
		
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Usuario> listaUsuario() {
		return (List<Usuario>)em.createQuery("from Usuario").getResultList();
	}
	
	@Transactional
	public Usuario findByID(String cpf) {
		String jpaql = "select u from Usuario u where u.cpf = :cpf";
		Query query = em.createQuery(jpaql);
		query.setParameter("cpf", cpf);
		
		try {
			return (Usuario)query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	

}











