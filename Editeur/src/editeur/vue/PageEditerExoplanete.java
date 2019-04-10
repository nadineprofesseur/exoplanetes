package editeur.vue;
import java.io.IOException;

import editeur.modele.Exoplanete;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;

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
