package editeur.vue;
import java.io.IOException;

import editeur.modele.Exoplanete;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;

public class PageEditerExoplanete extends Page {

	public PageEditerExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("editer-exoplanete.fxml")));
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
	
	public void afficherExoplanete(Exoplanete exoplanete)
	{
		TextField champsNom = (TextField) this.lookup("#champs-nom");
		champsNom.setText(exoplanete.getNom());
		TextField champsEtoile = (TextField) this.lookup("#champs-etoile");
		champsEtoile.setText(exoplanete.getEtoile());
		
		// TODO afficher tous les champs
		
	}
	
	
}
