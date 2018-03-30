package model;

// TO DO ...
public class Livre extends Document{

	private String auteur;
	private int nbPages;


	public Livre() {
		this("unknown", "unknown", 0);
	}
	
	public Livre(String titre, String auteur, int nbPages) {
		super(titre);
		this.auteur = auteur;
		this.nbPages = nbPages;
	}
	
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	public String ToString() {
		return "Matricule : "+this.getNumEnreg()+", Titre : "+this.getTitre()+" de "+this.auteur+", Nb de Pages du livre:"+this.nbPages;
	}
}
