package nttdata.javat3.business;

public class Student extends Person {

	private String center;
	private Type type;

	public Student() {

	}

	public Student(String dni, String name, String center, Type type) {
		super(dni, name);
		this.setCenter(center);
		;
		this.setType(type);
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Student [dni= " + getDni() + ", name= " + getName() + ", center= " + center + ", type= " + type + "]";
	}

}
