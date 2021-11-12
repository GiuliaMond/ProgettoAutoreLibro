package node.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "LIBRO")

public class LibroEntity {
	
	@Id 
	@Column(nullable=false, name="ID")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false, name="TITOLO")
	private String titolo;
	
	@Column(nullable=false, name="NUMERO_PAGINE")
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