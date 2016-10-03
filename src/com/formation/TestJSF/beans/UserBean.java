package com.formation.TestJSF.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.formation.TestJSF.domaine.User;

@ManagedBean(name="userbean")
@SessionScoped
public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(name = "prenom", value = "MICHEL")
	public String prenom;
	@ManagedProperty(name = "nom", value = "DUPOND")
	@Size(min=3, max=15, message="Le nom doit contenir entre 3 et 15 caractères !")
	public String nom;
	@ManagedProperty(name = "genre", value = "homme")
	public String genre;
	@Past
	public Date datedenaissance;
	@ManagedProperty(name = "email", value = "particpant@objis.com")
	public String email;
	
	public String niveaudeservice;

	/**
	 * la liste des utilisateurs du tableau des utilisateurs
	 */
	private static final List<User> userList = new ArrayList<User>(
			Arrays.asList(
			new User("Dupont", "Michel", "homme", new Date(27/10/1977), "dupont@objis.com", "medium"),
			new User("Paulin", "Jacques", "homme", new Date(12/06/1965), "paulin@objis.com", "medium"),
			new User("Participant", "Objis", "homme", new Date(07/10/1987), "particpany@objis.com", "medium"),
			new User("Nathalie", "Tango", "femme", new Date(17/07/1980),"nathalie@objis.com", "premium")));

	public UserBean() {
		// TODO Auto-generated constructor stub
	}

	public List<User> getUserList() {
		return userList;
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
	
	public String addAction() {
		User u = new User(this.prenom, this.nom, this.genre, this.datedenaissance, this.email, this.niveaudeservice);
		userList.add(u);
		return "register3";
	}
	
	public String deleteAction(User user) {
		userList.remove(user);
		return "register2";
	}
	
	public String modifyAction(User user) {
		return "register4";
	}

}
