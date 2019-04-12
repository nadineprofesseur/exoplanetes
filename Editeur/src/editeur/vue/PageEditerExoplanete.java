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
		TextField champsMasse = (TextField) this.lookup("#champs-masse");
		exoplanete.setMasse(champsMasse.getText());
		champsMasse.setText("");
		TextField champsRayon = (TextField) this.lookup("#champs-rayon");
		exoplanete.setRayon(champsRayon.getText());
		champsRayon.setText("");
		TextField champsFlux = (TextField) this.lookup("#champs-flux");
		exoplanete.setFlux(champsFlux.getText());
		champsFlux.setText("");
		TextField champsTemperature = (TextField) this.lookup("#champs-temperature");
		exoplanete.setTemperature(champsTemperature.getText());
		champsTemperature.setText("");
		TextField champsPeriode = (TextField) this.lookup("#champs-periode");
		exoplanete.setPeriode(champsPeriode.getText());
		champsPeriode.setText("");
		TextField champsDistance = (TextField) this.lookup("#champs-distance");
		exoplanete.setDistance(champsDistance.getText());
		champsDistance.setText("");
		
		//System.out.println("Nouvelle planete " + nom + " dans le soleil " + nom);
		return exoplanete;
	}
	
	public void afficherExoplanete(Exoplanete exoplanete)
	{
		TextField champsNom = (TextField) this.lookup("#champs-nom");
		champsNom.setText(exoplanete.getNom());
		TextField champsEtoile = (TextField) this.lookup("#champs-etoile");
		champsEtoile.setText(exoplanete.getEtoile());
		TextField champsMasse = (TextField) this.lookup("#champs-masse");
		champsMasse.setText(exoplanete.getMasse());
		TextField champsRayon = (TextField) this.lookup("#champs-rayon");
		champsRayon.setText(exoplanete.getRayon());
		TextField champsFlux = (TextField) this.lookup("#champs-flux");
		champsFlux.setText(exoplanete.getFlux());
		TextField champsTemperature = (TextField) this.lookup("#champs-temperature");
		champsTemperature.setText(exoplanete.getTemperature());
		TextField champsPeriode = (TextField) this.lookup("#champs-periode");
		champsPeriode.setText(exoplanete.getPeriode());
		TextField champsDistance = (TextField) this.lookup("#champs-distance");
		champsDistance.setText(exoplanete.getDistance());		
	}
	
	
}
