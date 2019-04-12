package visualisateur.action;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import visualisateur.modele.Exoplanete;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import visualisateur.donnee.ExoplaneteDAO;
import visualisateur.vue.NavigateurDePages;

public class ControleurExoplanete implements Initializable{

	protected NavigateurDePages navigateur;
	protected ExoplaneteDAO exoplaneteDAO;
	
	public ControleurExoplanete()
	{
		System.out.println("new ControleurExoplanete()");
		
		this.exoplaneteDAO = ExoplaneteDAO.getInstance();
		this.navigateur = NavigateurDePages.getInstance();
	}
	
	public void initialiser()
	{
		this.navigateur.getPageListeExoplanete().afficherListeExoplanetes(exoplaneteDAO.listerExoplanete());	
		
		AlgorithmeRecherche algorithme = new AlgorithmeRechercheProfesseurVadeboncoeur(exoplaneteDAO.listerExoplanete());
		
		// TEST
		List<Exoplanete> planetesTrouvees = algorithme.executer();
		for(Exoplanete planeteTrouvee : planetesTrouvees)
		{
			System.out.println("Planete trouvee " + planeteTrouvee.getNom());
		}
	}
	
	public void recevoirActionNaviguerPageListeExoplanete(ActionEvent evenement)
	{
		this.navigateur.naviguerVersPageListeExoplanete();
	}
	public void recevoirActionNaviguerPageExoplanete(ActionEvent evenement)
	{
		// Recuperer la planete selectionnee dans la page liste
		String nom = this.navigateur.getPageListeExoplanete().lireExoplaneteSelectionnee(); 
		Exoplanete exoplanete = this.exoplaneteDAO.lireExoplaneteSelonNom(nom);
		//System.out.println(exoplanete.getEtoile());
		// Afficher la bonne planete dans la page editer
		this.navigateur.getPageExoplanete().afficherExoplanete(exoplanete);
		
		this.navigateur.naviguerVersPageExoplanete();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
