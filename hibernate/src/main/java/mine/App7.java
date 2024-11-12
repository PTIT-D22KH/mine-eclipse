package mine;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import mine.entity.Users;

public class App7 {

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
			  user = session.get(Users.class, 4);
			  //Deleting a Record with user id 2
			  session.delete(user);
			  
			  // Commit the transaction 
			  session.getTransaction().commit();
			
		}finally { 
			session.close();
			factory.close();
		}

	}

}
