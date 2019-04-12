package visualisateur.vue;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import visualisateur.modele.Exoplanete;

public class PageExoplanete extends Page {

	public PageExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("exoplanete.fxml")));
	}
	

	public void afficherExoplanete(Exoplanete exoplanete)
	{
		TextArea espaceAffichage = (TextArea)this.lookup("#exoplanete");
		
		String exoplaneteFormatee = "";
		
		exoplaneteFormatee += exoplanete.getNom() + "(rayon=" + exoplanete.getRayon() + ", periode="+exoplanete.getPeriode()+")" + "\n";
		exoplaneteFormatee += exoplanete.getEtoile() + " " + exoplanete.getDistance() + "\n";
		
		espaceAffichage.setText(exoplaneteFormatee);
	}
	
}
