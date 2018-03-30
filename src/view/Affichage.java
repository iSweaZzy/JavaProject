package view;

/**
 * Utilitaires d'affichage
 */
public class Affichage {

	// TO DO ...
	void afficherDocuments(Collection<Document> docs) {
		for(int i = 0, i < docs.size(); i++)
			System.out.println(Bibliiotheque.getDocument(i));
	}
}
