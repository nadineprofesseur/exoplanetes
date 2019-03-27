import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;

public class NavigateurDesVues extends Application {
	protected PageListeExoplanete pageListeExoplanete;
	protected Stage stade;
	
	public NavigateurDesVues()
	{
		NavigateurDesVues.instance = this;
		try {
			this.pageListeExoplanete = new PageListeExoplanete();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public PageListeExoplanete getPageListeExoplanete() {
		return pageListeExoplanete;
	}

	// semi-singleton
	protected static NavigateurDesVues instance = null;
	public static NavigateurDesVues getInstance()
	{
		return instance;
	}
	
	
	@Override
	public void start(Stage stade) throws Exception {
		this.stade = stade;
		this.stade.setScene(this.pageListeExoplanete); // TODO FAIT : dire quelle vue afficher en premier
		//this.pageListeExoplanete.afficherListeExoplanetes("terre + mars");
 		// TODO : activer dans le controleur la premiere vue
		this.stade.show();
	}

	
	
	
}
