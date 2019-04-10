package visualisateur.vue;
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import visualisateur.action.ControleurExoplanete;

public class NavigateurDePages extends Application {
	protected PageListeExoplanete pageListeExoplanete;
	protected PageExoplanete pageExoplanete;
	protected PageAjouterExoplanete pageAjouterExoplanete;
	protected PageEditerExoplanete pageEditerExoplanete;
	protected Stage stade;
	protected ControleurExoplanete controleur;
	
	public NavigateurDePages()
	{
		NavigateurDePages.instance = this;
		
		try {
			this.pageListeExoplanete = new PageListeExoplanete();
			this.pageExoplanete = new PageExoplanete();
			this.pageAjouterExoplanete = new PageAjouterExoplanete();
			this.pageEditerExoplanete = new PageEditerExoplanete();
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
		this.controleur.initialiser();
		this.stade = stade;
		this.stade.setScene(this.pageEditerExoplanete); // pour dire quelle vue afficher en premier
		//this.pageListeExoplanete.afficherListeExoplanetes("terre + mars");
 		// TODO : activer dans le controleur la premiere vue
		this.stade.show();
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
