package br.ufrn.imd.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.dominio.ListaUsuarios;
import br.ufrn.imd.dominio.Usuario;

/**
 * Servlet implementation class CadastroServlet
 */
@WebServlet("/cadastrar")
public class CadastrarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("/Exercicio3/cadastro.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

		String senha = req.getParameter("senha");
		String login = req.getParameter("login");
		String nome = req.getParameter("nome");
		
		Usuario novo = new Usuario(login, senha, nome);
		ListaUsuarios.getListaUsuarios().add(novo);
		response.sendRedirect("/Exercicio3/login.jsp");

	}

}
