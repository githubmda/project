package com.example.bootdemo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EntityProject 
{
	@Id
	private int projectId;
	private String projectName;
	private String dateOfStart;
	private int teamSize;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDateOfStart() {
		return dateOfStart;
	}
	public void setDateOfStart(String dateOfStart) {
		this.dateOfStart = dateOfStart;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}	
}