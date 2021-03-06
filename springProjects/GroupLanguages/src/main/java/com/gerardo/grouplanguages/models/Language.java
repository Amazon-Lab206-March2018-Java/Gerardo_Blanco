package com.gerardo.grouplanguages.models;

import javax.validation.constraints.Size;

public class Language {
	
	@Size (min = 2, max = 20)
	private String name;
	@Size (min = 2, max = 20)
	private String creator;
	@Size (min = 1, message = "The Version field is required!")
	private String currentVersion;
	
	public Language () {
		name = "";
		creator = "";
		currentVersion = "";
	}
	
	public Language (String name, String creator, String version) {
		this.name = name;
		this.creator = creator;
		this.currentVersion = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}
}
