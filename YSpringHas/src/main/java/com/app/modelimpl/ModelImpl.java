package com.app.modelimpl;

import com.app.interfac.IModel;

public class ModelImpl implements IModel{
	private int modId;
	private String modType;
	private String modName;
	public ModelImpl() {
		super();
	}
	public int getModId() {
		return modId;
	}
	public void setModId(int modId) {
		this.modId = modId;
	}
	public String getModType() {
		return modType;
	}
	public void setModType(String modType) {
		this.modType = modType;
	}
	public String getModName() {
		return modName;
	}
	public void setModName(String modName) {
		this.modName = modName;
	}
	@Override
	public String toString() {
		return "ModelImpl [modId=" + modId + ", modType=" + modType + ", modName=" + modName + "]";
	}
	
	

}
