package mine;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import mine.entity.Users;

public class App3 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Users.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			// Create object of entity class type
			Users user = new Users();
		    // Start transaction
			session.beginTransaction();
		    // Perform operation
			user = session.get(Users.class, 3);
			session.delete(user);
		    // Commit the transaction 
			session.getTransaction().commit();
			
		}finally {
			session.close();
			factory.close();
		}

	}

}
