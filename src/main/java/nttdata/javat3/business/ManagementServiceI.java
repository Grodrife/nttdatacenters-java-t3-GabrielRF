package nttdata.javat3.business;

public interface ManagementServiceI {

	public void addPerson(String personType, String dni, String name, String center, Type type, String project, Category category);
	
	public void showPeople();
	
	public void showStudents();
	
	public void showEmployees();
	
	public void showPeopleOrg();
}
