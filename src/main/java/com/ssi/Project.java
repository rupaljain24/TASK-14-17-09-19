package com.ssi;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pId;
	private String pName;
	private String pCompanyName;
	
	public Project() {
		super();
	}

	public Project(int pId) {
		super();
		this.pId = pId;
	}

	public Project(int pId, String pName, String pCompanyName, List<Emp> empList) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCompanyName = pCompanyName;
		this.empList = empList;
	}

	@ManyToMany(mappedBy = "project")
	private List<Emp> empList=new ArrayList<Emp>();

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCompanyName() {
		return pCompanyName;
	}

	public void setpCompanyName(String pCompanyName) {
		this.pCompanyName = pCompanyName;
	}

	public List<Emp> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Emp> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", pCompanyName="
				+ pCompanyName + "]";
	}

	public Project(int pId, String pName, String pCompanyName) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCompanyName = pCompanyName;
		
	}
	
	

	
	
	
	
}
