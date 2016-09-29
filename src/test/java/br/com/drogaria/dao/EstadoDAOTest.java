package br.com.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Estado;

public class EstadoDAOTest {

	@Ignore
	@Test
	public void salvar() {

		Estado estado = new Estado();
		estado.setNome("Fortaleza");
		estado.setSigla("CE");

		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);

	}

	@Test
	public void listar(){
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();
		
			System.out.println("Total de Registros Encontrados: " + resultado.size());

		for (Estado estado : resultado) {
			
			System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
		
	}
}

}
