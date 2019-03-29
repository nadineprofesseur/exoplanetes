import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;

public class NavigateurDePages extends Application {
	protected PageListeExoplanete pageListeExoplanete;
	protected PageExoplanete pageExoplanete;
	protected Stage stade;
	protected ControleurExoplanete controleur;
	
	public NavigateurDePages()
	{
		NavigateurDePages.instance = this;
		
		try {
			this.pageListeExoplanete = new PageListeExoplanete();
			this.pageExoplanete = new PageExoplanete();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.controleur = new ControleurExoplanete();		
	}

	public PageListeExoplanete getPageListeExoplanete() {
		return pageListeExoplanete;
	}

	// semi-singleton
	protected static NavigateurDePages instance = null;
	public static NavigateurDePages getInstance()
	{
		return instance;
	}
	
	
	@Override
	public void start(Stage stade) throws Exception {
		this.stade = stade;
		this.stade.setScene(this.pageListeExoplanete); // pour dire quelle vue afficher en premier
		//this.pageListeExoplanete.afficherListeExoplanetes("terre + mars");
 		// TODO : activer dans le controleur la premiere vue
		this.stade.show();
		
		//this.naviguerVersPageExoplanete();
		//this.naviguerVersPageListeExoplanete();
	}

	public void naviguerVersPageExoplanete()
	{
		this.stade.setScene(this.pageExoplanete); 	
	}
	
	public void naviguerVersPageListeExoplanete()
	{
		this.stade.setScene(this.pageListeExoplanete); 	
	}
	
	
}
