package model;
import java.io.Serializable;
// TO DO ...
public abstract class Document implements Comparable<Object>, Serializable{

	private int numEnreg;
	private String titre;
	private static int count = 0;
	
	public Document(String Titre) {
		this.titre = titre;
		setNumEnreg(++count); 		
	}

	public int getNumEnreg() {
		return numEnreg; 
	}

	public void setNumEnreg(int numEnreg) {
		this.numEnreg = numEnreg;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

}
