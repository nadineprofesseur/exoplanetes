import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;

public class PageListeExoplanete extends Page {

	public PageListeExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("liste-exoplanetes.fxml")));		
	}
	public void afficherListeExoplanetes(List<Exoplanete> listeExoplanetes)
	{
		TextArea espaceTexte = (TextArea) this.lookup("#liste-exoplanetes");
		for(Exoplanete exoplanete : listeExoplanetes)
		{
			espaceTexte.appendText(exoplanete.getNom() + "\n");					
		}
	}


}
