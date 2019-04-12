package model;

public class Utilisateur {
	
	private String Identifiant;
	private String MotDePasse;
	private String Nom;
	private String Prenom;
	
	public Utilisateur()
	{
		
	}
	public Utilisateur(String identifiant, String motDePasse, String nom, String prenom) {
		
		Identifiant = identifiant;
		MotDePasse = motDePasse;
		Nom = nom;
		Prenom = prenom;
	}
	public String getIdentifiant() {
		return Identifiant;
	}
	public void setIdentifiant(String identifiant) {
		Identifiant = identifiant;
	}
	public String getMotDePasse() {
		return MotDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		MotDePasse = motDePasse;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	
	
	
}
