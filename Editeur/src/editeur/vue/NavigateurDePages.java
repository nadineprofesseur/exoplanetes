package editeur.vue;
import java.io.IOException;

import editeur.action.ControleurExoplanete;
import javafx.application.Application;
import javafx.stage.Stage;

public class NavigateurDePages extends Application {
	protected PageListeExoplanete pageListeExoplanete;
	protected PageAjouterExoplanete pageAjouterExoplanete;
	protected PageEditerExoplanete pageEditerExoplanete;
	protected Stage stade;
	protected ControleurExoplanete controleur;
	
	public NavigateurDePages()
	{
		NavigateurDePages.instance = this;
		
		try {
			this.pageListeExoplanete = new PageListeExoplanete();
			this.pageAjouterExoplanete = new PageAjouterExoplanete();
			this.pageEditerExoplanete = new PageEditerExoplanete();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.controleur = new ControleurExoplanete();		
	}
	
	public PageAjouterExoplanete getPageAjouterExoplanete() {
		return pageAjouterExoplanete;
	}

	public PageEditerExoplanete getPageEditerExoplanete() {
		return pageEditerExoplanete;
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
		this.stade.setScene(this.pageListeExoplanete); // pour dire quelle vue afficher en premier
		//this.pageListeExoplanete.afficherListeExoplanetes("terre + mars");
 		// TODO : activer dans le controleur la premiere vue
		this.stade.show();
	}

	public void naviguerVersPageAjouter()
	{
		this.stade.setScene(this.pageAjouterExoplanete); 	
	}

	public void naviguerVersPageEditer()
	{
		// determiner quelle est la planete selectionnee
		// charger les donnees
		// afficher les donnees dans la page editer
		this.stade.setScene(this.pageEditerExoplanete); 	
	}
	
	public void naviguerVersPageListeExoplanete()
	{
		this.stade.setScene(this.pageListeExoplanete); 	
	}
	
	
}
