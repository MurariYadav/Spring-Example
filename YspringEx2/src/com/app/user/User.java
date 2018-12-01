package com.app.user;

public class User {
	private int UserId;
	private String UserName;
	private String UserLoc;
	public User() {
		super();
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserLoc() {
		return UserLoc;
	}
	public void setUserLoc(String userLoc) {
		UserLoc = userLoc;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserName=" + UserName + ", UserLoc=" + UserLoc + "]";
	}	
	
}
