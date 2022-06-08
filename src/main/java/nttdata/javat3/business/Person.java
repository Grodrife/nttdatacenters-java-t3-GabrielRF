package nttdata.javat3.business;

import java.util.Objects;

public class Person {

	private String dni;
	private String name;
	
	public Person() {
		
	}
	
	public Person(String dni, String name) {
		super();
		this.dni = dni;
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Person [dni=" + dni + ", name=" + name + "]";
	}
	
	
}
