package bbs.hibernate.dao;
/**
 * 
 */
import bbs.hibernate.domain.Admin;

public interface AdminDao {
	//�������Ա���ݽӿ�
	public Admin findAdminById(int adminId);
	public void saveOrUpdateAdmin(Admin admin);
	public void deleteAdmin(Admin admin);
}
