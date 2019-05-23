package model;

public enum Colors {
	RED("re"), YELLOW("ge"), GREEN("gr"), BLUE("bu"), BLACK("ba");
	
	private String name;
	
	private Colors(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
