package br.triadworks.javaweb.modelo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {
	public void executa(HttpServletRequest req,
						HttpServletResponse res) 
					throws Exception;
}
