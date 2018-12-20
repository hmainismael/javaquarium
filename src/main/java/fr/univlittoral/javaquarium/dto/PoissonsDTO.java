package fr.univlittoral.javaquarium.dto;

public class PoissonsDTO {
	private String nom;
	private String description;
	private String couleur;
	private String dimension;
	private String prix;
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getDimension() {
		return dimension;
	}
	
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	
	public String getPrix() {
		return prix;
	}
	
	public void setPrix(String prix) {
		this.prix = prix;
	}
}
