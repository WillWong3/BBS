package bbs.struts2.action;

import java.util.Map;

import javax.annotation.Resource;



import com.opensymphony.xwork2.ActionContext;

import bbs.hibernate.domain.Admin;
import bbs.spring.service.AdminService;

public class LoginAction {
	@Resource private AdminService adminService;
	
	private Admin admin;
	
	private int id;
	private String name;
	private String password;
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//π‹¿Ì‘±µ«¬ºmethod
	public String AdminLogin(){
		ActionContext ctx=ActionContext.getContext();
		Map session=ctx.getSession();
		admin=adminService.findAdminById(id);
		if ((admin!=null)&&(password.equals(admin.getAdminPassword()))) {
			session.put("user",admin);
			return "admin";
		}
		return "adminLogin";
	}
	
}
