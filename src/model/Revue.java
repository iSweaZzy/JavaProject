package model;

// TO DO ...
public class Revue extends Document{

	private int mois;
	private int annee;
	
	public Revue() {
		this("unknown", 0, 0);
	}
	
	public Revue(String titre, int mois, int annee) {
		super(titre);
		this.mois = mois;
		this.annee = annee;
	}
	public int getMois() {
		return mois;
	}
	
	public void setMois(int mois) {
		this.mois = mois;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public String ToString() {
		return "Matricule : "+this.getNumEnreg()+", Titre : "+this.getTitre()+" de "+this.auteur+", Nb de Pages du livre:"+this.nbPages;
	}
	
}
