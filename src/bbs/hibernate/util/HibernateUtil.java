package bbs.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {
	private static ServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	private HibernateUtil(){}
	static{
		Configuration cfg=new Configuration().configure();
		serviceRegistry=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		sessionFactory=cfg.buildSessionFactory(serviceRegistry);
	}
	public static Session getSession(){
		Session session=sessionFactory.getCurrentSession();
		return session;
	}

}
