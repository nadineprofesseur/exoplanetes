import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;

public class PageListeExoplanete extends Page {

	public PageListeExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("liste-exoplanetes.fxml")));
		
		TextArea espaceTexte = (TextArea) this.lookup("#liste-exoplanetes");
		espaceTexte.appendText("coucou");
	}
	

}
