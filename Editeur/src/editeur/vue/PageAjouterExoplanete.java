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
		exoplanete.setNom(champsNom.getText());
		champsNom.setText(""); // remet le champs à vide pour la prochaine
		TextField champsEtoile = (TextField) this.lookup("#champs-etoile");
		exoplanete.setEtoile(champsEtoile.getText());
		champsEtoile.setText("");

		// TODO lire et vider tous les champs
		
		//System.out.println("Nouvelle planete " + nom + " dans le soleil " + nom);
		return exoplanete;
	}
}
