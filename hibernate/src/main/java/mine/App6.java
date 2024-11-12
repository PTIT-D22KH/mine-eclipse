package mine;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import mine.entity.Users;

public class App6 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Users.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
		    session.createQuery("update users set password = 'vucongtuanduong' "
		    		+ "where password like '%password%'").executeUpdate();
			
		}finally { 
			session.close();
			factory.close();
		}

	}

}
