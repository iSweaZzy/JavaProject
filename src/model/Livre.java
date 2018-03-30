package model;

// TO DO ...
public class Livre extends Document{

	private String auteur;
	private int nbPages;

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
		return "Matricule : "+this.numEnreg+", Titre : "+this.titre+" de "+this.auteur+", Nb de Pages du livre:"+this.nbPages;
	}
}
