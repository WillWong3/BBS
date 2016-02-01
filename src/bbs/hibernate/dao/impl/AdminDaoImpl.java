package bbs.hibernate.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import bbs.hibernate.dao.AdminDao;
import bbs.hibernate.domain.Admin;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

	@Override
	public Admin findAdminById(int adminId) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Admin.class, adminId);
	}

	@Override
	public void saveOrUpdateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(admin);
	}

	@Override
	public void deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(admin);
	}
	
}
