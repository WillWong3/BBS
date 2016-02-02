package bbs.spring.service;

import bbs.hibernate.domain.Admin;

public interface AdminService {
	public void addAdmin(Admin admin);
	public void updateAdminPass(int adminId,String adminPassword);
	public Admin findAdminById(int adminId);
}
