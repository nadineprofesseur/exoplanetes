import java.util.List;

import visualisateur.action.AlgorithmeRecherche;
import visualisateur.action.AlgorithmeRechercheProfesseurTournesol;
import visualisateur.action.AlgorithmeRechercheProfesseurVadeboncoeur;
import visualisateur.donnee.ExoplaneteDAO;
import visualisateur.modele.Exoplanete;
import visualisateur.vue.NavigateurDePages;

public class App {

	public static void main(String[] parametres) {
		
		//NavigateurDePages.launch(NavigateurDePages.class, parametres);
		List<Exoplanete> listeExoplanetes;
		
		AlgorithmeRecherche algorithmeTournesol = new AlgorithmeRechercheProfesseurTournesol(ExoplaneteDAO.getInstance().listerExoplanete());
		listeExoplanetes = algorithmeTournesol.executer();
		// for + afficher
		AlgorithmeRecherche algorithmeVadeboncoeur = new AlgorithmeRechercheProfesseurVadeboncoeur(ExoplaneteDAO.getInstance().listerExoplanete());
		listeExoplanetes = algorithmeTournesol.executer();
		
	}

}
