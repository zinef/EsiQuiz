package model;
import java.util.*;
/**
 * 
 * @author Rezak
 *
 */
public class Formation {

	private String nom;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	private ArrayList<Apprenant> apprenants=new ArrayList<Apprenant>();
	private ArrayList<Quiz> quizz=new ArrayList<Quiz>();
	//private Formateur formateur; facultatif
	private ArrayList<Notion> notions=new ArrayList<Notion>();
	
	
	
	/*
	public Quiz[] getQuizz() {
		return quizz;
	}
	public void setQuizz(Quiz[] quizz) {
		this.quizz = quizz;
	}
	public Notion[] getNotions() {
		return notions;
	}
	public void setNotions(Notion[] notions) {
		this.notions = notions;
	}*/
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
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	public Formation(String nom, String description, Date dateDebut, Date dateFin) {
		super();
		this.nom = nom;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		
	}
	//Ajouter apprenant 
	/**
	 * 
	 * @param apprenant: l'apprenant a ajouter
	 * @return false si erreur 
	 */
	public boolean ajoutApprenant(Apprenant apprenant)
	{
		if (apprenant!= null) {
			
			this.apprenants.add(apprenant);
			
		}else {//Erreur
			}
		return false;
	}
	
	public boolean suppApprenant(int index)
	{
		apprenants.remove(index);	
		return true;
	}
	
	public boolean majApprenant(int index,Apprenant apprenant) {
		apprenants.set(index, apprenant);
		return true;
		
	}
	//Ajouter des Notions
	/**
	 * 
	 * @param notion: la notion a ajouter 
	 * @return false si erreur
	 */
	public boolean ajoutNotions(Notion notion) {
		if (notion!= null) {
			this.notions.add(notion);
			
			return true;
		}else {//Erreur
			}
		return false;
	}
	public boolean suppNotions(int index)
	{
		notions.remove(index);	
		return true;
	}
	public boolean majNotion(int index,Notion not) {
		notions.set(index, not);
		return true;
		
	}
	//Ajouter un Quiz
	/**
	 * 
	 * @param quiz: le quiz a ajouter 
	 * @return false si erreur
	 */
	public boolean ajoutQuiz(Quiz quiz) {
		if (quiz!= null) {
			this.quizz.add(quiz);
		}else {//Erreur
			}
		return false;
	}
	
	public boolean suppQuiz(int index)
	{
		quizz.remove(index);	
		return true;
	}
	public boolean majQuiz(int index,Quiz quiz) {
		quizz.set(index, quiz);
		return true;
		
	}
	
	public void afficheNotions() {
		int i=1;
		for(Notion n:notions) {
			System.out.println(i+ "- "+n.getDescriptionNotion());
			i++;
		}
	}
	public void afficheApprenants() {
		int i=1;
		
		for(Apprenant appr:apprenants ) {
			System.out.println(i+"- "+appr.getIdentifiant()+"\t"+appr.getMotDePasse()+"\t"+appr.getNom()+"\t"+appr.getPrenom());
			i++;
		}
	}
	public void affichequiz() {
		
	}
}