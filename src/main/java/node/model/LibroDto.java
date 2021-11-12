package node.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


public class LibroDto {
	@JsonProperty("LibroResponse")
	
	 
	private int id;

	private String titolo;
	
	private Integer numero_pagine;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getNumero_pagine() {
		return numero_pagine;
	}

	public void setNumero_pagine(Integer numero_pagine) {
		this.numero_pagine = numero_pagine;
	}
	
    
}
