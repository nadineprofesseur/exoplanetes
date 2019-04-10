package editeur.vue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import editeur.modele.Exoplanete;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class PageListeExoplanete extends Page {

	public PageListeExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("liste-exoplanetes.fxml")));		
	}
	public void afficherListeExoplanetes(List<Exoplanete> listeExoplanetes)
	{
		ObservableList<String> items = FXCollections.observableArrayList ();
		ListView grilleDesPlanetes = (ListView) this.lookup("#liste-exoplanetes");
		for(Exoplanete exoplanete : listeExoplanetes)
		{
			items.add(exoplanete.getNom());
			//espaceTexte.appendText(exoplanete.getNom() + "\n");					
		}
		grilleDesPlanetes.setItems(items);
	}

	public String lireExoplaneteSelectionnee()
	{
		ListView grilleDesPlanetes = (ListView) this.lookup("#liste-exoplanetes");
		return grilleDesPlanetes.getSelectionModel().getSelectedItem().toString();		
	}
	
}
