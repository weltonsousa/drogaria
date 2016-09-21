package br.com.drogaria.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
	//suprimir as mensagem de alerta. 
	@SuppressWarnings("serial")
	//notação que não corresponde a uma tabela, mas a filha gera tabela.
	@MappedSuperclass

public class GenericDomain implements Serializable {
	//gerador de chave primária.
	@Id
	//gerador de valores
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	
	public long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
}
