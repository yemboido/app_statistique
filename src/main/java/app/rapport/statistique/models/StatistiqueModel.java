package app.rapport.statistique.models;


public class StatistiqueModel {
	private String nom;
	private String prenom;
	private int age;
	private String profession;
	private int salaire;
	
	
	
	
	public StatistiqueModel() {
		super();
	}
	public StatistiqueModel(String nom, String prenom, int age, String profession, int salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.profession = profession;
		this.salaire = salaire;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	
	
	

}
