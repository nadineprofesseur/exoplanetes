package editeur.vue;
import java.io.IOException;

import editeur.modele.Exoplanete;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PageAjouterExoplanete extends Page {

	public PageAjouterExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("ajouter-exoplanete.fxml")));
	}
	
	public Exoplanete lireExoplanete()
	{		
		Exoplanete exoplanete = new Exoplanete();
	
		TextField champsNom = (TextField) this.lookup("#champs-nom");
		String nom = champsNom.getText();
		exoplanete.setNom(nom);
		TextField champsEtoile = (TextField) this.lookup("#champs-etoile");
		String etoile = champsEtoile.getText();
		exoplanete.setEtoile(etoile);
		
		//System.out.println("Nouvelle planete " + nom + " dans le soleil " + nom);
		return exoplanete;
	}
}
