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
		TextField masseEtoile = (TextField) this.lookup("#champs-masse");
		exoplanete.setEtoile(masseEtoile.getText());
		masseEtoile.setText("");
		TextField rayonEtoile = (TextField) this.lookup("#champs-rayon");
		exoplanete.setEtoile(rayonEtoile.getText());
		rayonEtoile.setText("");
		TextField fluxEtoile = (TextField) this.lookup("#champs-flux");
		exoplanete.setEtoile(fluxEtoile.getText());
		fluxEtoile.setText("");
		TextField temperatureEtoile = (TextField) this.lookup("#champs-temperature");
		exoplanete.setEtoile(temperatureEtoile.getText());
		temperatureEtoile.setText("");
		TextField periodeEtoile = (TextField) this.lookup("#champs-periode");
		exoplanete.setEtoile(periodeEtoile.getText());
		periodeEtoile.setText("");
		TextField distanceEtoile = (TextField) this.lookup("#champs-distance");
		exoplanete.setEtoile(distanceEtoile.getText());
		distanceEtoile.setText("");
		
		//System.out.println("Nouvelle planete " + nom + " dans le soleil " + nom);
		return exoplanete;
	}
}
