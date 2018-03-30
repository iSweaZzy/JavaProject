package controller;

import model.Bibliotheque;
import model.Document;
import model.Livre;
import model.Manuel;
import model.Revue;
import model.Roman;

import java.util.Collection;

public class TestDocuments {

	/**
	 * Programme de test.
	 */
	public static void main(String[] args) {
		
		System.out.print("Test");
		Bibliotheque B = new Bibliotheque();
		
		B.addDocument(new Livre("L'archipel du Goulag", "Soljenitsyne", 250));
		Document[] documents = {
				// new Roman("Rouge Br�sil", "Rufin", 120, Roman.GONCOURT),
				// new Revue("Le point", 03, 2014),
				// new Roman("Le mendiant", "Wiesel", 150, Roman.MEDICIS),
				// new Livre("La condition humaine", "Malraux", 130),
				// new Manuel("Manuel qualit� ISO 9001", "AFNOR", -1, 3)
		};

		for (Document doc : documents) {
			System.out.println(doc);
		}

	}

}
