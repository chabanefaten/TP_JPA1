package com.faten.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class parfums implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PARFUM")
    private Long idParfum;

    @Column(name = "NOM_PARFUM")
    private String nomParfum;

    @Column(name = "PRIX")
    private double prix;

    // Getters and setters
    public Long getIdParfum() {
        return idParfum;
    }

    public void setIdParfum(Long idParfum) {
        this.idParfum = idParfum;
    }

    public String getNomParfum() {
        return nomParfum;
    }

    public void setNomParfum(String nomParfum) {
        this.nomParfum = nomParfum;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

	@Override
	public String toString() {
		return "parfums [idParfum=" + idParfum + ", nomParfum=" + nomParfum + ", prix=" + prix + "]";
	}
    
    
    
    
}
