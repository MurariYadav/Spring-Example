package com.app.admin;

import com.app.user.User;

public class Admin {
	private int AdminId;
	private String AdminName;
	private String AdminLoc;
	private User UserDtls;
	public Admin() {
		super();
	}
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getAdminLoc() {
		return AdminLoc;
	}
	public void setAdminLoc(String adminLoc) {
		AdminLoc = adminLoc;
	}
	public User getUserDtls() {
		return UserDtls;
	}
	public void setUserDtls(User userDtls) {
		UserDtls = userDtls;
	}
	@Override
	public String toString() {
		return "Admin [AdminId=" + AdminId + ", AdminName=" + AdminName + ", AdminLoc=" + AdminLoc + ", UserDtls="
				+ UserDtls + "]";
	}
	
	

}
