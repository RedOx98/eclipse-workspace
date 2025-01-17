package org.olahammed;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.olahammed.entity.Users;

public class App {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Users.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
//			Create object of entity class type
//			Users user = new Users("username", "first_name", "last_name", "password");
			Users user = new Users();
			
//			Start txn.
			session.beginTransaction();
//			List<Users> users = 
//					session.createQuery("update user set password = '1456789000' "
//					+ "where username like '%me%'").executeUpdate();
//					+ "last_name like '%me%'")getResultList()
			
//			for (Users temp : users) {
//				System.out.println(temp);
//			}
//			Perform operation
			
//			session.save(user);
			user = session.get(Users.class, 1);
//			user.setPassword("password123#");
			session.delete(user);
//			Commit the txn.
			session.getTransaction().commit();
//			System.out.println("user deleted!");
//			System.out.println(user);
//			System.out.println("Row added!");
		} finally {
			session.close();
			factory.close();
		}
	}

}
