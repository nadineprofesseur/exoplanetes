import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		ExoplaneteDAO exoplaneteDAO = new ExoplaneteDAO();
		exoplaneteDAO.listerExoplanete();
		
		
		Configuration configuration = new Configuration();
		configuration.addClass(Exoplanete.class);
		SessionFactory generateurSession = configuration.buildSessionFactory();
		Session session = generateurSession.openSession();
		
		Iterator listeExoplanete = session.createQuery("from Exoplanete ").iterate();
		while(listeExoplanete.hasNext())
		{
			Exoplanete exoplanete = (Exoplanete)listeExoplanete.next();
			System.out.println("Planete " + exoplanete.getNom());
		}
				
		session.close();
		generateurSession.close();
		
		
	}

}
