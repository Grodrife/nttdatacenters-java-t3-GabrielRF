package nttdata.javat3.business;

public class Employee extends Person {

	private Category category;
	private String project;

	public Employee() {

	}

	public Employee(String dni, String name, Category category, String project) {
		super(dni, name);
		this.category = category;
		this.project = project;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [dni= " + getDni() + ", name= " + getName() + ", category= " + category + ", project= " + project
				+ "]";
	}

}
