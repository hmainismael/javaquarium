package fr.univlittoral.javaquarium.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="P_POISSON")
public class PoissonDO {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="P_ID")
	private int id;
	
	@Column(name="P_ESPECE")
	private String espece;
	
	@Column(name="P_DESC1")
	private String desc1;
	
	@Column(name="P_DESC2")
	private String desc2;
	
	@Column(name="P_DESC3")
	private String desc3;
	
	@Column(name="P_COULEUR")
	private String couleur;
	
	@Column(name="P_LARGEUR")
	private float largeur;
	
	@Column(name="P_LONGUEUR")
	private float longueur;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	public String getDesc1() {
		return desc1;
	}

	public void setDesc1(String desc1) {
		this.desc1 = desc1;
	}

	public String getDesc2() {
		return desc2;
	}

	public void setDesc2(String desc2) {
		this.desc2 = desc2;
	}

	public String getDesc3() {
		return desc3;
	}

	public void setDesc3(String desc3) {
		this.desc3 = desc3;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public float getLargeur() {
		return largeur;
	}

	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}

	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}
}
