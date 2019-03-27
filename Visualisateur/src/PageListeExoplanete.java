import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class PageListeExoplanete extends Page {

	public PageListeExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("liste-exoplanetes.fxml")));
	}

}
