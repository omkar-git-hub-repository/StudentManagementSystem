package student.Utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentHibernateUtility {

	private static SessionFactory factory;

	public static SessionFactory getSessionFactory() {

		if (factory == null) {
			factory = new Configuration().configure("StudentHibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
	}
}
