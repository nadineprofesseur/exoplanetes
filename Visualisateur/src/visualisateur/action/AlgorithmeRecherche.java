package visualisateur.action;

import java.util.List;

import visualisateur.modele.Exoplanete;

public class AlgorithmeRecherche {

	protected List<Exoplanete> listePlanetesOriginales = null;
	protected List<Exoplanete> listePlanetesFiltrees = null;
	
	public AlgorithmeRecherche(List<Exoplanete> listePlanetes)
	{
		this.listePlanetesFiltrees = this.listePlanetesOriginales = listePlanetes;
	}
	
	public void executer()
	{
		this.listePlanetesFiltrees = this.trouverLesPlanetesHabitables(this.listePlanetesFiltrees);
		this.listePlanetesFiltrees = this.trouverLesPlanetesAtteignables(this.listePlanetesFiltrees);
		this.listePlanetesFiltrees = this.trouverLesPlanetesAnalysables(this.listePlanetesFiltrees);
	}
	
	public List<Exoplanete> trouverLesPlanetesHabitables(List<Exoplanete> listeExoplanetes)
	{
		return listeExoplanetes;
	}
	public List<Exoplanete> trouverLesPlanetesAtteignables(List<Exoplanete> listeExoplanetes)
	{
		return listeExoplanetes;
	}
	public List<Exoplanete> trouverLesPlanetesAnalysables(List<Exoplanete> listeExoplanetes)
	{
		return listeExoplanetes;
	}
	
	
	/*
	public void filtrerSelonHabitabilite()
	{
		
	}
	
	public void filtrerSelonAtteignabilite()
	{
		
	}
	
	public void filtrerSelonAnalysabilite()
	{
		
	}*/
}
