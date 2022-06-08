package nttdata.javat3.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ManagementServiceImpl implements ManagementServiceI {

	private Map<Integer, Person> peopleMap = new HashMap<Integer, Person>();

	/**
	 * Método para anyadir persona al registro
	 */
	@Override
	public void addPerson(String personType, String dni, String name, String center, Type type, String project,
			Category category) {

		if (personType.equals("Student")) {
			Student newStudent = new Student(dni, name, center, type);
			peopleMap.put(peopleMap.size() + 1, newStudent);
		} else if (personType.equals("Employee")) {
			Employee newEmployee = new Employee(dni, name, category, project);
			peopleMap.put(peopleMap.size() + 1, newEmployee);
		}
	}

	/**
	 * Método para mostrar todas las personas almacenadas en el registro
	 */
	@Override
	public void showPeople() {
		for (Person p : this.peopleMap.values()) {
			System.out.println(p.toString());
		}

	}

	/**
	 * Método para mostrar todos los estudiantes del registro
	 */
	public void showStudents() {
		for (Person p : this.peopleMap.values()) {
			if (p.getClass() == Student.class) {
				System.out.println(p.toString());
			}
		}
	}

	/**
	 * Método para mostrar todos los empleados del registro
	 */
	public void showEmployees() {
		for (Person p : this.peopleMap.values()) {
			if (p.getClass() == Employee.class) {
				System.out.println(p.toString());
			}
		}
	}

	/**
	 * Método para mostrar todas las personas del registro organizadas por tipo de persona(Estudiante o empleado)
	 */
	public void showPeopleOrg() {

		Map<String, ArrayList<Person>> organizatedMap = new HashMap<String, ArrayList<Person>>();
		organizatedMap.put("Student", new ArrayList<Person>());
		organizatedMap.put("Employee", new ArrayList<Person>());
		for (Person p : this.peopleMap.values()) {
			if (p.getClass() == Student.class) {
				organizatedMap.get("Student").add(p);
			} else {
				organizatedMap.get("Employee").add(p);
			}
		}

		for (String t : organizatedMap.keySet()) {
			System.out.println(t + "\n");
			for (Person p : organizatedMap.get(t)) {
				System.out.println(p.toString() + "\n");
			}
		}
	}
}
