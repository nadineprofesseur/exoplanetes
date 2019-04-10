package visualisateur.vue;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import visualisateur.modele.Exoplanete;

public class PageEditerExoplanete extends Page {

	public PageEditerExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("editer-exoplanete.fxml")));
	}
	
	public Exoplanete lireExoplanete()
	{
		return null;
	}
	
	public void afficherExoplanete(Exoplanete exoplanete)
	{
		
	}
	
	
}
