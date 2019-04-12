package visualisateur.action;

import java.util.ArrayList;
import java.util.List;

import visualisateur.modele.Exoplanete;

public class AlgorithmeRechercheProfesseurVadeboncoeur extends AlgorithmeRecherche{

	public AlgorithmeRechercheProfesseurVadeboncoeur(List<Exoplanete> listePlanetes) {
		super(listePlanetes);
	}
	public List<Exoplanete> trouverLesPlanetesHabitables(List<Exoplanete> listeExoplanetes)
	{
		// entre 1.6 et 2.4 de flux
		// temperature > 240
		
		List<Exoplanete> listePlanetesSelectionnees = new ArrayList<Exoplanete>();
		
		for(Exoplanete exoplanete : listeExoplanetes)
		{
			float flux = Float.parseFloat(exoplanete.getFlux()); // TODO corriger types du modele
			float temperature = Float.parseFloat(exoplanete.getTemperature()); // TODO corriger types du modele
			
			if(flux >= 1.6 && flux <= 2.4 && temperature > 240)
			{
				listePlanetesSelectionnees.add(exoplanete);
			}
		}
		
		return listePlanetesSelectionnees;
	}
	public List<Exoplanete> trouverLesPlanetesAtteignables(List<Exoplanete> listeExoplanetes)
	{
		return listeExoplanetes;
	}
	public List<Exoplanete> trouverLesPlanetesAnalysables(List<Exoplanete> listeExoplanetes)
	{
		return listeExoplanetes;
	}

}
