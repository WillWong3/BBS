package bbs.hibernate.dao;
/**
 * 
 */
import bbs.hibernate.domain.Admin;

public interface AdminDao {
	//定义管理员数据接口
	public Admin findAdminById(int adminId);
	public void saveOrUpdateAdmin(Admin admin);
	public void deleteAdmin(Admin admin);
}
