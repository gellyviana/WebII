package br.ufrn.imd.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.dominio.ListaUsuarios;
import br.ufrn.imd.dominio.Usuario;

@WebServlet("/logar")

public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		resp.sendRedirect("/Exercicio3/login.jsp");
//		doPost(req,resp);
	}
	@Override
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		
		ArrayList<Usuario> usuarios = ListaUsuarios.getListaUsuarios();
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		for(Usuario u: usuarios) {
			if(u.getLogin().equals(login) && u.getSenha().equals(senha)) {
				req.getSession().setAttribute("usuario", u);
				resp.sendRedirect("/Exercicio3/Paginas"+"/Conteudo.jsp");
			}
		}
		
		//Redirecionar para a pagina de cadastro.
		
	
		resp.sendRedirect("/Exercicio3/login.jsp");
	}
	
}
