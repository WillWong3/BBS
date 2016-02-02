package bbs.spring.service.impl;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import bbs.hibernate.dao.AdminDao;
import bbs.hibernate.domain.Admin;
import bbs.spring.service.AdminService;
@Transactional(readOnly=false)//表示为可读写事务类型

public class AdminServiceImpl implements AdminService {

	@Resource private AdminDao adminDao;
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
	adminDao.saveOrUpdateAdmin(admin);
		
	}

	@Override
	public void updateAdminPass(int adminId, String adminPassword) {
		// TODO Auto-generated method stub
		Admin admin = findAdminById(adminId);
		admin.setAdminPassword(adminPassword);
		adminDao.saveOrUpdateAdmin(admin);
	}

	@Override
	public Admin findAdminById(int adminId) {
		// TODO Auto-generated method stub
		return adminDao.findAdminById(adminId);
	}

}
