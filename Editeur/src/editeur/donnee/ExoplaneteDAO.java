package editeur.donnee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import editeur.modele.Exoplanete;

public class ExoplaneteDAO {
	
	protected Map<String, Exoplanete> planetesSelonNom; // copie de la liste mappée par nom, car le nom est unique - pour un accès rapide
	protected Configuration configuration;
	protected Session session;
	
	protected ExoplaneteDAO()
	{
		this.planetesSelonNom = new HashMap<String, Exoplanete>();		
		this.configuration = new Configuration();
		this.configuration.addClass(editeur.modele.Exoplanete.class);
		SessionFactory generateurSession = this.configuration.buildSessionFactory();
		this.session = generateurSession.openSession();
	}

	// Singleton car le framework instancie plusieurs controleur qui chacun utilisent le dao, on veut la meme session
	// Singleton debut
	protected static ExoplaneteDAO instance = null;
	public static ExoplaneteDAO getInstance() 
	{
		if(instance == null) instance = new ExoplaneteDAO();
		return instance;
	}
	// Singleton fin
	
	public void ajouter(Exoplanete exoplanete)
	{
		//Transaction transaction = session.beginTransaction();
		session.save(exoplanete);
		//transaction.commit();		
	}
	
	public void enregistrer(Exoplanete exoplanete)
	{
		//Transaction transaction = session.beginTransaction();
		session.update(exoplanete);	
		System.out.println("Enregistrer la nouvelle planete " + exoplanete.getNom());
		//transaction.commit();		
	}
	
	public void effacer(int id)
	{
		//Transaction transaction = session.beginTransaction();
		//Exoplanete planeteTermine = new Exoplanete();
		//planeteTermine.setId(id);
		//session.delete(planeteTermine);
		//transaction.commit();		
	}
	
	public List<Exoplanete> listerExoplanete()
	{
		System.out.println("ExoplaneteDAO.listerExoplanete()");
		List<Exoplanete> listeExoplanete = new ArrayList<Exoplanete>();
				
		Iterator visiteurExoplanete = session.createQuery("from Exoplanete ").iterate();
		while(visiteurExoplanete.hasNext())
		{
			Exoplanete exoplanete = (Exoplanete)visiteurExoplanete.next();
			listeExoplanete.add(exoplanete); 
			System.out.println("DAO Planete " + exoplanete.getNom());
		}
				
		//session.close();
		//generateurSession.close();
		
		for(Exoplanete exoplanete : listeExoplanete)
		{
			System.out.println("Initialiser hashmap avec " + exoplanete.getNom());
			this.planetesSelonNom.put(exoplanete.getNom(), exoplanete);
			//Exoplanete exoplanete2 = this.planetesSelonNom.get(exoplanete.getNom());
			//System.out.println(exoplanete2.getNom());
			//System.out.println("Confirmation avec " + this.planetesSelonNom.get(exoplanete.getNom()).getNom());
		}
		System.out.println("Il y a " + this.planetesSelonNom.values().size() + " items");

		
		return listeExoplanete;
	}
	
	public Exoplanete lireExoplaneteSelonNom(String nom)
	{
		this.listerExoplanete(); // todo optimiser
		return this.planetesSelonNom.get(nom);
	}

}
