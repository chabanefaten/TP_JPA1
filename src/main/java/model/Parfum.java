package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the parfums database table.
 * 
 */
@Entity
@Table(name="parfums")
@NamedQuery(name="Parfum.findAll", query="SELECT p FROM Parfum p")
public class Parfum implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PARFUM")
	private int idParfum;

	@Column(name="NOM_PARFUM")
	private String nomParfum;

	private double prix;

	public Parfum() {
	}

	public int getIdParfum() {
		return this.idParfum;
	}

	public void setIdParfum(int idParfum) {
		this.idParfum = idParfum;
	}

	public String getNomParfum() {
		return this.nomParfum;
	}

	public void setNomParfum(String nomParfum) {
		this.nomParfum = nomParfum;
	}

	public double getPrix() {
		return this.prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

}