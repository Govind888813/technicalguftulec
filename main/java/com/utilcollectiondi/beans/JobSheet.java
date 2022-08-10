package com.utilcollectiondi.beans;

import java.util.List;

public class JobSheet {
	private String name;
	private String contactNo;
	private List<String> skill;
	public void setName(String name) {
		this.name = name;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public void setSkill(List<String> skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "JobSheet [name=" + name + ", contactNo=" + contactNo + ", skill=" + skill + " Implemention Class:"+skill.getClass().getCanonicalName()+"]";
	}

}
