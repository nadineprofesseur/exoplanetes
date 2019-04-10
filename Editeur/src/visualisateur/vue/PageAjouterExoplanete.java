package visualisateur.vue;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import visualisateur.modele.Exoplanete;

public class PageAjouterExoplanete extends Page {

	public PageAjouterExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("ajouter-exoplanete.fxml")));
	}
	
	public Exoplanete lireExoplanete()
	{
		return null;
	}
}
