package mine;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import mine.entity.Users;

public class App5 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Users.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
		    List<Users> users = session.createQuery("from users where username='VUCONGTUANDUONG' OR "
		    		+ "password like '%123'").getResultList();
			for (Users temp : users) {
				System.out.println(temp);
			}
		}finally { 
			session.close();
			factory.close();
		}

	}

}
