package editeur.vue;
import java.io.IOException;

import editeur.modele.Exoplanete;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;

public class PageAjouterExoplanete extends Page {

	public PageAjouterExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("ajouter-exoplanete.fxml")));
	}
	
	public Exoplanete lireExoplanete()
	{
		return null;
	}
}
