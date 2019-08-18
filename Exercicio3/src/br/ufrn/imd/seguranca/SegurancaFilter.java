package br.ufrn.imd.seguranca;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.dominio.Usuario;

@WebFilter("/paginas/")

public class SegurancaFilter implements Filter{
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain)
			throws IOException, ServletException{
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		Usuario usuario = (Usuario)
				req.getSession().getAttribute("usuario");
		if(usuario == null) {
			res.sendRedirect("/Exercicio3/login.jsp");
		}else {
			chain.doFilter(request, response);
		}
	}

}
