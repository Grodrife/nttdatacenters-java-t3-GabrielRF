package nttdata.javat3;

import nttdata.javat3.business.Category;
import nttdata.javat3.business.ManagementServiceI;
import nttdata.javat3.business.ManagementServiceImpl;
import nttdata.javat3.business.Type;

/**
 * Hello world!
 *
 */
public class T3MainGabrielRF {
	public static void main(String[] args) {
		
		final ManagementServiceI register = new ManagementServiceImpl();
		
		register.addPerson("Student", "11111111A", "Paco", "Hnos Machado", Type.DAM, null, null);
		register.addPerson("Student", "22222222B", "Marta", "Hnos Machado", Type.DAW, null, null);
		register.addPerson("Student", "33333333C", "Luis", "Hnos Machado", Type.DAW, null, null);
		register.addPerson("Student", "44444444D", "Juan", "Hnos Machado", Type.DAM, null, null);
		register.addPerson("Employee", "55555555E", "Andres", null, null, "Proyecto1", Category.ANL_SENIOR);
		register.addPerson("Employee", "66666666F", "Laura", null, null, "Proyecto2", Category.ANL_JUNIOR);
		register.addPerson("Employee", "77777777G", "Maria", null, null, "Proyecto3", Category.DEV_SENIOR);
		register.addPerson("Employee", "88888888H", "Manuel", null, null, "Proyecto4", Category.DEV_JUNIOR);
		
		register.showPeople();
		System.out.println("\n\n");
		register.showStudents();
		System.out.println("\n");
		register.showEmployees();
		System.out.println("\n");
		register.showPeopleOrg();
	}
}
