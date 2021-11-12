package node.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "AUTORE")

public class AutoreEntity {
	@Id 
	@Column(nullable=false, name="ID")
	private int id;
	
	@Column(nullable=false, name="NOME")
	private String nome;
	
	@Column(nullable=false, name="COGNOME")
	private String cognome;
	
	@Column(nullable=false, name="ETA")
	private Integer eta;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}
	
	

}