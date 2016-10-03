package com.formation.TestJSF.domaine;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Toutes les propriétés de type String
	 */
	public String prenom;
	public String nom;
	public String genre;
	public Date datedenaissance;
	public String email;
	public String niveaudeservice;
	
	public User() {
		
	}
	public User(String prenom, String nom, String genre, Date datedenaissance, String email, String niveaudeservice) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.genre = genre;
		this.datedenaissance = datedenaissance;
		this.email = email;
		this.niveaudeservice = niveaudeservice;
	}


	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Date getDatedenaissance() {
		return datedenaissance;
	}
	public void setDatedenaissance(Date datedenaissance) {
		this.datedenaissance = datedenaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNiveaudeservice() {
		return niveaudeservice;
	}
	public void setNiveaudeservice(String niveaudeservice) {
		this.niveaudeservice = niveaudeservice;
	}
	
	

}
