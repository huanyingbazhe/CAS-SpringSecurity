package org.goja.focus;

import javax.validation.constraints.NotNull;

public class Task {

	@NotNull(message = "Cannot be null")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
