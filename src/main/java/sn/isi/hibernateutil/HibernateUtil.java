package sn.isi.hibernateutil;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import sn.isi.entities.Abonnement;
import sn.isi.entities.Chefdevillage;
import sn.isi.entities.Client;
import sn.isi.entities.Compteur;
import sn.isi.entities.Facture;
import sn.isi.entities.Personne;
import sn.isi.entities.Reglement;
import sn.isi.entities.Role;
import sn.isi.entities.Utilisateur;
import sn.isi.entities.Village;


public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

 				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				settings.put(Environment.URL,
						"jdbc:mysql://localhost:3306/seneforagedbhibernatedb?createDatabaseIfNotExist=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				//cette ligne est très importante
				settings.put(Environment.HBM2DDL_AUTO, "update");
				
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.FORMAT_SQL, "true");

				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Utilisateur.class);
				configuration.addAnnotatedClass(Client.class);
				configuration.addAnnotatedClass(Abonnement.class);
				configuration.addAnnotatedClass(Chefdevillage.class);
				configuration.addAnnotatedClass(Facture.class);
				configuration.addAnnotatedClass(Reglement.class);
				configuration.addAnnotatedClass(Village.class);
				configuration.addAnnotatedClass(Compteur.class);
				configuration.addAnnotatedClass(Role.class);
				configuration.addAnnotatedClass(Personne.class);
				
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
 				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				return sessionFactory;

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}