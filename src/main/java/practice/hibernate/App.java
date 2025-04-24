package practice.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();

		Person p = new Person();
		
		Aadhar ac = new Aadhar(1111, "Apoorva", "btm", "female", p);
		
		p.setId(101);
		p.setNickname("Apoo");
		p.setCard(ac);
		
		sess.persist(p);
		sess.persist(ac);

		sess.getTransaction().commit();
	}
}